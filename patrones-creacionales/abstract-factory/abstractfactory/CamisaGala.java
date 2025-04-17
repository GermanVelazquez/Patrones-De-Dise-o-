/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author germa
 */
public class CamisaGala implements Camisa {
        @Override
    public boolean tieneMangasLargas() {
        System.out.println("Camisa de gala -- ¿Tiene mangas largas? -> Sí");
        return true;
    }

    @Override
    public boolean tieneBotones() {
        System.out.println("Camisa de gala -- ¿Tiene botones? -> Sí");
        return true;
    }
}
