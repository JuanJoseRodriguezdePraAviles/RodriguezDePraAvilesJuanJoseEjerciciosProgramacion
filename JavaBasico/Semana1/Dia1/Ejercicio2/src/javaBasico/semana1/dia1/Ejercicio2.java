package javaBasico.semana1.dia1;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numberInteger = 1;
        double numberDouble = 0.1;
        boolean isActive = true;
        String text = "This is a text";

        System.out.println("int: " + numberInteger);
        System.out.println("double: " + numberDouble);
        System.out.println("boolean: " + isActive);
        System.out.println("String: " + text);
        
        //¿Qué sucede con el programa?
        //El programa deja de funcionar, el IDE muestra un mensaje
        //de error y te impide ejecutar el programa ya que no
        //puede compilar
        
        //¿Se produce algún error?
        //Sí, se produce un error de compilación en algunos
        //casos siempre y cuando el valor que se asigna no
        //pueda ser convertido implicitamente al tipo de
        //variable que se le asigna
        
        //¿En qué situaciones se genera error y en cuáles no?
        //Se ge genera este error en los siguiente casos:
        // - Al asignar un int a un boolean
        // - Al asignar un int a un String
        // - Al asignar un double a un int
        // - Al asignar un double a un boolean
        // - Al asignar un double a un String
        // - Al asignar un boolean a un int
        // - Al asignar un boolean a un double
        // - Al asignar un boolean a un String
        // - Al asignar un String a un int
        // - Al asignar un String a un double
        // - Al asignar un String a un boolean
        // No se genera este error en el siguiente caso:
        // - Al asignar un int a un double
    }
    
}
