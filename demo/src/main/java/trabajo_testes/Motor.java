package trabajo_testes;

public class Motor {

    private String tipo;
    private int potencia;
    private double cilindrada;
    private String marca;
    private boolean estado;
    private SistemaEletrico sistemaEletrico; 
    private SistemaDeCombustivel sistemaDeCombustivel; 

    public Motor(String tipo, int potencia, double cilindrada, String marca, boolean estado) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.marca = marca;
        this.estado = estado;
        
    }

    public void ligar(SistemaEletrico sis, SistemaDeCombustivel com) {
        if (sis.getVoltagem()>=12 && com.getNivelDeCombustivel() > 0 && sis.isEstado()==true) {
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
