package javaBasico.semana1.dia2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Calculadora importe");
        Scanner sc = new Scanner(System.in);
        double totalPrice = 0;
        double price = 0;
        do {            
            System.out.println("Introduzca el precio del siguiente producto: ");
            price = sc.nextDouble();
            if (price>0){
                totalPrice += price;
            } else if (price < 0){
                System.out.println("**ERROR** Por favor introduzca un valor válido");
            }
        } while (price != 0);
        System.out.println("El importe total es: " + totalPrice);
    }
}
