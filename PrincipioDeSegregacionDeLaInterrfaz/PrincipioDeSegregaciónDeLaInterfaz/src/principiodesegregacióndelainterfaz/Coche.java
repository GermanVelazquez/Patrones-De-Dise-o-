/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principiodesegregacióndelainterfaz;

/**
 *
 * @author germa
 */
public class Coche implements VehiculoTerrestre {
    @Override
    public void conducir() {
        System.out.println("El coche esta conduciendo.");
    }

    @Override
    public void acelerar() {
        System.out.println("El coche esta acelerando.");
    }
}
