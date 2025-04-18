/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principioabiertocerrado;

/**
 *
 * @author germa
 */
public class ImpuestoAlimentos implements EstrategiaImpuesto {
    public double calcularImpuesto(double precio) {
        return precio * 0.05;  // 5% de impuestos para alimentos
    }
}