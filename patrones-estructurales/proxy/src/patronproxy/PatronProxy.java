/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronproxy;

/**
 *
 * @author germa
 */
public class PatronProxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

       MedioDePago miTarjeta = new TarjetaCredito();

        System.out.println("=== Simulacion de pago ===");
        miTarjeta.realizarPago(2500.0);

        System.out.println("\nEl cliente hace otro pago:");
        miTarjeta.realizarPago(800.0);
    }
    
}
