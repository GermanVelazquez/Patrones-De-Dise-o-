/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronmediator;

/**
 *
 * @author germa
 */
public class Patronmediator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChatMediator sala = new SalaChat();

        Usuario usuario1 = new UsuarioConcreto(sala, "Ana");
        Usuario usuario2 = new UsuarioConcreto(sala, "Juan");
        Usuario usuario3 = new UsuarioConcreto(sala, "Lucía");

        sala.agregarUsuario(usuario1);
        sala.agregarUsuario(usuario2);
        sala.agregarUsuario(usuario3);

        usuario1.enviar("Hola a todos!");
    }
    
}
