/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronchainofresponsibility;

/**
 *
 * @author germa
 */
public class Patronchainofresponsibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // Crear los manejadores
        ManejadorSoporte basico = new SoporteBasico();
        ManejadorSoporte tecnico = new SoporteTecnico();
        ManejadorSoporte gerencia = new Gerencia();

        // Armar la cadena
        basico.setSiguiente(tecnico);
        tecnico.setSiguiente(gerencia);

        // Solicitudes
        basico.manejarSolicitud("pregunta simple");   // Soporte Básico
        basico.manejarSolicitud("problema técnico");  // Soporte Técnico
        basico.manejarSolicitud("reclamo grave");     // Gerencia
        basico.manejarSolicitud("algo desconocido");  // No resuelta
    }
    
}
