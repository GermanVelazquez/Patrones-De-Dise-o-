/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronsingleton;

/**
 *
 * @author germa
 */
public final class Singleton {
    private static Singleton instance;
    public String value;
    
    private Singleton(String value){
     this.value = value;
    }
    
    public static Singleton crearsingleton (String value){
     if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
