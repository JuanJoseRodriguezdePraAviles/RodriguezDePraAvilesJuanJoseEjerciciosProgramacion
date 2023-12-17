package javaBasico.semana1.dia2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Promedio temperaturas de los últimos 7 días");
        
        Scanner sc = new Scanner(System.in);
        double[] last7MaxTempetures = new double[7];
        
        for (int i = 0; i < last7MaxTempetures.length; i++) {
            System.out.println("Introduzca la temperatura del día "
                                + (i+1) + ": "); 
            last7MaxTempetures[i] = sc.nextDouble();
        }
        
        double media = 0;
        
        for (int i = 0; i < last7MaxTempetures.length; i++) {
            media += last7MaxTempetures[i];
        }
        media /= last7MaxTempetures.length;
        
        System.out.println("La media de las temperaturas de los "
                            + "últimos 7 días es: " + media + " ºC");
    }
}
