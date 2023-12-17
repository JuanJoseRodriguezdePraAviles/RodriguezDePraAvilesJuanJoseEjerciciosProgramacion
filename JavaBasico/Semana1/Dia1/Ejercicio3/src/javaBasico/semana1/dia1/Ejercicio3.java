package javaBasico.semana1.dia1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        double base,
               height;
              
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculadora área triángulo");
        System.out.println("Introduzca la base: ");
        base = sc.nextDouble();
        System.out.println("Introduzca la altura: ");
        height = sc.nextDouble();
        System.out.println("El área de un triángulo de base "
                + base + " y altura " + height + " es " + base*height/2);
        
    }
}
