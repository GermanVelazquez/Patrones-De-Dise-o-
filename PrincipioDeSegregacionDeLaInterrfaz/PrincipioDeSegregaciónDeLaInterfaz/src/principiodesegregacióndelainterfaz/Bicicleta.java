/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principiodesegregacióndelainterfaz;

/**
 *
 * @author germa
 */
public class Bicicleta implements VehiculoTerrestre {
    @Override
    public void conducir() {
        System.out.println("La bicicleta esta conduciendo.");
    }

    @Override
    public void acelerar() {
        System.out.println("La bicicleta esta acelerando.");
    }
}
