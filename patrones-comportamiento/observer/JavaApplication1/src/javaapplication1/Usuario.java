/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author germa
 */
/* OBSERVADOR 
- FUNCIONES PARA RECIBIR NOTIFICACIONES

*/
public class Usuario implements Subscriber {

    private String name;

    public Usuario (String name){
    this.name   = name;
    } 

    @Override
    public void Update(String NombreDelTitutlo) {
        System.out.println(name + " ha recibido una notificacion: Nuevo video disponible - " + NombreDelTitutlo);
    }



   
}
