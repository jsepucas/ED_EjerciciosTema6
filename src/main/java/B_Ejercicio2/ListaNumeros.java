package B_Ejercicio2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListaNumeros {
    private List<Double> arrayList;
    private List<Double> linkedList;

    public ListaNumeros() {
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
        llenarListas();
    }

    private void llenarListas() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            double valorAleatorio = random.nextDouble() * 100;  // Genera un número real aleatorio entre 0 y 100
            arrayList.add(valorAleatorio);
            linkedList.add(valorAleatorio);
        }
    }

    public List<Double> getArrayList() {
        return arrayList;
    }

    public List<Double> getLinkedList() {
        return linkedList;
    }
}