package D_Ejercicio4;


import java.util.ArrayList;
import java.util.List;

public class GestorDeLista {
    private List<String> lista;

    public GestorDeLista() {
        lista = new ArrayList<>();
    }

    public void agregarElemento(String elemento) {
        lista.add(elemento);
    }

    public void eliminarUltimoElemento() {
        if (!lista.isEmpty()) {
            lista.remove(lista.size() - 1);
        }
    }

    public List<String> getLista() {
        return lista;
    }
}

