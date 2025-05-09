/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronstate;

/**
 *
 * @author germa
 */
public class EstadoRojo implements EstadoSemaforo {

    @Override
    public void cambiarEstado(Semaforo semaforo) {
        System.out.println("El semáforo está en ROJO. Debes detenerte.");
        semaforo.setEstado(new EstadoVerde());  // Cambia el estado a "Verde" después de un tiempo.
    }
}