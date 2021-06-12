package br.com.caelum.mapa;

public class Associacao {
    private String placa;
    private Car car;

    public Associacao(String placa, Car car){
        this.placa = placa;
        this.car = car;
    }

    public String getPlaca() {
        return placa;
    }

    public Car getCar() {
        return car;
    }
}
