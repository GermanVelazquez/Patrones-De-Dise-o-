/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patroniterator;

/**
 *
 * @author germa
 */
import java.util.List;

public class IteradorCanciones implements Iterador {
    private List<Cancion> canciones;
    private int posicion = 0;

    public IteradorCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public boolean tieneSiguiente() {
        return posicion < canciones.size();
    }

    @Override
    public Cancion siguiente() {
        return canciones.get(posicion++);
    }
}