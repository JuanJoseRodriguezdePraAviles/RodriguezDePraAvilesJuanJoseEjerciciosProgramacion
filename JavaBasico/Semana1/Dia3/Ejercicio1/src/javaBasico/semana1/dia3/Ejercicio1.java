package javaBasico.semana1.dia3;

import javaBasico.semana1.dia3.model.Electrodomestico;

public class Ejercicio1 {

    public static void main(String[] args) {
        Electrodomestico aspiradora = new Electrodomestico(123, "ASPYR", "C340", 15, "Blanco");
        Electrodomestico microondas = new Electrodomestico(124, "LOREM", "4000M", 50, "Negro");
        Electrodomestico robotDeCocina = new Electrodomestico(100256478, "ORACLE", "ORS2", 100, "Azul");
        
        Electrodomestico freidora = new Electrodomestico();
        
        System.out.println(aspiradora.toString());
        System.out.println(microondas.toString());
        System.out.println(robotDeCocina.toString());
        
        System.out.println(freidora.getMarca());
        
        //Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?
        //Sí, se obtiene null
    }
    
}
