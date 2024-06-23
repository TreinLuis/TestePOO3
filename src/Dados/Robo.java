package Dados;

public abstract class Robo {
    private int id;
    private String modelo;
    private double valorDiario = 0;

    public Robo(int id, String modelo) {
        this.id = id;
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorDiario() {
        return valorDiario;
    }

    public void setValorDiario(double valorDiario) {
        this.valorDiario = valorDiario;
    }

    @Override
    public String toString() {
        return
                "Id = " + id +
                " | Modelo = " + modelo +
                " | ";
    }
    public abstract double calculaLocacao(int dias);

}
