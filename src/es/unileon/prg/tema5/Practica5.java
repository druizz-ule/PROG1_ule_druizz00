package es.unileon.prg.tema5;

public class Practica5 {

    public static void main(String[] args) {
        System.out.println("--- Práctica 5: Tipos básicos y operadores ---");
        
        // EJERCICIO 1: Identificadores válidos e inválidos
        int edad = 20;            // Correcto
        // int 2num = 5;          // ERROR: No puede empezar por número
        int valor$suma = 100;     // Correcto
        // int mi-variable = 10;  // ERROR: No se permite el guion medio
        int _total = 50;          // Correcto
        // int class = 1;         // ERROR: 'class' es palabra reservada

        System.out.println("Variables validas declaradas correctamente:");
        System.out.println("edad: " + edad);
        System.out.println("valor$suma: " + valor$suma);
        System.out.println("_total: " + _total);
    }
}