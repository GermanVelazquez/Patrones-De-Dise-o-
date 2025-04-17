/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author germa
 */
public class CamisaDeportiva implements Camisa {

    @Override
    public boolean tieneMangasLargas() {
        System.out.println("Camisa deportiva -- ¿Tiene mangas largas? -> No");
        return false;
    }

    @Override
    public boolean tieneBotones() {
        System.out.println("Camisa deportiva -- ¿Tiene botones? -> No");
        return false;
    }
}