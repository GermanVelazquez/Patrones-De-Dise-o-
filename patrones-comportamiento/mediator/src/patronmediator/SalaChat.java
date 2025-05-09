/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronmediator;

/**
 *
 * @author germa
 */
import java.util.ArrayList;
import java.util.List;

public class SalaChat implements ChatMediator {
    private List<Usuario> usuarios = new ArrayList<>();

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void enviarMensaje(String mensaje, Usuario emisor) {
        for (Usuario usuario : usuarios) {
            if (usuario != emisor) {
                usuario.recibir(mensaje);
            }
        }
    }
}