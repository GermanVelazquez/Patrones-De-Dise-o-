/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronflyweight;

/**
 *
 * @author germa
 */
import java.util.HashMap;
import java.util.Map;

public class FabricaDeLetras {
    private final Map<Character, Letra> letras = new HashMap<>();

    public Letra getLetra(char c) {
        // Si ya existe la letra, se reutiliza
        if (!letras.containsKey(c)) {
            letras.put(c, new LetraConcreta(c));
            System.out.println("Creando nueva instancia para letra: '" + c + "'");
        }
        return letras.get(c);
    }
}