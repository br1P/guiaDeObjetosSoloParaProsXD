package com.company;

public class Automovil extends Vehiculo{
    private int cantAirbag; //numero max de airbags

    public Automovil(String nombre, Tipo tipo, int precio, int cantAirbag) {
        super(nombre, tipo, precio);
        this.cantAirbag = cantAirbag;
    }

    public int getCantAirbag() {
        return cantAirbag;
    }

    public void setCantAirbag(int cantAirbag) {
        this.cantAirbag = cantAirbag;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "cantAirbag=" + cantAirbag +
                '}';
    }
}
