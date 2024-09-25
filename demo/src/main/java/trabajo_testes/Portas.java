package trabajo_testes;

public class Portas {

        private int quantidade;
        private String material;
        private String cor;
        private String tipo;
        private String estado;

        public Portas(int quantidade, String material, String cor, String tipo, String estado) {
            this.quantidade = quantidade;
            this.material = material;
            this.cor = cor;
            this.tipo = tipo;
            this.estado = estado;
        }

        public void abrir() {
            estado = "aberta";
            System.out.println("Porta aberta.");
        }

        public void fechar() {
            estado = "fechada";
            System.out.println("Porta fechada.");
        }

        public String verificarEstado() {
            return "Estado da porta: " + estado;
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
    }


