/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principioabiertocerrado;

/**
 *
 * @author germa
 */
public class ImpuestoElectronica implements EstrategiaImpuesto {
    public double calcularImpuesto(double precio) {
        return precio * 0.20;  // 20% de impuestos para electrónica
    }
}