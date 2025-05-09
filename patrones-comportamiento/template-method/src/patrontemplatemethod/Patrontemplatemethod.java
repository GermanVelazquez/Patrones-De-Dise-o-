/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patrontemplatemethod;

/**
 *
 * @author germa
 */
public class Patrontemplatemethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               BebidaCaliente cafe = new Cafe();
        System.out.println("Preparando café:");
        cafe.prepararReceta();

        System.out.println("\n--------------------------\n");

        BebidaCaliente te = new Te();
        System.out.println("Preparando té:");
        te.prepararReceta();
    }
    
}
