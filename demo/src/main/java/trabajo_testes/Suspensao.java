package trabajo_testes;

public class Suspensao {

    private String tipo;
    private String material;
    private double altura;
    private int numComponentes;
    private String fabricante;
    private Object amortecedor; // Cambia Object por el tipo adecuado si es necesario

    // Constructor
    public Suspensao(String tipo, String material, double altura, int numComponentes, String fabricante, Object amortecedor) {
        this.tipo = tipo;
        this.material = material;
        this.altura = altura;
        this.numComponentes = numComponentes;
        this.fabricante = fabricante;
        this.amortecedor = amortecedor;
    }

    // Método para ajustar la altura de la suspensión
    public void ajustarAltura(double novaAltura) {
        this.altura = novaAltura;
    }

    // Método para obtener la altura actual
    public double getAltura() {
        return this.altura;
    }

    // Método para verificar el estado de la suspensión
    public String verificarEstado() {
        return "Estado da suspensão: OK"; // Ajusta este mensaje según sea necesario
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
