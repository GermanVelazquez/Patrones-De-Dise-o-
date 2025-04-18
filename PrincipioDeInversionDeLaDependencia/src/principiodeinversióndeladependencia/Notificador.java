/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principiodeinversióndeladependencia;

/**
 *
 * @author germa
 * Clase de alto nivel
 */
public class Notificador {
    private ServicioDeMensaje servicio;

    public Notificador(ServicioDeMensaje servicio) {
        this.servicio = servicio;
    }

    public void notificar(String destinatario, String mensaje) {
        servicio.enviarMensaje(destinatario, mensaje);
    }
}
