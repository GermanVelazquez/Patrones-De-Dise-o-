/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronfecade;

/**
 *
 * @author germa
 */
public class DVDPlayer {
    public void on() {
        System.out.println("DVD Player está encendido.");
    }

    public void play(String movie) {
        System.out.println("Reproduciendo película: " + movie);
    }

    public void off() {
        System.out.println("DVD Player está apagado.");
    }
}