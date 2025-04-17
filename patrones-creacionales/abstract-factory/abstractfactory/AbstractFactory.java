/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author germa
 */
/*
Utiliza el patrón Abstract Factory cuando tu código deba funcionar con varias familias de productos relacionados, 
pero no desees que dependa de las clases concretas de esos productos,
ya que puede ser que no los conozcas de antemano o sencillamente quieras permitir una futura extensibilidad.
*/
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FabricaRopa fabricaDeportiva = new FabricaRopaDeportiva();

        CamisaDeportiva camisaDeportiva = (CamisaDeportiva) fabricaDeportiva.crearCamisa();
        ZapatoDeportivo zapatoDeportivo = (ZapatoDeportivo) fabricaDeportiva.crearZapatos();
        PantalonDeportivo pantalonDeportivo = (PantalonDeportivo) fabricaDeportiva.crearPantalon();

        System.out.println("\n---> Ropa Deportiva <---");
        camisaDeportiva.tieneBotones();
        pantalonDeportivo.tipoCierre();
        zapatoDeportivo.esParaCorrer();

        // Fábrica de ropa de gala
        FabricaRopa fabricaGala = new FabricaRopaGala();

        CamisaGala camisaGala = (CamisaGala) fabricaGala.crearCamisa();
        PantalonGala pantalonGala = (PantalonGala) fabricaGala.crearPantalon();
        ZapatoGala zapatoGala = (ZapatoGala) fabricaGala.crearZapatos();

        System.out.println("\n---> Ropa de Gala <---");
        camisaGala.tieneBotones();
        pantalonGala.tipoCierre();
        zapatoGala.esParaCorrer();
    }
    
}
