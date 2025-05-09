/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronstate;

/**
 *
 * @author germa
 */
public class EstadoAmarillo implements EstadoSemaforo {

    @Override
    public void cambiarEstado(Semaforo semaforo) {
        System.out.println("El semáforo está en AMARILLO. Prepara para detenerte.");
        semaforo.setEstado(new EstadoRojo());  // Cambia el estado a "Rojo" después de un tiempo.
    }
}