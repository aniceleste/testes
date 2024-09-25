    package trabajo_testes;

    public class Bancos {

        private int quantidade;
        private String material;
        private String cor;
        private String tipo;
        private String estado;

        public Bancos(int quantidade, String material, String cor, String tipo, String estado) {
        this.quantidade = quantidade;
        this.material = material;
        this.cor = cor;
        this.tipo = tipo;
        this.estado = estado;
    }

    // Getter para quantidade
    public int getQuantidade() {
        return quantidade;
    }

    // Setter para quantidade
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Getter para material
    public String getMaterial() {
        return material;
    }

    // Setter para material
    public void setMaterial(String material) {
        this.material = material;
    }

    // Getter para cor
    public String getCor() {
        return cor;
    }

    // Setter para cor
    public void setCor(String cor) {
        this.cor = cor;
    }

    // Getter para tipo
    public String getTipo() {
        return tipo;
    }

    // Setter para tipo
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Getter para estado
    public String getEstado() {
        return estado;
    }

    // Setter para estado
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void ajustarEncosto(String posicao) {
        System.out.println("Encosto ajustado para: " + posicao);
    }

    public void ajustarAltura(double novaAltura) {
        System.out.println("Altura ajustada para: " + novaAltura);
    }

    public String verificarEstado() {
        return "Estado dos bancos: " + estado;
    }

    
}
