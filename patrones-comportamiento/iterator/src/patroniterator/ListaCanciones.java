/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patroniterator;

/**
 *
 * @author germa
 */
import java.util.ArrayList;
import java.util.List;

public class ListaCanciones {
    private List<Cancion> canciones = new ArrayList<>();

    public void agregar(Cancion cancion) {
        canciones.add(cancion);
    }

    public Iterador crearIterador() {
        return new IteradorCanciones(canciones);
    }
}