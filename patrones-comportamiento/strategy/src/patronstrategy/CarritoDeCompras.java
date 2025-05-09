/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronstrategy;

/**
 *
 * @author germa
 */
public class CarritoDeCompras {
    private EstrategiaPago estrategia;

    public void setEstrategia(EstrategiaPago estrategia) {
        this.estrategia = estrategia;
    }

    public void procesarPago(double monto) {
        if (estrategia == null) {
            System.out.println("Error: No se ha seleccionado una estrategia de pago.");
        } else {
            estrategia.pagar(monto);
        }
    }
}