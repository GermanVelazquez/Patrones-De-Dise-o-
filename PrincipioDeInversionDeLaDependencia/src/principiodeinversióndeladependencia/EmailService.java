/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principiodeinversióndeladependencia;

/**
 *
 * @author germa
 * Implementación de bajo nivel 1
 */
public class EmailService implements ServicioDeMensaje {
    @Override
    public void enviarMensaje(String destinatario, String mensaje) {
        System.out.println("Enviando EMAIL a " + destinatario + ": " + mensaje);
    }
}
