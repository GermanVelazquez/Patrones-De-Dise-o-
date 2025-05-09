/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrontemplatemethod;

/**
 *
 * @author germa
 */
public class Cafe extends BebidaCaliente {

    @Override
    protected void agregarIngredientePrincipal() {
        System.out.println("Agregando café molido...");
    }

    @Override
    protected void agregarExtras() {
        System.out.println("Agregando azúcar y leche...");
    }
}