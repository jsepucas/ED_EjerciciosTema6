package E_Ejercicio5;

import java.util.LinkedList;
import java.util.List;

class GestorDeListaDinamica {
    private List<String> lista;

    public GestorDeListaDinamica() {
        lista = new LinkedList<>();
    }

    public void agregarElemento(int indice, String elemento) {
        // Asegurarse de que el índice sea válido
        if (indice >= 0 && indice <= lista.size()) {
            lista.add(indice, elemento);
        }
    }

    public void eliminarElemento(int indice) {
        // Asegurarse de que el índice sea válido
        if (indice >= 0 && indice < lista.size()) {
            lista.remove(indice);
        }
    }

    public List<String> getLista() {
        return lista;
    }
}