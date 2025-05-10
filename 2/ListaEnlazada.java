/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ucompensar.codigo;

/**
 *
 * @author emamo
 */
public class ListaEnlazada {

    Nodo cabeza;

    // Constructor
    public ListaEnlazada() {
        this.cabeza = null;
    }

    // Método para agregar un nodo a la lista
    public void agregarNodo(int id, String nombre, int puntaje) {
        Nodo nuevoNodo = new Nodo(id, nombre, puntaje);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    // Método para imprimir la lista
    public void imprimirLista() {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.println("ID: " + temp.id + ", Nombre: " + temp.nombre + ", Puntaje: " + temp.puntaje);
            temp = temp.siguiente;
        }
    }
    //Metodo para eliminar
    public void eliminarNodo(int id) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        // Si el nodo a eliminar es la cabeza
        if (cabeza.id == id) {
            cabeza = cabeza.siguiente;
            System.out.println("Nodo con ID " + id + " eliminado.");
            return;
        }

        // Buscar el nodo a eliminar
        Nodo temp = cabeza;
        while (temp.siguiente != null && temp.siguiente.id != id) {
            temp = temp.siguiente;
        }

        // Si encontramos el nodo
        if (temp.siguiente != null) {
            temp.siguiente = temp.siguiente.siguiente;
            System.out.println("Nodo con ID " + id + " eliminado.");
        } else {
            System.out.println("Nodo con ID " + id + " no encontrado.");
        }
    }

    // Algoritmo de Selection Sort
    public void selectionSort() {
        Nodo i = cabeza;
        while (i != null) {
            Nodo j = i.siguiente;
            Nodo min = i;
            while (j != null) {
                if (j.puntaje < min.puntaje) {
                    min = j;
                }
                j = j.siguiente;
            }
            // Intercambiar los valores de puntaje, id y nombre
            if (min != i) {
                int tempPuntaje = i.puntaje;
                i.puntaje = min.puntaje;
                min.puntaje = tempPuntaje;

                int tempId = i.id;
                i.id = min.id;
                min.id = tempId;

                String tempNombre = i.nombre;
                i.nombre = min.nombre;
                min.nombre = tempNombre;
            }
            i = i.siguiente;
        }
    }

    // Algoritmo de Bubble Sort
    public void bubbleSort() {
        if (cabeza == null || cabeza.siguiente == null) {
            return;
        }

        boolean intercambio;
        do {
            intercambio = false;
            Nodo actual = cabeza;
            while (actual != null && actual.siguiente != null) {
                if (actual.puntaje > actual.siguiente.puntaje) {
                    // Intercambiar los valores de puntaje, id y nombre
                    int tempPuntaje = actual.puntaje;
                    actual.puntaje = actual.siguiente.puntaje;
                    actual.siguiente.puntaje = tempPuntaje;

                    int tempId = actual.id;
                    actual.id = actual.siguiente.id;
                    actual.siguiente.id = tempId;

                    String tempNombre = actual.nombre;
                    actual.nombre = actual.siguiente.nombre;
                    actual.siguiente.nombre = tempNombre;

                    intercambio = true;
                }
                actual = actual.siguiente;
            }
        } while (intercambio);
    }

    // Algoritmo de Insertion Sort
    public void insertionSort() {
        if (cabeza == null || cabeza.siguiente == null) {
            return;
        }

        Nodo sorted = null;
        Nodo current = cabeza;
        while (current != null) {
            Nodo next = current.siguiente;
            sorted = insertarOrdenado(sorted, current);
            current = next;
        }
        cabeza = sorted;
    }

    // Método auxiliar para insertar un nodo ordenado en la lista
    private Nodo insertarOrdenado(Nodo sorted, Nodo nuevoNodo) {
        if (sorted == null || sorted.puntaje >= nuevoNodo.puntaje) {
            nuevoNodo.siguiente = sorted;
            return nuevoNodo;
        }
        Nodo current = sorted;
        while (current.siguiente != null && current.siguiente.puntaje < nuevoNodo.puntaje) {
            current = current.siguiente;
        }
        nuevoNodo.siguiente = current.siguiente;
        current.siguiente = nuevoNodo;
        return sorted;
    }

    // Búsqueda Secuencial
    public Nodo busquedaSecuencial(int id) {
        Nodo temp = cabeza;
        while (temp != null) {
            if (temp.id == id) {
                return temp;
            }
            temp = temp.siguiente;
        }
        return null;
    }

    // Búsqueda Binaria (requiere que la lista esté ordenada)
    public Nodo busquedaBinaria(int id) {
        Nodo inicio = cabeza;
        Nodo fin = null;
        while (inicio != fin) {
            Nodo medio = obtenerMedio(inicio, fin);
            if (medio.id == id) {
                return medio;
            } else if (medio.id < id) {
                inicio = medio.siguiente;
            } else {
                fin = medio;
            }
        }
        return null;
    }

    // Método auxiliar para obtener el nodo del medio
    private Nodo obtenerMedio(Nodo inicio, Nodo fin) {
        Nodo lento = inicio;
        Nodo rapido = inicio;
        while (rapido != fin && rapido.siguiente != fin) {
            lento = lento.siguiente;
            rapido = rapido.siguiente.siguiente;
        }
        return lento;
    }
}
