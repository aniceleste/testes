package trabajo_testes;

public class SistemaDeDirecao {


        private String tipo;
        private boolean assistido;
        private String material;
        private double relacao;
        private String marca;
        private boolean automatico;

        public SistemaDeDirecao(String tipo, boolean assistido, String material, double relacao, String marca) {
            this.tipo = tipo;
            this.assistido = assistido;
            this.material = material;
            this.relacao = relacao;
            this.marca = marca;
        }

        public void ajustarDirecao(double angulo) {
            System.out.println("Direção ajustada para o ângulo: " + angulo);
        }

        public String verificarEstado() {
            return "Estado do sistema de direção: OK";
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

    public boolean isAssistido() {
        return assistido;
    }

    public void setAssistido(boolean assistido) {
        this.assistido = assistido;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getRelacao() {
        return relacao;
    }

    public void setRelacao(double relacao) {
        this.relacao = relacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void AtivarModoPilotoAutomatico(SistemaEletrico sistemaEletrico) {
		if (sistemaEletrico.getVoltagem() >= 12) {
			automatico = true;
		}
	}

	public void DesativarModoPilotoAutomatico(SistemaEletrico sistemaEletrico) {
		automatico = false;

	}

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    

    }


