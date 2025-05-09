/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronproxy;

/**
 *
 * @author germa
 */
public class TarjetaCredito implements MedioDePago {
    private CuentaBancaria cuenta;

    public TarjetaCredito() {
        this.cuenta = new CuentaBancaria();
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Pago de $" + monto + " usando TARJETA DE CREDITO.");
        cuenta.realizarPago(monto); // Delega a la cuenta bancaria
    }
}