/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronstate;

/**
 *
 * @author germa
 */
public class Patronstate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Semaforo semaforo = new Semaforo();

        // Cambiar los estados del semáforo en secuencia
        semaforo.cambiarEstado();  // Verde -> Amarillo
        semaforo.cambiarEstado();  // Amarillo -> Rojo
        semaforo.cambiarEstado();  // Rojo -> Verde
    }
    
}
