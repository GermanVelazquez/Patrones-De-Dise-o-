/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author germa
 */
public class ReporteFinanciero extends Reporte {

    public ReporteFinanciero(Exportador exportador) {
        super(exportador);
    }
    
    @Override
    public void generar(){
        String title = "Reporte Financiero";
        String content = "Ingresos: $XXX, Egresos: $XXX";
        exportador.exportar(title, content);
    }
}