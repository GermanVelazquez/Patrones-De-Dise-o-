/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronstrategy;

/**
 *
 * @author germa
 */
public class PagoConTarjeta implements EstrategiaPago {
    private String numeroTarjeta;

    public PagoConTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando $" + monto + " con tarjeta: " + numeroTarjeta);
    }
}