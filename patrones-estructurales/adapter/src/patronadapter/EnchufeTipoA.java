/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronadapter;

/**
 *
 * @author germa
 */
public class EnchufeTipoA implements Enchufe {

    @Override
    public void conectar() {
        System.out.println("Conectando a un enchufe de tipo A.");
    }
}