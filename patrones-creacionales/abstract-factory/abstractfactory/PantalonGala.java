/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author germa
 */
public class PantalonGala implements Pantalon {

    @Override
    public boolean tieneBolsillos() {
        System.out.println("Pantalones de gala -- ¿Tienen bolsillos? -> Sí");
        return true;
    }

    @Override
    public String tipoCierre() {
        System.out.println("Pantalones de gala -- Tipo de cierre -> Cierre - cremallera");
        return "Cierre - cremallera";
    }
}