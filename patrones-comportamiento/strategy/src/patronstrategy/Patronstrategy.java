/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronstrategy;

/**
 *
 * @author germa
 */
public class Patronstrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarritoDeCompras carrito = new CarritoDeCompras();

        carrito.setEstrategia(new PagoConTarjeta("1234-5678-9012-3456"));
        carrito.procesarPago(150.0);

        carrito.setEstrategia(new PagoConPaypal("usuario@paypal.com"));
        carrito.procesarPago(80.5);

        carrito.setEstrategia(new PagoConCripto("0xABCDEF123456"));
        carrito.procesarPago(300.75);
    }
    
}
