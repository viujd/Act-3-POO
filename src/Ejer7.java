import javax.swing.*; // Importar bibliotecas para GUI

// Clase principal
public class Ejer7 {

    // Método principal que ejecuta la aplicación
    public static void main(String[] args) {
        // Crear una ventana para la GUI
        JFrame frame = new JFrame("Comparación de Números");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Crear un panel para agregar los componentes
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        // Configurar tamaño de la ventana
        frame.setSize(350, 200);
        frame.setVisible(true);
    }

    // Método para agregar los componentes al panel
    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Crear etiquetas
        JLabel userLabelA = new JLabel("Valor A:");
        userLabelA.setBounds(10, 20, 80, 25);
        panel.add(userLabelA);

        JTextField userTextA = new JTextField(20);
        userTextA.setBounds(100, 20, 165, 25);
        panel.add(userTextA);

        JLabel userLabelB = new JLabel("Valor B:");
        userLabelB.setBounds(10, 50, 80, 25);
        panel.add(userLabelB);

        JTextField userTextB = new JTextField(20);
        userTextB.setBounds(100, 50, 165, 25);
        panel.add(userTextB);

        // Crear botón para comparar
        JButton compareButton = new JButton("Comparar");
        compareButton.setBounds(10, 80, 150, 25);
        panel.add(compareButton);

        // Crear un campo para mostrar el resultado
        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(10, 110, 250, 40);
        resultArea.setEditable(false);
        panel.add(resultArea);

        // Acción del botón de comparar
        compareButton.addActionListener(e -> {
            try {
                // Obtener los valores de A y B
                int A = Integer.parseInt(userTextA.getText());
                int B = Integer.parseInt(userTextB.getText());

                // Lógica para comparar los valores de A y B
                if (A > B) {
                    resultArea.setText("A es mayor que B");
                } else if (A == B) {
                    resultArea.setText("A es igual a B");
                } else {
                    resultArea.setText("A es menor que B");
                }
            } catch (NumberFormatException ex) {
                resultArea.setText("Por favor, ingrese números válidos.");
            }
        });
    }
}
