/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bridge;

/**
 *
 * @author germa
 */
public class Bridge {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // Crear un reporte financiero y exportarlo a PDF
        Reporte rep1 = new ReporteFinanciero(new ExportarPDF());
        rep1.generar();
        
        // Crear un reporte de ventas y exportarlo a Excel
        Reporte rep2 = new ReporteVentas(new ExportarExcel());
        rep2.generar();
    }
    
}
