/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronflyweight;

/**
 *
 * @author germa
 */
public class Patronflyweight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaDeLetras fabrica = new FabricaDeLetras();

        String texto = "hola mundo";
        String[] colores = {"rojo", "verde", "azul"};

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            Letra l = fabrica.getLetra(letra);
            l.mostrar(colores[i % colores.length]);  // Estado extrínseco
        }
    }
      
}
