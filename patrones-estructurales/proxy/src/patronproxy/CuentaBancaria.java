/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronproxy;

/**
 *
 * @author germa
 */
public class CuentaBancaria implements MedioDePago {
    private EfectivoFisico efectivo;

    public CuentaBancaria() {
        this.efectivo = new EfectivoFisico();
    }

    @Override
    public void realizarPago(double monto) {
        System.out.println("Transferencia desde la CUENTA BANCARIA por $" + monto);
        efectivo.realizarPago(monto); // Delega al efectivo
    }
}