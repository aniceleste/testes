package trabajo_testes;

public class Carro {
    private String marca;
    private int ano;
    private String cor;
    private String placa;
    private double quilometragem;
    private Suspensao suspensao;
    private Freios freios;
    private Luzes luzes;
    private SistemaDeDirecao sistemaDeDirecao;
    private SistemaDeCombustivel sistemaDeCombustivel;
    private Motor motor;
    private SistemaDeTransmissao transmissao;
    private SistemaEletrico sistemaEletrico;
    private Pneus pneus;
    private Painel painel;
    private Portas portas;
    private Bancos bancos;

    // Constructor
    public Carro(String marca, int ano, String cor, String placa, double quilometragem,
            Suspensao suspensao, Freios freios, Luzes luzes, SistemaDeDirecao sistemaDeDirecao,
                SistemaDeCombustivel sistemaDeCombustivel, Motor motor, 
                SistemaDeTransmissao transmissao, SistemaEletrico sistemaEletrico,
                Pneus pneus, Painel painel, Portas portas, Bancos bancos) {
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
        this.quilometragem = quilometragem;
        this.suspensao = suspensao;
        this.freios = freios;
        this.luzes = luzes;
        this.sistemaDeDirecao = sistemaDeDirecao;
        this.sistemaDeCombustivel = sistemaDeCombustivel;
        this.motor = motor;
        this.transmissao = transmissao;
        this.sistemaEletrico = sistemaEletrico;
        this.pneus = pneus;
        this.painel = painel;
        this.portas = portas;
        this.bancos = bancos;
    }

    public void ligar() {
        motor.ligar();
        luzes.ligar();
        // Lógica adicional si es necesaria
    }
    
    public void desligar() {
        motor.desligar();
        luzes.desligar();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public Suspensao getSuspensao() {
        return suspensao;
    }

    public void setSuspensao(Suspensao suspensao) {
        this.suspensao = suspensao;
    }

    public Freios getFreios() {
        return freios;
    }

    public void setFreios(Freios freios) {
        this.freios = freios;
    }

    public Luzes getLuzes() {
        return luzes;
    }

    public void setLuzes(Luzes luzes) {
        this.luzes = luzes;
    }

    public SistemaDeDirecao getSistemaDeDirecao() {
        return sistemaDeDirecao;
    }

    public void setSistemaDeDirecao(SistemaDeDirecao sistemaDeDirecao) {
        this.sistemaDeDirecao = sistemaDeDirecao;
    }

    public SistemaDeCombustivel getSistemaDeCombustivel() {
        return sistemaDeCombustivel;
    }

    public void setSistemaDeCombustivel(SistemaDeCombustivel sistemaDeCombustivel) {
        this.sistemaDeCombustivel = sistemaDeCombustivel;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public SistemaDeTransmissao getTransmissao() {
        return transmissao;
    }

    public void setTransmissao(SistemaDeTransmissao transmissao) {
        this.transmissao = transmissao;
    }

    public SistemaEletrico getSistemaEletrico() {
        return sistemaEletrico;
    }

    public void setSistemaEletrico(SistemaEletrico sistemaEletrico) {
        this.sistemaEletrico = sistemaEletrico;
    }

    public Pneus getPneus() {
        return pneus;
    }

    public void setPneus(Pneus pneus) {
        this.pneus = pneus;
    }

    public Painel getPainel() {
        return painel;
    }

    public void setPainel(Painel painel) {
        this.painel = painel;
    }

    public Portas getPortas() {
        return portas;
    }

    public void setPortas(Portas portas) {
        this.portas = portas;
    }

    public Bancos getBancos() {
        return bancos;
    }

    public void setBancos(Bancos bancos) {
        this.bancos = bancos;
    }


}

