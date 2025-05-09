/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronadapter;

/**
 *
 * @author germa
 */
public class Patronadapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Enchufe enchufeA = new EnchufeTipoA(); // Enchufe de tipo A
        Enchufe enchufeB = new EnchufeTipoB(); // Enchufe de tipo B

        // Adaptando y usando el enchufe tipo A en otro tipo de enchufe
        System.out.println("Usando adaptador para conectar tipo A en tipo B:");
        Enchufe adaptadorA = new AdaptadorEnchufe(enchufeA);
        adaptadorA.conectar();

        // Usando el adaptador con el tipo B
        System.out.println("\nUsando adaptador para conectar tipo B en tipo A:");
        Enchufe adaptadorB = new AdaptadorEnchufe(enchufeB);
        adaptadorB.conectar();
    }
    
}
