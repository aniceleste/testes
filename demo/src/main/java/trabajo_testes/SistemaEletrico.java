package trabajo_testes;

public class SistemaEletrico {

    private double voltagem;
    private double capacidade;
    private String tipoDeBateria;
    private boolean estado; // True para funcionando, False para descarregado
    private String marca;

    public SistemaEletrico(double voltagem, double capacidade, String tipoDeBateria, boolean estado, String marca) {
        this.voltagem = voltagem;
        this.capacidade = capacidade;
        this.tipoDeBateria = tipoDeBateria;
        this.estado = estado;
        this.marca = marca;
    }

    public String verificarBateria() {
        return estado ? "Bateria está funcionando." : "Bateria está descarregada.";
    }

    public String verificarEstado() {
        return estado ? "Sistema elétrico funcionando" : "Sistema elétrico não está funcionando";
    }

    public void substituirBateria() {
        System.out.println("Bateria substituída.");
    }

    public void testarSistema() {
        System.out.println("Sistema elétrico testado.");
    }

    public double getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipoDeBateria() {
        return tipoDeBateria;
    }

    public void setTipoDeBateria(String tipoDeBateria) {
        this.tipoDeBateria = tipoDeBateria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


}
