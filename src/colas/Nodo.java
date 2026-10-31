package colas;

/*
* Interface Labs Colas
* @author Ángel Nahúm Camarillo Solano
* @author 29 Octubre 2026
*/

public class Nodo<T> {
    T dato;
    Nodo<T> siguiente;

    Nodo(T dato) {
        this.dato = dato;
    }
}
