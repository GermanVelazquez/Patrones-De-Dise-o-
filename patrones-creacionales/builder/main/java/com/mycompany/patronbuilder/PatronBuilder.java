/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patronbuilder;

/**
 *
 * @author PcUnvime8
 */
public class PatronBuilder {
        public static void main(String[] args) {

        Casa Micasa = new Casa.Builder()
                .garage(true)
                .habitaciones(3)
                .patio(false)
                .puertas(3)
                .tipoTecho("madera")
                .Ventanas(6)
                .build();
        Micasa.mostrarCasa();
    }
    }