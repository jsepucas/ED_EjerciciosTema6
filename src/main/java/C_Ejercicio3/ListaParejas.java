package C_Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListaParejas {
    private List<Pareja<Integer, Integer>> parejas;

    public ListaParejas() {
        parejas = new ArrayList<>();
        llenarLista();
    }

    private void llenarLista() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int num1 = random.nextInt(100);  // Generar un entero aleatorio entre 0 y 99
            int num2 = random.nextInt(100);  // Generar otro entero aleatorio entre 0 y 99
            parejas.add(new Pareja<>(num1, num2));
        }
    }

    public List<Pareja<Integer, Integer>> getParejas() {
        return parejas;
    }
}