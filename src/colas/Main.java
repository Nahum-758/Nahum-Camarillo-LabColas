package colas;

/*
* Interface Labs Colas
* @author Ángel Nahúm Camarillo Solano
* @author 29 Octubre 2026
*/

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
	public static void main(String[] args) {


		// Pruebas de los Ejercicios de Refuerzo Básicos (Parte 5)
        	ColaEnlazada<String> refuerzo = new ColaEnlazada<>();
	        refuerzo.encolar("Dato 1");
        	refuerzo.encolar("Dato 2");
	        refuerzo.encolar("Dato 3");

        	System.out.println("\n--- Probando Ejercicios de Refuerzo ---");
	        refuerzo.imprimirCola(); // Muestra: Cola [Frente -> Final]: Dato 1 Dato 2 Dato 3
        
        	System.out.println("Vaciando la cola...");
	        refuerzo.vaciar();       // Vacía la estructura[cite: 25]
        	refuerzo.imprimirCola(); // Muestra: La cola está vacía.[cite: 25]

	}
}