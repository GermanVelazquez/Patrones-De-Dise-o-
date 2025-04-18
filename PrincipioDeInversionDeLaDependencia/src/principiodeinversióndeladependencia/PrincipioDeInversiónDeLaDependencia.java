/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principiodeinversióndeladependencia;

/**
 *
 * @author germa
 */
public class PrincipioDeInversiónDeLaDependencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioDeMensaje servicioEmail = new EmailService();
        ServicioDeMensaje servicioSMS = new SMSService();

        Notificador notificadorEmail = new Notificador(servicioEmail);
        Notificador notificadorSMS = new Notificador(servicioSMS);

        System.out.println("== Notificacion por Email ==");
        notificadorEmail.notificar("juan@example.com", "Tu pedido fue enviado.");

        System.out.println("\n== Notificacion por SMS ==");
        notificadorSMS.notificar("+5491122334455", "Tu codigo de verificacion es 123456.");
    }
    
}
