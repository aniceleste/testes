package trabajo_testes;

public class SistemaDeTransmissao {

        private String tipo;
        private int numeroDeMarchas;
        private String material;
        private String marca;
        private boolean estado;

        public SistemaDeTransmissao(String tipo, int numeroDeMarchas, String material, String marca, boolean estado) {
            this.tipo = tipo;
            this.numeroDeMarchas = numeroDeMarchas;
            this.material = material;
            this.marca = marca;
            this.estado = estado;
        }

        public void trocarMarcha(int marcha) {
            System.out.println("Marcha trocada para: " + marcha);
        }

        public String verificarEstado() {
            return estado ? "Sistema de transmissão está funcionando." : "Sistema de transmissão está desligado.";
        }

        public void substituirComponente(String componente) {
            System.out.println("Componente " + componente + " substituído.");
        }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroDeMarchas() {
        return numeroDeMarchas;
    }

    public void setNumeroDeMarchas(int numeroDeMarchas) {
        this.numeroDeMarchas = numeroDeMarchas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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


