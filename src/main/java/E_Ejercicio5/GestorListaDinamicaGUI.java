package E_Ejercicio5;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GestorListaDinamicaGUI extends JFrame {
    private JTextArea listaArea;
    private JTextField entradaTextField;
    private JTextField posicionTextField;
    private JButton agregarButton;
    private JButton eliminarButton;
    private GestorDeListaDinamica gestorDeLista;

    public GestorListaDinamicaGUI() {
        gestorDeLista = new GestorDeListaDinamica();
        crearGUI();
    }

    private void crearGUI() {
        setTitle("Gestor de Lista Dinámica");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel para entrada de datos y botones
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        entradaTextField = new JTextField(20);
        posicionTextField = new JTextField(5);
        agregarButton = new JButton("Agregar");
        eliminarButton = new JButton("Eliminar");
        panel.add(new JLabel("Cadena:"));
        panel.add(entradaTextField);
        panel.add(new JLabel("Posición:"));
        panel.add(posicionTextField);
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
        try {
            int posicion = Integer.parseInt(posicionTextField.getText());
            gestorDeLista.agregarElemento(posicion, entradaTextField.getText());
            entradaTextField.setText("");
            posicionTextField.setText("");
            actualizarLista();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido para la posición.");
        }
    }

    private void eliminarElemento() {
        try {
            int posicion = Integer.parseInt(posicionTextField.getText());
            gestorDeLista.eliminarElemento(posicion);
            posicionTextField.setText("");
            actualizarLista();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido para la posición.");
        }
    }

    private void actualizarLista() {
        List<String> lista = gestorDeLista.getLista();
        listaArea.setText("");
        for (String elemento : lista) {
            listaArea.append(elemento + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GestorListaDinamicaGUI());
    }
}