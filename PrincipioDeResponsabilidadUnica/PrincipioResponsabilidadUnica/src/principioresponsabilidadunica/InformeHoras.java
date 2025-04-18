/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principioresponsabilidadunica;

/**
 *
 * @author germa
 */
public class InformeHoras  {
    public String generar(Empleado empleado) {
        return "Empleado: " + empleado.getNombre() + " - Horas trabajadas: " + empleado.getHorasTrabajadas();
    }
}
