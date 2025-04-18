/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principioabiertocerrado;

/**
 *
 * @author germa
 */
public class PrincipioAbiertoCerrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calculamos impuestos para diferentes tipos de productos
        CalculadoraImpuestos calculadoraAlimentos = new CalculadoraImpuestos(new ImpuestoAlimentos());
        CalculadoraImpuestos calculadoraRopa = new CalculadoraImpuestos(new ImpuestoRopa());
        CalculadoraImpuestos calculadoraElectronica = new CalculadoraImpuestos(new ImpuestoElectronica());

        double precioAlimentos = 100.0;
        double precioRopa = 200.0;
        double precioElectronica = 500.0;

        System.out.println("Impuesto Alimentos: " + calculadoraAlimentos.calcular(precioAlimentos));  // 5%
        System.out.println("Impuesto Ropa: " + calculadoraRopa.calcular(precioRopa));  // 10%
        System.out.println("Impuesto Electronica: " + calculadoraElectronica.calcular(precioElectronica));  // 20%
    }
    
}
/*Abierto para extensión: Podemos agregar nuevos tipos de impuestos creando nuevas clases que implementen la interfaz EstrategiaImpuesto. 
No necesitamos tocar el código de CalculadoraImpuestos para hacer esto.*/

/*Cerrado para modificación: La clase CalculadoraImpuestos no cambia, solo la extendemos mediante nuevas clases de impuestos.
Esto evita que tengamos que modificar el código existente cuando introducimos nuevas funcionalidades.
*/