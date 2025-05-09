/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorator;

/**
 *
 * @author PcUnvime8
 */
class ConChocolate extends BebidaDecorador {
    public ConChocolate(Bebida bebida) {
        super(bebida);
    }

    public String getDescripcion() {
        return bebida.getDescripcion() + " + chocolate";
    }

    public double getCosto() {
        return bebida.getCosto() + 0.75;
    }
}