package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Empresa vehiculos = new Empresa();


        vehiculos.JsonToVehiculosList();

        Utilitario utilitario1=new Utilitario("Tractor",Tipo.UTILITARIO,140000000,2000,4);
        Motocicleta moto1=new Motocicleta("Honda wave",Tipo.MOTOCICLETA,300000,330);
        Urbano urbano1=new Urbano("Peugeot 206",Tipo.URBANO,2000000,2,4);
        Carrera carre1=new Carrera("Ferrari",Tipo.CARRERA,90000000,1,400);


        Motocicleta motoXteclado= new Motocicleta();
        motoXteclado= motoXteclado.insertarMoto();
         vehiculos.add(motoXteclado);


        vehiculos.add(utilitario1);
        vehiculos.add(moto1);
        vehiculos.add(urbano1);
        vehiculos.add(carre1);


        System.out.println("Mostrando arrayList de vehiculos");
        System.out.println(vehiculos);

        System.out.println("Mostrando mayores");
        vehiculos.mostrarMayores();

        vehiculos.moverAlistas();

        vehiculos.vehiculosListToJson();
    }
}
