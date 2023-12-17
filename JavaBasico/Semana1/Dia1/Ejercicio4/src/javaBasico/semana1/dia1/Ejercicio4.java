package javaBasico.semana1.dia1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Programa de operaciones aritméticas");
        System.out.println("Introduzca el primer número: ");
        
        int number1,
            number2;
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextInt();
        System.out.println("Introduzca el segundo número: ");
        number2 = sc.nextInt();
        
        System.out.println("La suma de " + number1 + " y " + number2
                            + " es " + (number1 + number2));
        System.out.println("La resta de " + number1 + " y " + number2
                            + " es " + (number1 - number2));
        System.out.println("La multiplicación de " + number1 + " y " + number2
                            + " es " + (number1 * number2));
        System.out.println("La división de " + number1 + " y " + number2
                            + " es " + (number1*1.0 / number2));
        
        // ¿Qué sucede si como segundo número de una división se ingresa 0?
        //Con lo que sabes o aprendiste hasta ahora…
        //¿De qué manera tratarías de evitar ésta situación?
        //En este programa al dividir entre 0 da como resultado "Infinity"
        //Cualquier división entre 0 da un resultado inderteminado pero los
        //límites de la función a/x con x tendiendo a 0 dan +infinito y
        //-infinito. Con los conocimientos enseñados hasta ahora me parece
        //un resultado adecuado.
       
        
    }
}
