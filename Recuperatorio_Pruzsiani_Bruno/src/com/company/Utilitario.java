package com.company;

public class Utilitario extends Vehiculo{
    private int kilogramosMax;
    private int alturaMax;

    public Utilitario(String nombre, Tipo tipo, int precio, int kilogramosMax, int alturaMax) {
        super(nombre, tipo, precio);
        this.kilogramosMax = kilogramosMax;
        this.alturaMax = alturaMax;
    }

    public int getKilogramosMax() {
        return kilogramosMax;
    }

    public void setKilogramosMax(int kilogramosMax) {
        this.kilogramosMax = kilogramosMax;
    }

    public int getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(int alturaMax) {
        this.alturaMax = alturaMax;
    }

    @Override
    public String toString() {
        return "Utilitario{" +
                "kilogramosMax=" + kilogramosMax +
                ", alturaMax=" + alturaMax +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
