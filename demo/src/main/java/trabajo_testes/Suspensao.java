package trabajo_testes;

public class Suspensao {

    private String tipo;
    private String material;
    private double altura;
    private int numComponentes;
    private String fabricante;
    private Object amortecedor;

    public Suspensao(String tipo, String material, double altura, int numComponentes, String fabricante,
            Object amortecedor) {
        this.tipo = tipo;
        this.material = material;
        this.altura = altura;
        this.numComponentes = numComponentes;
        this.fabricante = fabricante;
        this.amortecedor = amortecedor;
    }

    public void ajustarAltura(SistemaEletrico sis, double altura) {
        if(sis.isEstado() == true){
            this.altura = altura;
        }
        
    }

    public double getAltura() {
        return this.altura;
    }

    public String verificarEstado() {
        return "Estado da suspensão: OK"; 
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getNumComponentes() {
        return numComponentes;
    }

    public void setNumComponentes(int numComponentes) {
        this.numComponentes = numComponentes;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Object getAmortecedor() {
        return amortecedor;
    }

    public void setAmortecedor(Object amortecedor) {
        this.amortecedor = amortecedor;
    }

}
