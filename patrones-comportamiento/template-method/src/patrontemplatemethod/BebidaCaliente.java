/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patrontemplatemethod;

/**
 *
 * @author germa
 */


public abstract class BebidaCaliente {

    // Método plantilla (template method)
    public final void prepararReceta() {
        hervirAgua();
        agregarIngredientePrincipal();
        servirEnTaza();
        agregarExtras(); // Hook (opcional)
    }

    private void hervirAgua() {
        System.out.println("Hirviendo agua...");
    }

    private void servirEnTaza() {
        System.out.println("Sirviendo en taza...");
    }

    // Métodos que deben implementar las subclases
    protected abstract void agregarIngredientePrincipal();

    // Método opcional (hook)
    protected void agregarExtras() {
        // Se puede sobreescribir o dejarlo vacío
    }
}
