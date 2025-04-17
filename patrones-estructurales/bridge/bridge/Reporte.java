/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author germa
 */
abstract class Reporte {
    protected Exportador exportador;

    public Reporte(Exportador exportador) {
        this.exportador = exportador;
    }
    public abstract void generar();
}