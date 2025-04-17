/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.calendario.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author germa
 * Representa un objeto compuesto, como una carpeta que puede contener archivos o incluso otras carpetas.
 */
class Carpeta implements Componente {
    private String nombre;
    /*Es la lista de componentes (archivos o carpetas) dentro de esta carpeta.*/
    private List<Componente> hijos = new ArrayList<>();
    
    public Carpeta(String nombre) {
        this.nombre = nombre;
    }
    /*Permite agregar archivos o carpetas a la lista de hijos.*/

    public void agregar(Componente componente) {
        hijos.add(componente);
    }
    /* Imprime el nombre de la carpeta y luego llama recursivamente a mostrar en cada hijo, aumentando la indentación.*/
    public void mostrar(String indentacion) {
        System.out.println(indentacion + "+ Carpeta: " + nombre);
        for (Componente c : hijos) {
            c.mostrar(indentacion + "   ");
        }
    }
}