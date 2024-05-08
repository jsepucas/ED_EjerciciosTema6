package F_Ejercicio6;

import javax.swing.*;
import java.awt.*;
import java.util.Set;

public class GestorCadenasOrdenadasGUI extends JFrame {
    private JTextArea cadenasArea;
    private JTextField entradaTextField;
    private JButton agregarButton;
    private JButton eliminarButton;
    private GestorDeCadenasOrdenadas gestorDeCadenas;

    public GestorCadenasOrdenadasGUI() {
        gestorDeCadenas = new GestorDeCadenasOrdenadas();
        crearGUI();
    }

    private void crearGUI() {
        setTitle("Gestor de Cadenas Ordenadas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel para entrada de datos y botones
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        entradaTextField = new JTextField(20);
        agregarButton = new JButton("Agregar");
        eliminarButton = new JButton("Eliminar");
        panel.add(new JLabel("Cadena:"));
        panel.add(entradaTextField);
        panel.add(agregarButton);
        panel.add(eliminarButton);
        add(panel, BorderLayout.NORTH);

        // Área de texto para mostrar las cadenas
        cadenasArea = new JTextArea();
        cadenasArea.setEditable(false);
        add(new JScrollPane(cadenasArea), BorderLayout.CENTER);

        // Eventos
        agregarButton.addActionListener(e -> agregarCadena());
        eliminarButton.addActionListener(e -> eliminarCadena());

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void agregarCadena() {
        gestorDeCadenas.agregarCadena(entradaTextField.getText());
        entradaTextField.setText("");
        actualizarCadenas();
    }

    private void eliminarCadena() {
        gestorDeCadenas.eliminarCadena(entradaTextField.getText());
        entradaTextField.setText("");
        actualizarCadenas();
    }

    private void actualizarCadenas() {
        Set<String> cadenas = gestorDeCadenas.getCadenas();
        cadenasArea.setText("");
        for (String cadena : cadenas) {
            cadenasArea.append(cadena + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GestorCadenasOrdenadasGUI());
    }
}
