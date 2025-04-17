/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author germa
 */
public class ZapatoGala implements Zapato {

    @Override
    public boolean esElegante() {
        System.out.println("Zapatos de gala -- ¿Son zapatos elegantes? -> Sí");
        return true;
    }

    @Override
    public boolean esParaCorrer() {
        System.out.println("Zapatos de gala -- ¿Son zapatos para correr? -> No");
        return false;
    }
}
