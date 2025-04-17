/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.calendario.composite;

/**
 *
 * @author germa
 * Es la interfaz común que deben implementar tanto los elementos simples (hojas) como los compuestos (carpetas).
 */
public interface Componente {
    /*Se usa para imprimir el contenido. El parámetro indentacion sirve para mostrar la jerarquía con espacios.*/
    void mostrar(String indentacion);
}
