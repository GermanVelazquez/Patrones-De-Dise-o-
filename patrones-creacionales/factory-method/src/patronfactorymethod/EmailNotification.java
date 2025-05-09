/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronfactorymethod;

/**
 *
 * @author germa
 */
public class EmailNotification implements Notification {
    private String recipient;

    public EmailNotification(String recipient) {
        this.recipient = recipient;
    }

    @Override
    public void notifyUser() {
        System.out.println("Enviando EMAIL a " + recipient);
    }
}