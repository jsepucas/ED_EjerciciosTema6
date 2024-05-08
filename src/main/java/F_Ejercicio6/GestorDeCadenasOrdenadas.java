package F_Ejercicio6;

import java.util.Set;
import java.util.TreeSet;

public class GestorDeCadenasOrdenadas {
    private Set<String> cadenas;

    public GestorDeCadenasOrdenadas() {
        cadenas = new TreeSet<>();
    }

    public void agregarCadena(String cadena) {
        cadenas.add(cadena);
    }

    public void eliminarCadena(String cadena) {
        cadenas.remove(cadena);
    }

    public Set<String> getCadenas() {
        return cadenas;
    }
}