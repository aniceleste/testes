package trabajo_testes;

public class SistemaDeCombustivel {
    private String tipoDeCombustivel;
    private double capacidade;
    private Double nivelDeCombustivel;
    private String marca;
    private boolean estado;

    public SistemaDeCombustivel(String tipoDeCombustivel, double capacidade, Double nivelDeCombustivel, String marca, boolean estado) {
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.capacidade = capacidade;
        this.nivelDeCombustivel = nivelDeCombustivel;
        this.marca = marca;
        this.estado = estado;
    }

    

    public Double verificarNivel() {
        return nivelDeCombustivel;
    }

    public void abastecer(double quantidade) {
        this.nivelDeCombustivel += quantidade;
        System.out.println("Abastecido com: " + quantidade + " litros. Nível atual: " + nivelDeCombustivel);
    }


    // Getters e Setters (omitidos para brevidade)

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public Double getNivelDeCombustivel() {
        if (nivelDeCombustivel == null) {
            return null;  // Retorna null se o nível de combustível for null
        }
        return nivelDeCombustivel;
    }

    public void setNivelDeCombustivel(double nivelDeCombustivel) {
        this.nivelDeCombustivel = nivelDeCombustivel;
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

