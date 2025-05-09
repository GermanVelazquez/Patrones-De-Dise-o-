/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prototype;

/**
 *
 * @author germa
 */
public class Patronprototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ConcretePrototype original = new ConcretePrototype("Mensaje original");

        // Clonamos el objeto
        AbstractPrototype copia = original.clone();

        // Mostramos ambos objetos
        System.out.println("Original: " + original.getData());
        System.out.println("Copia: " + copia.getData());

        // Modificamos la copia
        copia.setData("Mensaje modificado");

        // Verificamos que son distintos objetos
        System.out.println("\nDespues de modificar la copia:");
        System.out.println("Original: " + original.getData());
        System.out.println("Copia: " + copia.getData());

        // Confirmamos que no son la misma instancia
        System.out.println("\n Son el mismo objeto?: " + (original == copia)); // false
    }
}
