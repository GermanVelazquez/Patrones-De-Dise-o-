/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronstate;

/**
 *
 * @author germa
 */
public class EstadoVerde implements EstadoSemaforo {

    @Override
    public void cambiarEstado(Semaforo semaforo) {
        System.out.println("El semáforo está en VERDE. Puedes avanzar.");
        semaforo.setEstado(new EstadoAmarillo());  // Cambia el estado a "Amarillo" después de un tiempo.
    }
}