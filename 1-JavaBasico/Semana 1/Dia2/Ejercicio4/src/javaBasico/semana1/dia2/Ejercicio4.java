package javaBasico.semana1.dia2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Reserva asientos teatro");
        boolean[][] reservedSeats = new boolean[5][5];
        Math.random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(Math.random() >= 0.5){
                    reservedSeats[i][j] = true;
                } else {
                    reservedSeats[i][j] = false;
                }
            }
        }
        
        
        int row;
        int column;
        Scanner sc = new Scanner(System.in);
        do {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if(reservedSeats[i][j]){
                        System.out.print("X ");
                    } else {
                        System.out.print("O ");
                    }
                }
                System.out.println("");
            }
            boolean validSeat = false;
            do {                
                System.out.println("Introduzca la fila donde quiere sentarse:");
                row = sc.nextInt() - 1;
                if(row>=0 && row <5){
                    validSeat = true;
                } else {
                    System.out.println("**ERROR** Introduzca una fila ente 1 y 5");
                }
            } while (!validSeat);
            validSeat = false;
            do {                
                System.out.println("Introduzca el asiento donde quiere sentarse:");
                column = sc.nextInt() - 1;
                if(column>=0 && column <5){
                    validSeat = true;
                } else {
                    System.out.println("**ERROR** Introduzca un asiento entre 1 y 5");
                }
            } while (!validSeat);
            
            
            if(!reservedSeats[row][column]){
                reservedSeats[row][column] = true;
                System.out.println("Asiento reservado con éxito");
            } else {
                System.out.println("Ese asiento ya está ocupado. Por favor, elija otro asiento.");
            }
            
            System.out.println("¿Desea seguir reservando asientos? (Introduzca 'S' para salir)");
        } while (!sc.next().equalsIgnoreCase("s"));
        
    }
    
}
