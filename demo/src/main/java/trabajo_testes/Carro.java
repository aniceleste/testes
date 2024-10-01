package trabajo_testes;

public class Carro {
    private String marca;
    private int ano;
    private String cor;
    private String placa;
    private double quilometragem;
    private boolean estado;
    // Constructor
    public Carro(String marca, int ano, String cor, String placa, double quilometragem, boolean estado) {
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
        this.quilometragem = quilometragem;
        this.estado = estado;
    }

    public void ligar(Motor motor, SistemaEletrico sis, SistemaDeCombustivel com) {
        if(sis.getVoltagem()>= 12 && com.getNivelDeCombustivel()>0 && motor.isEstado()==true){
            this.estado = true;
        }

    }
    
    public void desligar() {
        
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    

    

}

