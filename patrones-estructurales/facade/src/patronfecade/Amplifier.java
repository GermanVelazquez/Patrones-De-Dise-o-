/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronfecade;

/**
 *
 * @author germa
 */
public class Amplifier {
    public void on() {
        System.out.println("Amplificador está encendido.");
    }

    public void setVolume(int volume) {
        System.out.println("Volumen del amplificador ajustado a: " + volume);
    }

    public void off() {
        System.out.println("Amplificador está apagado.");
    }
}