/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronstrategy;

/**
 *
 * @author germa
 */
public class PagoConPaypal implements EstrategiaPago {
    private String email;

    public PagoConPaypal(String email) {
        this.email = email;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando $" + monto + " con PayPal: " + email);
    }
}