package javaBasico.semana1.dia1;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca su nombre:");
        String name = sc.next();
        
        System.out.println("Hola " + name + ", bienvenida al sistema");
    }
    
}
