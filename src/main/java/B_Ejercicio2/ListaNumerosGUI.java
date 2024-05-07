package B_Ejercicio2;

import javax.swing.*;
import java.awt.*;
import java.util.List;  // Importación correcta para utilizar listas de Java Collections

public class ListaNumerosGUI extends JFrame {
    private JTextArea arrayListArea;
    private JTextArea linkedListArea;

    public ListaNumerosGUI() {
        setTitle("Visualización de Listas de Números");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2, 10, 10));  // Dos columnas para cada lista

        // Área para ArrayList
        arrayListArea = new JTextArea();
        arrayListArea.setEditable(false);
        JScrollPane scrollPaneArrayList = new JScrollPane(arrayListArea);
        add(scrollPaneArrayList);

        // Área para LinkedList
        linkedListArea = new JTextArea();
        linkedListArea.setEditable(false);
        JScrollPane scrollPaneLinkedList = new JScrollPane(linkedListArea);
        add(scrollPaneLinkedList);

        // Obtener y mostrar datos
        ListaNumeros listaNumeros = new ListaNumeros(); // Asumimos que esta clase está correctamente definida en otro lugar
        mostrarDatos(listaNumeros.getArrayList(), arrayListArea);
        mostrarDatos(listaNumeros.getLinkedList(), linkedListArea);

        setLocationRelativeTo(null);  // Centrar ventana
        setVisible(true);
    }

    private void mostrarDatos(List<Double> lista, JTextArea textArea) {  // Asegurarse de que el tipo es List<Double>
        StringBuilder builder = new StringBuilder();
        for (Double numero : lista) {
            builder.append(String.format("%.2f\n", numero));  // Formatear con dos decimales
        }
        textArea.setText(builder.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ListaNumerosGUI());
    }
}
