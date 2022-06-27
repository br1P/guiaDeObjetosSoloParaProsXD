package com.company;

public class Urbano extends Automovil{
    private int cantOcupantes;


    public Urbano(String nombre, Tipo tipo, int precio, int cantAirbag, int cantOcupantes) {
        super(nombre, tipo, precio, cantAirbag);
        this.cantOcupantes = cantOcupantes;
    }

    public int getCantOcupantes() {
        return cantOcupantes;
    }

    public void setCantOcupantes(int cantOcupantes) {
        this.cantOcupantes = cantOcupantes;
    }

    @Override
    public String toString() {
        return "Urbano{" +
                "cantOcupantes=" + cantOcupantes +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
