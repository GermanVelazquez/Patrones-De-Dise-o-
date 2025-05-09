/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decorator;

/**
 *
 * @author PcUnvime8
 */
public class Decorator {

    public static void main(String[] args) {
        Bebida miBebida = new Cafe(); // Café base
        miBebida = new ConLeche(miBebida); // + leche
        miBebida = new ConAzucar(miBebida); // + azúcar
        miBebida = new ConChocolate(miBebida); // + chocolate
        
        Bebida mijugi = new Jugo();
        mijugi = new ConChocolate(mijugi);
        
        System.out.println("Tu orden:" +mijugi.getDescripcion());
        System.out.println("Total" +mijugi.getCosto());
        
        System.out.println("Tu orden: " + miBebida.getDescripcion());
        System.out.println("Total: $" + miBebida.getCosto());
    }
}
