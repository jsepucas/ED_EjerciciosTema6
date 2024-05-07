package C_Ejercicio3;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ListaParejasGUI extends JFrame {
    private JTextArea parejasArea;

    public ListaParejasGUI() {
        setTitle("Visualización de Parejas de Números");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());  // Usar BorderLayout para una mejor distribución

        // Área de texto para mostrar las parejas
        parejasArea = new JTextArea();
        parejasArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(parejasArea);
        add(scrollPane, BorderLayout.CENTER);

        // Obtener y mostrar datos
        ListaParejas listaParejas = new ListaParejas();
        mostrarParejas(listaParejas.getParejas());

        setLocationRelativeTo(null);  // Centrar ventana
        setVisible(true);
    }

    private void mostrarParejas(List<Pareja<Integer, Integer>> parejas) {
        StringBuilder builder = new StringBuilder();
        for (Pareja<Integer, Integer> pareja : parejas) {
            builder.append(pareja.toString()).append("\n");
        }
        parejasArea.setText(builder.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ListaParejasGUI());
    }
}
