import javax.swing.*; // Importar bibliotecas para GUI

// Clase principal
public class Ejer22 {

    // Método principal que ejecuta la aplicación
    public static void main(String[] args) {
        // Crear una ventana para la GUI
        JFrame frame = new JFrame("Cálculo de Salario");
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
        JLabel labelNombre = new JLabel("Nombre del Empleado:");
        labelNombre.setBounds(10, 20, 150, 25);
        panel.add(labelNombre);

        JTextField textNombre = new JTextField(20);
        textNombre.setBounds(160, 20, 200, 25);
        panel.add(textNombre);

        JLabel labelSalarioHora = new JLabel("Salario por Hora:");
        labelSalarioHora.setBounds(10, 50, 150, 25);
        panel.add(labelSalarioHora);

        JTextField textSalarioHora = new JTextField(20);
        textSalarioHora.setBounds(160, 50, 200, 25);
        panel.add(textSalarioHora);

        JLabel labelHorasTrabajadas = new JLabel("Horas Trabajadas:");
        labelHorasTrabajadas.setBounds(10, 80, 150, 25);
        panel.add(labelHorasTrabajadas);

        JTextField textHorasTrabajadas = new JTextField(20);
        textHorasTrabajadas.setBounds(160, 80, 200, 25);
        panel.add(textHorasTrabajadas);

        // Crear botón para calcular
        JButton calculateButton = new JButton("Calcular Salario");
        calculateButton.setBounds(10, 110, 150, 25);
        panel.add(calculateButton);

        // Crear un área de texto para mostrar el resultado
        JTextArea resultArea = new JTextArea();
        resultArea.setBounds(10, 140, 350, 60);
        resultArea.setEditable(false);
        panel.add(resultArea);

        // Acción del botón de calcular
        calculateButton.addActionListener(e -> {
            try {
                // Obtener los valores de los campos de texto
                String nombre = textNombre.getText();
                double salarioHora = Double.parseDouble(textSalarioHora.getText());
                int horasTrabajadas = Integer.parseInt(textHorasTrabajadas.getText());

                // Calcular el salario mensual
                double salarioMensual = salarioHora * horasTrabajadas;

                // Mostrar el resultado
                if (salarioMensual > 450000) {
                    resultArea.setText("Empleado: " + nombre + "\nSalario mensual: $" + salarioMensual);
                } else {
                    resultArea.setText("Empleado: " + nombre);
                }
            } catch (NumberFormatException ex) {
                resultArea.setText("Por favor, ingrese valores válidos.");
            }
        });
    }
}
