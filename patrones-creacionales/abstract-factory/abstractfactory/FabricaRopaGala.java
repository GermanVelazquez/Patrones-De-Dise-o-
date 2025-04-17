/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author germa
 */
public class FabricaRopaGala  implements FabricaRopa{
     @Override
    public Zapato crearZapatos() {
        return new ZapatoGala();
    }

    @Override
    public Camisa crearCamisa() {
        return new CamisaGala();
    }

    @Override
    public Pantalon crearPantalon() {
        return new PantalonGala();
    }
}
