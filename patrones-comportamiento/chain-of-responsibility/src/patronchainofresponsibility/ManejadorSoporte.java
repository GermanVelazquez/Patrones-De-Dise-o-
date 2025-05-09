/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronchainofresponsibility;

/**
 *
 * @author germa
 */
public abstract class ManejadorSoporte {
    protected ManejadorSoporte siguiente;

    public void setSiguiente(ManejadorSoporte siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void manejarSolicitud(String tipo);
}