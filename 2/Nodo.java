/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ucompensar.codigo;

/**
 *
 * @author emamo
 */
public class Nodo {

    int id;
    String nombre;
    int puntaje;
    Nodo siguiente;

    // Constructor
    public Nodo(int id, String nombre, int puntaje) {
        this.id = id;
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.siguiente = null;
    }
}
