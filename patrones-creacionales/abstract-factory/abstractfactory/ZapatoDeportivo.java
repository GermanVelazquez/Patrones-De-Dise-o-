/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author germa
 */
public class ZapatoDeportivo implements Zapato {

    @Override
    public boolean esElegante() {
        System.out.println("Zapatos deportivos -- ¿Son zapatos elegantes? -> No");
        return false;
    }

    @Override
    public boolean esParaCorrer() {
        System.out.println("Zapatos deportivos -- ¿Son zapatos para correr? -> Sí");
        return true;
    }
}
