/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronflyweight;

/**
 *
 * @author germa
 */
public class LetraConcreta implements Letra {
    private final char simbolo; // Estado intrínseco: siempre igual para cada letra

    public LetraConcreta(char simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public void mostrar(String color) {
        // Estado extrínseco: el color puede cambiar cada vez
        System.out.println("Letra: '" + simbolo + "' mostrada en color: " + color);
    }
}