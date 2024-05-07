package A_Ejercicio1;


public class Pareja<T1, T2> {
    private T1 primerElemento;
    private T2 segundoElemento;

    // Constructor
    public Pareja(T1 primerElemento, T2 segundoElemento) {
        this.primerElemento = primerElemento;
        this.segundoElemento = segundoElemento;
    }

    // Método 1º elemento
    public T1 getPrimerElemento() {
        return primerElemento;
    }

    // Método 2º elemento
    public T2 getSegundoElemento() {
        return segundoElemento;
    }
}