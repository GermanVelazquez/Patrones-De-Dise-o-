/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronadapter;

/**
 *
 * @author germa
 */
public class AdaptadorEnchufe implements Enchufe {
    private Enchufe enchufeOriginal;

    public AdaptadorEnchufe(Enchufe enchufeOriginal) {
        this.enchufeOriginal = enchufeOriginal;
    }

    @Override
    public void conectar() {
        System.out.println("Adaptando enchufe...");
        enchufeOriginal.conectar(); // Llamada al método de la clase original
    }
}