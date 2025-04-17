/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author germa
 */
public class ReporteVentas extends Reporte {

    public ReporteVentas(Exportador exportador) {
        super(exportador);
    }
    
    @Override
    public void generar(){
        String title = "Reporte de ventas";
        String content = "Ventas totales del mes: XXXX";
        exportador.exportar(title, content);
    }
}
