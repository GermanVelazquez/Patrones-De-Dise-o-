/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.decorator;

/**
 *
 * @author PcUnvime8
 */
public class Jugo implements Bebida{

    @Override
    public String getDescripcion() {
       return "jogo";
    }

    @Override
    public double getCosto() {
        return 3.25;
    }
    
}
