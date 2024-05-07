package C_Ejercicio3;

public class Pareja<T1, T2> {
    private T1 primerElemento;
    private T2 segundoElemento;

    public Pareja(T1 primerElemento, T2 segundoElemento) {
        this.primerElemento = primerElemento;
        this.segundoElemento = segundoElemento;
    }

    @Override
    public String toString() {
        return "(" + primerElemento + ", " + segundoElemento + ")";
    }
}
