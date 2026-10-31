package colas;

/*
* Interface Labs Colas
* @author Ángel Nahúm Camarillo Solano
* @author 29 Octubre 2026
*/

public class ColaEnlazada<T> {
    private Nodo<T> frente;
    private Nodo<T> fin;
    private int tamanio;

    public boolean estaVacia() {
        return frente == null;
    }

    public int tamanio() {
        return tamanio;
    }

    public void encolar(T valor) {
        Nodo<T> nuevo = new Nodo<>(valor);
        if (estaVacia()) {
            frente = nuevo;
        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tamanio++;
    }

    public T desencolar() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        T valor = frente.dato;
        frente = frente.siguiente;
        if (frente == null) {
            fin = null; // la cola quedó vacía
        }
        tamanio--;
        return valor;
    }

    public T frente() {
        if (estaVacia()) {
            throw new IllegalStateException("La cola está vacía");
        }
        return frente.dato;
    }

    /**
     * Ejercicio 1 (Nivel básico): Muestra todos los elementos de la cola
     * desde el frente hasta el final, sin destruir la estructura.[cite: 25]
     */
    public void imprimirCola() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return;
        }
        
        Nodo<T> actual = frente;
        System.out.print("Cola [Frente -> Final]: ");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    /**
     * Ejercicio 2 (Nivel básico): Deja la cola completamente sin elementos,
     * restableciendo el frente, el fin y el tamaño a cero.[cite: 25]
     */
    public void vaciar() {
        frente = null;
        fin = null;
        tamanio = 0;
    }
}
