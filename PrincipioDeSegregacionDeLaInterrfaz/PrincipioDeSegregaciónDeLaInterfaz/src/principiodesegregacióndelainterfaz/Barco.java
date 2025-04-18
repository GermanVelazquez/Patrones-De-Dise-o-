/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principiodesegregacióndelainterfaz;

/**
 *
 * @author germa
 */
public class Barco implements VehiculoAcuatico {
    @Override
    public void flotar() {
        System.out.println("El barco esta flotando.");
    }
}
