/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronchainofresponsibility;

/**
 *
 * @author germa
 */
public class SoporteTecnico extends ManejadorSoporte {
    @Override
    public void manejarSolicitud(String tipo) {
        if (tipo.equalsIgnoreCase("problema técnico")) {
            System.out.println("Soporte Técnico resolvió la solicitud.");
        } else if (siguiente != null) {
            siguiente.manejarSolicitud(tipo);
        } else {
            System.out.println("Solicitud no resuelta.");
        }
    }
}