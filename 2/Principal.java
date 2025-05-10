/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.ucompensar.codigo;

import java.util.Scanner;

/**
 *
 * @author emamo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();

        // Menú interactivo
        int opcion;
        do {
            System.out.println("\n*** MENU ***");
            System.out.println("1. Agregar Candidato");
            System.out.println("2. Ver Lista");
            System.out.println("3. Ordenar por Selection Sort");
            System.out.println("4. Ordenar por Bubble Sort");
            System.out.println("5. Ordenar por Insertion Sort");
            System.out.println("6. Busqueda Secuencial");
            System.out.println("7. Busqueda Binaria");
            System.out.println("8. Eliminar");
            System.out.println("9. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Agregar Nodo
                    System.out.print("Introduce el ID del Candidato: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer

                    System.out.print("Introduce el nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Introduce el puntaje (0-100): ");
                    int puntaje = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer

                    lista.agregarNodo(id, nombre, puntaje);
                    System.out.println("Nodo agregado exitosamente.");
                    break;

                case 2:
                    // Ver Lista
                    System.out.println("\nLista actual:");
                    lista.imprimirLista();
                    break;

                case 3:
                    // Ordenar por Selection Sort
                    lista.selectionSort();
                    System.out.println("\nLista ordenada por Selection Sort:");
                    lista.imprimirLista();
                    break;

                case 4:
                    // Ordenar por Bubble Sort
                    lista.bubbleSort();
                    System.out.println("\nLista ordenada por Bubble Sort:");
                    lista.imprimirLista();
                    break;

                case 5:
                    // Ordenar por Insertion Sort
                    lista.insertionSort();
                    System.out.println("\nLista ordenada por Insertion Sort:");
                    lista.imprimirLista();
                    break;

                case 6:
                    // Búsqueda Secuencial
                    System.out.print("Introduce el ID para búsqueda secuencial: ");
                    int idSecuencial = scanner.nextInt();
                    Nodo resultadoSecuencial = lista.busquedaSecuencial(idSecuencial);
                    System.out.println("Resultado de la Búsqueda Secuencial (ID " + idSecuencial + "): "
                            + (resultadoSecuencial != null ? resultadoSecuencial.nombre : "No encontrado"));
                    break;

                case 7:
                    // Búsqueda Binaria
                    System.out.print("Introduce el ID para búsqueda binaria: ");
                    int idBinaria = scanner.nextInt();
                    Nodo resultadoBinaria = lista.busquedaBinaria(idBinaria);
                    System.out.println("Resultado de la Búsqueda Binaria (ID " + idBinaria + "): "
                            + (resultadoBinaria != null ? resultadoBinaria.nombre : "No encontrado"));
                    break;
                case 8:
                    // Eliminar Nodo
                    System.out.print("Introduce el ID del nodo que deseas eliminar: ");
                    int idEliminar = scanner.nextInt();
                    lista.eliminarNodo(idEliminar);
                    break;

                case 9:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, por favor elige nuevamente.");
                    break;
            }
        } while (opcion != 9);

        scanner.close();
    }
}
