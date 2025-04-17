/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calendario.composite;

/**
 *
 * @author germa
 * Representa un elemento simple en la jerarquía. No tiene hijos.
 */
class Archivo implements Componente {
    private String nombre;
    /*Imprime el nombre del archivo con la indentación recibida.*/
    public Archivo(String nombre) {
        this.nombre = nombre;
    }
    /*Es el nombre del archivo, como "cv.pdf" o "notas.txt".*/
    public void mostrar(String indentacion) {
        System.out.println(indentacion + "- Archivo: " + nombre);
    }
}