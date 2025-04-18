/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principioabiertocerrado;

/**
 *
 * @author germa
 */
public class CalculadoraImpuestos {
    private EstrategiaImpuesto estrategiaImpuesto;

    public CalculadoraImpuestos(EstrategiaImpuesto estrategiaImpuesto) {
        this.estrategiaImpuesto = estrategiaImpuesto;
    }

    public double calcular(double precio) {
        return estrategiaImpuesto.calcularImpuesto(precio);
    }
}
