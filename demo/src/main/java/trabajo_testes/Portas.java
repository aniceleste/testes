package trabajo_testes;

public class Portas {

    private int quantidade;
    private String material;
    private String cor;
    private String tipo;
    private boolean estado;

    public Portas(int quantidade, String material, String cor, String tipo,boolean estado) {
        this.quantidade = quantidade;
        this.material = material;
        this.cor = cor;
        this.tipo = tipo;
        this.estado = estado;
    }

    public void abrir() {
        estado = true;
        System.out.println("Porta aberta.");

    }

    public void fechar() {
        estado = false;
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

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    

    public void abrir(Luzes sistemaLuzes, SistemaEletrico sistemaEletrico ){
		estado = true;
		sistemaLuzes.ligar(sistemaEletrico);
	}

	public void fechar(Luzes sistemaLuzes, SistemaEletrico sistemaEletrico){
		estado = false;
		sistemaLuzes.desligaLuzes(sistemaEletrico);
	}
    
}
