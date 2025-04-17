/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author germa
 */
public class FabricaRopaDeportiva implements FabricaRopa {
        @Override
    public Zapato crearZapatos() {
        return new ZapatoDeportivo();
    }

    @Override
    public Camisa crearCamisa() {
        return new CamisaDeportiva();
    }

    @Override
    public Pantalon crearPantalon() {
        return new PantalonDeportivo();
    }
}
