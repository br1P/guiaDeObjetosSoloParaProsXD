package com.company;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    public static final ObjectMapper JSON_MAPPER = new ObjectMapper();
    private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

    public void add(Vehiculo vehiculo){
        if(vehiculo!=null){
            if(vehiculo instanceof Motocicleta||vehiculo instanceof Urbano||vehiculo instanceof Utilitario || vehiculo instanceof Carrera){
                vehiculos.add(vehiculo);
            }
        }
    }

    public void JsonToVehiculosList(){
        try {
            File file = new File("vehiculos.json");
            if(file.exists())
                vehiculos = JSON_MAPPER.readValue(file, new TypeReference<ArrayList<Vehiculo>>() {});

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void vehiculosListToJson(){
        try {
            File file = new File("vehiculos.json");
            JSON_MAPPER.writeValue(file, vehiculos);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void mostrarMayores(){
        for (Vehiculo c: vehiculos){
            if(c.getPrecio()>1000000){
                System.out.println(c);
            }
        }
    }

    public void moverAlistas(){
        List<Motocicleta> motocicletas1= new ArrayList<>();
        List<Utilitario> utilitarios1= new ArrayList<>();
        List<Urbano> urbanos1= new ArrayList<>();
        List<Carrera> carrera1= new ArrayList<>();
        int cont=0;
        int cont1=0;
        int cont2=0;
        int cont3=0;
        for (Vehiculo c: vehiculos){
            if(c instanceof Motocicleta){
                motocicletas1.add((Motocicleta) c);
                cont++;

            }
            if(c instanceof Utilitario){
                utilitarios1.add((Utilitario) c);
                cont1++;
            }
            if(c instanceof Urbano){
                urbanos1.add((Urbano) c);
                cont2++;
            }
            if(c instanceof Carrera){
                carrera1.add((Carrera) c);
                cont3++;
            }
        }
        System.out.println("Hay "+ cont + " motocicletas: ");
        System.out.println(motocicletas1);
        System.out.println("Hay "+ cont1 +" Utilitarios: ");
        System.out.println(utilitarios1);
        System.out.println("Hay "+cont2 +"Urbanos: ");
        System.out.println(urbanos1);
        System.out.println("Hay "+cont3 + " Carreras: ");
        System.out.println(carrera1);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "vehiculos=" + vehiculos +
                '}';
    }
}
