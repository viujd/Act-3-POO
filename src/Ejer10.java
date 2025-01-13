import javax.swing.*; // Importar bibliotecas para GUI

// Clase principal
public class Ejer10 {

    // Método principal que ejecuta la aplicación
    public static void main(String[] args) {
        // Crear una ventana para la GUI
        JFrame frame = new JFrame("Liquidación de Matrícula");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Crear un panel para agregar los componentes
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        // Configurar tamaño de la ventana
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    // Método para agregar los componentes al panel
    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Crear etiquetas
        JLabel labelNI = new JLabel("Número de Inscripción:");
        labelNI.setBounds(10, 20, 150, 25);
        panel.add(labelNI);

        JTextField textNI = new JTextField(20);
        textNI.setBounds(160, 20, 200, 25);
        panel.add(textNI);

        JLabel labelNOM = new JLabel("Nombres:");
        labelNOM.setBounds(10, 50, 150, 25);
        panel.add(labelNOM);

        JTextField textNOM = new JTextField(20);
        textNOM.setBounds(160, 50, 200, 25);
        panel.add(textNOM);

        JLabel labelPAT = new JLabel("Patrimonio:");
        labelPAT.setBounds(10, 80, 150, 25);
        panel.add(labelPAT);

        JTextField textPAT = new JTextField(20);
        textPAT.setBounds(160, 80, 200, 25);
        panel.add(textPAT);

        JLabel labelEST = new JLabel("Estrato Social:");
        labelEST.setBounds(10, 110, 150, 25);
        panel.add(labelEST);

        JTextField textEST = new JTextField(20);
        textEST.setBounds(160, 110, 200, 25);
        panel.add(textEST);

        // Crear botón para calcular
        JButton calculateButton = new JButton("Calcular Matrícula");
        calculateButton.setBounds(10, 140, 150, 25);
        panel.add(calculateButton);

        // Crear un área de texto para mostrar el resultado
        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(10, 170, 350, 60);
        resultArea.setEditable(false);
        panel.add(resultArea);

        // Acción del botón de calcular
        calculateButton.addActionListener(e -> {
            try {
                // Obtener los valores de los campos de texto
                String NI = textNI.getText();
                String NOM = textNOM.getText();
                double PAT = Double.parseDouble(textPAT.getText());
                int EST = Integer.parseInt(textEST.getText());

                // Inicializar el valor de matrícula
                double PAGMAT = 50000;

                // Condición para incrementar el pago de matrícula
                if (PAT > 2000000 && EST > 3) {
                    PAGMAT += 0.03 * PAT;
                }

                // Mostrar el resultado en el área de texto
                resultArea.setText("El estudiante con número de inscripción: " + NI +
                        "\nY nombre: " + NOM + "\nDebe pagar: $" + PAGMAT);
            } catch (NumberFormatException ex) {
                resultArea.setText("Por favor, ingrese valores válidos.");
            }
        });
    }
}
