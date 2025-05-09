/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronstate;

/**
 *
 * @author germa
 */
public class Semaforo {
    private EstadoSemaforo estado;

    public Semaforo() {
        this.estado = new EstadoVerde();  // Estado inicial es "Verde"
    }

    public void setEstado(EstadoSemaforo estado) {
        this.estado = estado;
    }

    public void cambiarEstado() {
        estado.cambiarEstado(this);
    }
}