/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronstrategy;

/**
 *
 * @author germa
 */
public class PagoConCripto implements EstrategiaPago {
    private String wallet;

    public PagoConCripto(String wallet) {
        this.wallet = wallet;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando $" + monto + " con criptomonedas desde wallet: " + wallet);
    }
}