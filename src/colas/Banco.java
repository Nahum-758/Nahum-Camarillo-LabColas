package colas;

import java.util.Scanner;

/**
 * Simulación de una fila de banco con un solo cajero usando ColaEnlazada.
 * @author Ángel Nahúm Camarillo Solano
 */
public class Banco {
    public static void main(String[] args) {
        ColaEnlazada<String> fila = new ColaEnlazada<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1. Llega un cliente");
            System.out.println("2. Atender al siguiente cliente");
            System.out.println("3. Ver quién sigue");
            System.out.println("4. Ver cantidad de clientes en espera");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    // Pedir el nombre del cliente y encolarlo
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = sc.nextLine();
                    fila.encolar(nombre);
                    System.out.println("¡Cliente " + nombre + " agregado a la fila!");
                    break;

                case 2:
                    // Desencolar validando que no esté vacía
                    if (fila.estaVacia()) {
                        System.out.println("No hay clientes en espera.");
                    } else {
                        String atendido = fila.desencolar();
                        System.out.println("Atendiendo a: " + atendido);
                    }
                    break;

                case 3:
                    // Mostrar el frente validando que no esté vacía
                    if (fila.estaVacia()) {
                        System.out.println("No hay clientes en espera.");
                    } else {
                        System.out.println("El siguiente en la fila es: " + fila.frente());
                    }
                    break;

                case 4:
                    // Mostrar el tamaño actual de la cola
                    System.out.println("Clientes en espera: " + fila.tamanio());
                    break;

                case 5:
                    System.out.println("Saliendo de la simulación del banco...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);

        sc.close();
    }
}