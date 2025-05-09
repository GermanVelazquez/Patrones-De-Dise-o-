/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronsingleton;

/**
 *
 * @author germa
 */
public  class Patronsingleton {

    public static void main(String[] args) {
        Singleton singleton1 =  Singleton.crearsingleton("BOO");
        Singleton singleton2 =  Singleton.crearsingleton("SIUUUUUUU");
        System.out.println("SI LOS VALORES SON IGUALES ENTONCES SOLO SE CREOO UN SINGLETON");
        System.out.println(singleton1.value);
         System.out.println(singleton2.value);
    }
    
}
