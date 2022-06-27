package com.company;

public class Carrera extends Automovil{
    private int velMax;

    public Carrera(String nombre, Tipo tipo, int precio, int cantAirbag, int velMax) {
        super(nombre, tipo, precio, cantAirbag);
        this.velMax = velMax;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "velMax=" + velMax +
                ", nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", precio=" + precio +
                '}';
    }
}
