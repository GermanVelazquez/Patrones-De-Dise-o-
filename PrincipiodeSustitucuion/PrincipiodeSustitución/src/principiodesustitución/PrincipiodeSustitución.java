/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principiodesustitución;

/**
 *
 * @author germa
 */
public class PrincipiodeSustitución {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Creamos un arreglo de animales
        Animal[] animales = {
            new Perro(),
            new Gato(),
            new PerroEspecial()
        };

        // Iteramos sobre los animales y llamamos al método hacerSonido()
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
    
}
/*Las subclases de Animal (como Perro y Gato) y sus subclases (PerroEspecial) mantienen el comportamiento esperado y no lanzan excepciones inesperadas.*/
