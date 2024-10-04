package trabajo_testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
    private Motor motor;
    private SistemaEletrico sis;
    private SistemaDeCombustivel com;
    private Bancos ban;
    private Carro car;
    private Freios fre;
    private Luzes luz;
    private Painel pa;
    private Pneus pn;
    private Portas por;
    private SistemaDeTransmissao tran;
    private Suspensao sus;
    private SistemaDeDirecao dire;

    @BeforeEach
    public void setUp() {
        motor = new Motor("V8", 500, 4.0, "Ferrari", true);
        com = new SistemaDeCombustivel("Gasolina", 50.0, 5.0, "Bosch", true, null);
        sis = new SistemaEletrico(10.0, 100.0, "Íon-Lítio", true, "Tesla");
        sus = new Suspensao("Independente", "Alumínio", 15.0, 7, "Bosch", null);
        fre = new Freios("Disco", "Cerâmica", 14.0, "Brembo", 0.2);
        luz = new Luzes("LED", 100, "Branca", true, "Philips");
        dire = new SistemaDeDirecao("Hidráulico", true, "Plástico", 15.0, "TRW");
        tran = new SistemaDeTransmissao("Automática", 6, "Aço", "ZF", true);
        pn = new Pneus("18 polegadas", "Esportivo", 32.0, "Pirelli", "Novo");
        pa = new Painel("Digital", "LCD", true, "Bosch", false);
        por = new Portas(4, "Aço", "Preta", "Automática", false);
        ban = new Bancos(5, "Couro", "Preto", "Esportivo", "Novo");
        car = new Carro("Ferrari", 2022, "Vermelho", "ABC-1234", 0.0, true);

    }

    @Test
    public void Testeligarcar() {
        car.ligar(motor, sis, com);
        assertTrue(car.isEstado());
    }

    @Test
    public void testligar() {
        motor.ligar(sis, com);
        assertTrue(motor.isEstado());
    }

    @Test
    public void esquentabancoTest() {
        ban.esquentarbanco(sis, 20);
        assertEquals(20, ban.getTemperatura());
        ban.esquentarbanco(sis, 25);
        assertEquals(25, ban.getTemperatura());
    }

    @Test
    public void direcaoAutomaticaTest() {
        assertFalse(dire.isAutomatico());
        dire.AtivarModoPilotoAutomatico(sis);
        assertTrue(dire.isAutomatico());
        dire.DesativarModoPilotoAutomatico(sis);
        assertFalse(dire.isAutomatico());
    }

    @Test
    public void PortasEConexaoComLuzesTest() {
        por.abrir(luz, sis);
        assertTrue(por.getEstado(), "As portas devem estar abertas.");
        assertTrue(luz.isEstado(), "As luzes devem estar ligadas quando as portas estão abertas.");

        por.fechar(luz, sis);
        assertFalse(por.getEstado(), "As portas devem estar fechadas.");
        assertFalse(luz.isEstado(), "As luzes devem estar desligadas quando as portas estão fechadas.");
    }

    @Test
    public void testAjustarAlturaSuspensao() {
        Suspensao suspensao = new Suspensao("Independente", "Alumínio", 15.0, 7, "Bosch", null);
        suspensao.ajustarAltura(sis, 18.0);
        assertEquals(18.0, suspensao.getAltura(), "La altura de la suspensión debería ser 18.0");
    }

    @Test
    public void testBanco() {
        Bancos bancos = new Bancos(2, "couro", "bege", "Aquecido", "Reclinado");
        bancos.ajustarEncosto("Reto");
        assertNotSame("Reto", bancos.getEstado());
    }

    @Test
    public void testAbastecerTanque() {
        SistemaDeCombustivel sistemaDeCombustivel = new SistemaDeCombustivel("Gasolina", 50.0, 5.0, "Bosch", true,
                null);
        // sistemaDeCombustivel.abastecer(10.0);
        assertEquals(15.0, sistemaDeCombustivel.verificarNivel(), 0.01,
                "El nivel de combustible debería ser de 15 litros.");
        // sistemaDeCombustivel.abastecer(20.0);
        assertEquals(35.0, sistemaDeCombustivel.verificarNivel(), 0.01,
                "El nivel de combustible debería ser de 35 litros.");
    }

    @Test
    public void testTanqueVacio() {
        SistemaDeCombustivel sistemaDeCombustivel = new SistemaDeCombustivel("Gasolina", 50.0, null, "Bosch", true,
                null);
        assertNull(sistemaDeCombustivel.getNivelDeCombustivel());

    }

    @Test
    public void testVerificarEstadoSuspensao() {
        Suspensao suspensao = new Suspensao("Independente", "Alumínio", 15.0, 7, "Bosch", null);

        assertEquals("Estado da suspensão: OK", suspensao.verificarEstado(),
                "El estado de la suspensión debería ser OK.");
    }

    @Test
    public void testTrocaMarcha() {
        SistemaDeTransmissao transmissao = new SistemaDeTransmissao("Automática", 6, "Aço", "ZF", true);

        transmissao.trocarMarcha(3);

        assertTrue(transmissao.verificarEstado().contains("funcionando"), "La transmisión debería estar funcionando.");
    }

    @Test
    public void testVerificarEstadoTransmissao() {
        SistemaDeTransmissao transmissao = new SistemaDeTransmissao("Automática", 6, "Aço", "ZF", false);

        assertEquals("Sistema de transmissão está desligado.", transmissao.verificarEstado(),
                "La transmisión debería estar apagada.");
    }

    @Test
    public void testVerificarDesgasteFreios() {
        Freios freios = new Freios("Disco", "Cerâmica", 14.0, "Brembo", 0.2);

        assertEquals(0.2, freios.verificarDesgaste(), 0.01, "El desgaste inicial debería ser de 0.2.");

        freios.substituirPastilhas();
        assertTrue(freios.verificarDesgaste() <= 0.2, "Después de la sustitución, el desgaste debería ser bajo.");
    }

    @Test
    public void testAjustarFreio() {
        Freios freios = new Freios("Disco", "Cerâmica", 14.0, "Brembo", 0.2);

        freios.ajustarFreio();

        assertNotNull(freios, "El sistema de frenos no debería ser nulo después del ajuste.");
    }

    @Test
    public void testAbrirFecharPortas() {
        Portas portas = new Portas(4, "Aço", "Preta", "Automática", false);

        portas.abrir();
        assertEquals("aberta", portas.verificarEstado().split(": ")[1], "La puerta debería estar abierta.");

        portas.fechar();
        assertEquals("fechada", portas.verificarEstado().split(": ")[1], "La puerta debería estar cerrada.");
    }

    @Test
    public void testVerificarEstadoPortas() {
        Portas portas = new Portas(4, "Aço", "Preta", "Automática", false);

        assertEquals("Estado da porta: Fechada", portas.verificarEstado(), "La puerta debería estar cerrada.");
    }

}
