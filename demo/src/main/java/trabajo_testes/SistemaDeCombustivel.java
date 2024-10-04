package trabajo_testes;

public class SistemaDeCombustivel {
    private String tipoDeCombustivel;
    private double capacidade;
    private Double nivelDeCombustivel;
    private String marca;
    private boolean estado;
    private Motor motor;

    public SistemaDeCombustivel(String tipoDeCombustivel, double capacidade, Double nivelDeCombustivel, String marca, boolean estado, Motor motor) {
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.capacidade = capacidade;
        this.nivelDeCombustivel = nivelDeCombustivel;
        this.marca = marca;
        this.estado = estado;
        this.motor = motor;
    }

    

    public Double verificarNivel() {
        return nivelDeCombustivel;
    }

    public void abastecer(Motor motor, SistemaDeCombustivel com, double quantidade) {
        if(motor.isEstado() == false && com.getNivelDeCombustivel() < 50  )
        this.nivelDeCombustivel += quantidade;
        System.out.println("Abastecido com: " + quantidade + " litros. Nível atual: " + nivelDeCombustivel);
    }



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
            return null;  
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

