/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author germa
 */
public class ExportarExcel implements Exportador {
    @Override
    public void exportar(String title, String content){
        System.out.println("Exportando EXCEL: " + title + "\nContenido: " + content);
    }
}