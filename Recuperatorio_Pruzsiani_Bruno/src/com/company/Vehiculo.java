package com.company;

public class Vehiculo{
    protected String nombre; //nombre del modelo
    protected Tipo tipo; //puede ser un enum mejor?
    protected int precio;

    public Vehiculo(String nombre, Tipo tipo, int precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }

    public Vehiculo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", precio=" + precio +
                '}';
    }
}
