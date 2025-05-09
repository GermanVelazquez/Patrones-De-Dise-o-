/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronfecade;

/**
 *
 * @author germa
 */
public class Patronfecade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();
        Screen screen = new Screen();
        Lights lights = new Lights();

        // Crear el objeto Facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, amplifier, projector, screen, lights);

        // Usar el Facade para ver una película
        homeTheater.verPelicula("Inception");

        // Apagar el sistema
        homeTheater.apagarSistema();
    }
    
}
