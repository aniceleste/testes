package trabajo_testes;

public class Motor {

    private String tipo;
    private int potencia;
    private double cilindrada;
    private String marca;
    private boolean estado;
    private SistemaEletrico sistemaEletrico; // Dependência do sistema elétrico
    private SistemaDeCombustivel sistemaDeCombustivel; // Dependência do sistema de combustível

    public Motor(String tipo, int potencia, double cilindrada, String marca, boolean estado,
            SistemaEletrico sistemaEletrico, SistemaDeCombustivel sistemaDeCombustivel) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.marca = marca;
        this.estado = estado;
        this.sistemaEletrico = sistemaEletrico; // Inicializa o sistema elétrico
        this.sistemaDeCombustivel = sistemaDeCombustivel; // Inicializa o sistema de combustível
    }

    public void ligar() {
        if (sistemaEletrico.isEstado() && sistemaDeCombustivel.getNivelDeCombustivel() > 0) {
            this.estado = true;
            System.out.println("Motor ligado.");
        } else if (!sistemaEletrico.isEstado()) {
            System.out.println("Não é possível ligar o motor: sistema elétrico descarregado.");
        } else {
            System.out.println("Não é possível ligar o motor: nível de combustível insuficiente.");
        }
    }

    public void desligar() {
        this.estado = false;
        System.out.println("Motor desligado.");
    }

    public String verificarEstado() {
        return this.estado ? "Motor ligado" : "Motor desligado";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
