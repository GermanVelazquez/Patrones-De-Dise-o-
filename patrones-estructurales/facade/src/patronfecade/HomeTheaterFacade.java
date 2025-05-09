/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronfecade;

/**
 *
 * @author germa
 */
public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Amplifier amplifier;
    private Projector projector;
    private Screen screen;
    private Lights lights;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Amplifier amplifier, Projector projector, Screen screen, Lights lights) {
        this.dvdPlayer = dvdPlayer;
        this.amplifier = amplifier;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
    }

    // Método simplificado para encender todo el sistema y ver una película
    public void verPelicula(String movie) {
        System.out.println("\nPreparando sistema para ver la película...");
        lights.dim(10);  // Atenúa las luces
        screen.down();   // Baja la pantalla
        projector.on();  // Enciende el proyector
        amplifier.on();  // Enciende el amplificador
        amplifier.setVolume(10); // Ajusta el volumen
        dvdPlayer.on(); // Enciende el reproductor
        dvdPlayer.play(movie); // Reproduce la película
    }

    // Método simplificado para apagar todo el sistema
    public void apagarSistema() {
        System.out.println("\nApagando sistema de Home Theater...");
        lights.on();    // Enciende las luces
        screen.up();    // Sube la pantalla
        projector.off(); // Apaga el proyector
        amplifier.off(); // Apaga el amplificador
        dvdPlayer.off(); // Apaga el reproductor
    }
}