/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronfactorymethod;

/**
 *
 * @author germa
 */
public class SMSNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification(String target) {
        return new SMSNotification(target);
    }
}