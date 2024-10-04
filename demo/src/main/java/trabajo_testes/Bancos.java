    package trabajo_testes;

    public class Bancos {

        private int quantidade;
        private String material;
        private String cor;
        private String tipo;
        private String estado;
        private double temperatura;

        public Bancos(int quantidade, String material, String cor, String tipo, String estado) {
        this.quantidade = quantidade;
        this.material = material;
        this.cor = cor;
        this.tipo = tipo;
        this.estado = estado;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void ajustarEncosto(String posicao) {
        System.out.println("Encosto ajustado para: " + posicao);
    }

    public void ajustarAltura(double novaAltura) {
        System.out.println("Altura ajustada para: " + novaAltura);
    }

    public void esquentarbanco(SistemaEletrico sistemaEletrico, double temp) {
        if (sistemaEletrico.getVoltagem() >= 12) {
            double temper = temp;
            setTemperatura(temper);
        }
    }

    public String verificarEstado() {
        return "Estado dos bancos: " + estado;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    
}
