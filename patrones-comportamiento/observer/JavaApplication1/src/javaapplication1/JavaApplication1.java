/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author germa
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CanalYoutube channel = new CanalYoutube("TechReviews");
        
        Usuario user1 = new Usuario("Juan");
        Usuario user2 = new Usuario("Maria");
        Usuario user3 = new Usuario("Carlos");

        channel.subscribe(user1);
        channel.subscribe(user2);
        channel.subscribe(user3);

        channel.uploadVideo("Review del nuevo iPhone 15");

        channel.unsubscribe(user2);

        channel.uploadVideo("Comparacion de laptops 2025");
    }
    
}
