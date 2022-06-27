package com.company;

import java.util.Scanner;

public class Motocicleta extends Vehiculo {
    private int Cilindrada;

    public Motocicleta(String nombre, Tipo tipo, int precio, int cilindrada) {
        super(nombre, tipo, precio);
        Cilindrada = cilindrada;
    }

    public Motocicleta() {

    }


    public int getCilindrada() {
        return Cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        Cilindrada = cilindrada;
    }

    public Motocicleta insertarMoto(){
        Scanner lectura = new Scanner (System.in);

        System.out.println("Ingrese nombre de la moto: ");

        String nombre = lectura.next();

        System.out.println("Ingrese su precio: ");

        int precio = lectura.nextInt();

        System.out.println("Ingrese cilindrada");

        int cilindrada= lectura.nextInt();

        Motocicleta motoX= new Motocicleta(nombre,Tipo.MOTOCICLETA,precio,cilindrada);

        return motoX;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "Cilindrada=" + Cilindrada +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
