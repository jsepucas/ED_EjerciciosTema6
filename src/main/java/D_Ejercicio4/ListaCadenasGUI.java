package D_Ejercicio4;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ListaCadenasGUI extends JFrame {
    private JTextArea listaArea;
    private JTextField entradaTextField;
    private JButton agregarButton;
    private JButton eliminarButton;
    private GestorDeLista gestorDeLista;

    public ListaCadenasGUI() {
        gestorDeLista = new GestorDeLista();
        crearGUI();
    }

    private void crearGUI() {
        setTitle("Gestor de Lista de Cadenas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel para entrada de datos y botones
        JPanel panel = new JPanel(new GridLayout(1, 3));
        entradaTextField = new JTextField();
        agregarButton = new JButton("Agregar");
        eliminarButton = new JButton("Eliminar");
        panel.add(entradaTextField);
        panel.add(agregarButton);
        panel.add(eliminarButton);
        add(panel, BorderLayout.NORTH);

        // Área de texto para mostrar la lista
        listaArea = new JTextArea();
        listaArea.setEditable(false);
        add(new JScrollPane(listaArea), BorderLayout.CENTER);

        // Eventos
        agregarButton.addActionListener(e -> agregarElemento());
        eliminarButton.addActionListener(e -> eliminarElemento());

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void agregarElemento() {
        gestorDeLista.agregarElemento(entradaTextField.getText());
        entradaTextField.setText("");
        actualizarLista();
    }

    private void eliminarElemento() {
        gestorDeLista.eliminarUltimoElemento();
        actualizarLista();
    }

    private void actualizarLista() {
        List<String> lista = gestorDeLista.getLista();
        listaArea.setText("");
        for (String elemento : lista) {
            listaArea.append(elemento + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ListaCadenasGUI());
    }
}

