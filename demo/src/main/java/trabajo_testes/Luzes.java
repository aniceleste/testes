package trabajo_testes;

public class Luzes {

    private String tipo;
    private int intensidade;
    private String cor;
    private boolean estado; // True para ligadas, False para desligadas
    private String modelo;

    public Luzes(String tipo, int intensidade, String cor, boolean estado, String modelo) {
        this.tipo = tipo;
        this.intensidade = intensidade;
        this.cor = cor;
        this.estado = estado;
        this.modelo = modelo;
    }

    public void ligar() {
        this.estado = true;
        System.out.println("Luzes ligadas.");
    }

    public void desligar() {
        this.estado = false;
        System.out.println("Luzes desligadas.");
    }

    public void ajustarIntensidade(int novaIntensidade) {
        this.intensidade = novaIntensidade;
        System.out.println("Intensidade ajustada para: " + novaIntensidade);
    }

    public String verificarEstado() {
        return this.estado ? "Luzes ligadas" : "Luzes desligadas";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
