/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronfactorymethod;

/**
 *
 * @author germa
 */
public class Patronfactorymethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // Fábrica de notificaciones por Email
        NotificationFactory emailFactory = new EmailNotificationFactory();
        Notification email = emailFactory.createNotification("correo@ejemplo.com");
        email.notifyUser();

        // Fábrica de notificaciones por SMS
        NotificationFactory smsFactory = new SMSNotificationFactory();
        Notification sms = smsFactory.createNotification("+541122334455");
        sms.notifyUser();
    }
    
}
