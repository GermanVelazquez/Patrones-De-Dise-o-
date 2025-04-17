/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.calendario.composite;

/**
 *
 * @author germa
 */
public class Composite {

    public static void main(String[] args) {
       Carpeta raiz = new Carpeta("Mis Documentos");

        // Archivos sueltos
        Archivo archivo1 = new Archivo("cv.pdf");
        Archivo archivo2 = new Archivo("notas.txt");

        // Crear carpeta "Fotos" con archivos dentro
        Carpeta fotos = new Carpeta("Fotos");
        fotos.agregar(new Archivo("vacaciones.jpg"));
        fotos.agregar(new Archivo("cumpleaños.png"));

        // Agregar archivos y subcarpetas a la carpeta raíz
        raiz.agregar(archivo1);
        raiz.agregar(archivo2);
        raiz.agregar(fotos);

        // Mostrar estructura
        raiz.mostrar("");
    }
}
