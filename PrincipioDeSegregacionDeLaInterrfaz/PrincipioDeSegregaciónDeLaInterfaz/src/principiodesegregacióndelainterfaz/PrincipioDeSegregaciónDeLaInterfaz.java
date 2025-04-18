/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principiodesegregacióndelainterfaz;

/**
 *
 * @author germa
 */
public class PrincipioDeSegregaciónDeLaInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VehiculoTerrestre coche = new Coche();
        VehiculoTerrestre bicicleta = new Bicicleta();
        VehiculoAcuatico barco = new Barco();

        System.out.println("=== Coche ===");
        coche.conducir();
        coche.acelerar();

        System.out.println("\n=== Bicicleta ===");
        bicicleta.conducir();
        bicicleta.acelerar();

        System.out.println("\n=== Barco ===");
        barco.flotar();
    }
    
}
