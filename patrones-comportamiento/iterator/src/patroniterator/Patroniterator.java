/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patroniterator;

/**
 *
 * @author germa
 */
public class Patroniterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCanciones lista = new ListaCanciones();
        lista.agregar(new Cancion("Imagine"));
        lista.agregar(new Cancion("Bohemian Rhapsody"));
        lista.agregar(new Cancion("Stairway to Heaven"));

        Iterador iterador = lista.crearIterador();

        while (iterador.tieneSiguiente()) {
            Cancion actual = iterador.siguiente();
            System.out.println("Reproduciendo: " + actual.getTitulo());
        }
    }
    
}
