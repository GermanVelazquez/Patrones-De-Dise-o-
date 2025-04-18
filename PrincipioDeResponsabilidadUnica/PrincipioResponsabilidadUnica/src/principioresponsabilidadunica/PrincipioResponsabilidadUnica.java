/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principioresponsabilidadunica;

/**
 *
 * @author germa
 */
public class PrincipioResponsabilidadUnica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan Perez", 40);
        InformeHoras informe = new InformeHoras();

        System.out.println(informe.generar(empleado));
    }
    
}
/* RESPETA LA RESPONSABILDIAD UNICA  YA QUE EMPLEADO NO GENERA SU INFORME */