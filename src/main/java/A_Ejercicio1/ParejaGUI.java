package A_Ejercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParejaGUI extends JFrame {
    private JTextField primerElementoTextField;
    private JTextField segundoElementoTextField;
    private JButton crearParejaButton;
    private JLabel resultadoLabel;

    public ParejaGUI() {
        // Configuración inicial de la ventana
        setTitle("Crear Pareja");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 5, 5));

        // Componentes
        add(new JLabel("Primer Elemento:"));
        primerElementoTextField = new JTextField();
        add(primerElementoTextField);

        add(new JLabel("Segundo Elemento:"));
        segundoElementoTextField = new JTextField();
        add(segundoElementoTextField);

        crearParejaButton = new JButton("Crear Pareja");
        add(crearParejaButton);

        resultadoLabel = new JLabel(" ");
        add(resultadoLabel);

        // Ajustes adicionales
        add(new JLabel(""));
        add(new JLabel(""));  // Espacio en blanco para alinear el botón al centro

        // Manejador
        crearParejaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String primerElemento = primerElementoTextField.getText();
                String segundoElemento = segundoElementoTextField.getText();
                resultadoLabel.setText("Pareja creada: (" + primerElemento + ", " + segundoElemento + ")");
            }
        });

        setLocationRelativeTo(null);
        // Hacer visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ParejaGUI());
    }
}
