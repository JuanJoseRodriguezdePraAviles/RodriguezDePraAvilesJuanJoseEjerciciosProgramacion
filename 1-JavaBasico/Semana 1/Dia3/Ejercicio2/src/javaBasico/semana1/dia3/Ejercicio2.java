package javaBasico.semana1.dia3;

import javaBasico.semana1.dia3.model.Persona;

public class Ejercicio2 {
    public static void main(String[] args) {
        Persona[] personas = new Persona[5];
    
        Persona persona1 = new Persona(1, "Alba", 23, "Calle Hércules 2", "123456789");
        Persona persona2 = new Persona(2, "Enrique", 14, "Calle Japón 34", "234567891");
        Persona persona3 = new Persona(3, "Álvaro", 54, "Calle Baloncesto 4", "304567891");
        Persona persona4 = new Persona(4, "Sara", 70, "Calle Lemos 4", "741852963");
        Persona persona5 = new Persona(5, "Carmen", 29, "Avenida Helios 2", "147258369");

        personas[0] = persona1;
        personas[1] = persona2;
        personas[2] = persona3;
        personas[3] = persona4;
        personas[4] = persona5;
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Nombre: "+personas[i].getNombre()+"\nEdad: "+personas[i].getEdad());
            System.out.println("");
        }
        
        System.out.println("Antes");
        System.out.println(personas[0].toString());
        System.out.println(personas[1].toString());
        personas[0].setNombre("María");
        personas[1].setNombre("Alfonso");
        System.out.println("Después");
        System.out.println(personas[0].toString());
        System.out.println(personas[1].toString());
        
        
        System.out.println("\nPersonas mayores de 30 años");
        for (int i = 0; i < personas.length; i++) {
            if(personas[i].getEdad()>30){
                System.out.println(personas[i].toString());
                System.out.println("");
            }
        }
    }
    
    
}
