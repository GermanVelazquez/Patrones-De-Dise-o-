/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrontemplatemethod;

/**
 *
 * @author germa
 */


public class Te extends BebidaCaliente {

    @Override
    protected void agregarIngredientePrincipal() {
        System.out.println("Agregando la bolsita de té...");
    }

    @Override
    protected void agregarExtras() {
        System.out.println("Agregando unas gotas de limón...");
    }
}
