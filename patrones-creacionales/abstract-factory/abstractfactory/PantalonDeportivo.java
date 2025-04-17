/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author germa
 */
public class PantalonDeportivo implements Pantalon {

    @Override
    public boolean tieneBolsillos() {
        System.out.println("Pantalones deportivos -- ¿Tienen bolsillos? -> No");
        return false;
    }

    @Override
    public String tipoCierre() {
        System.out.println("Pantalones deportivos -- Tipo de cierre -> Sin cierre");
        return "Sin cierre";
    }
}
