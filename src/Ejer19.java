import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejer19 {
    public static void main(String[] args) {
        // Crear la ventana principal
        JFrame frame = new JFrame("Triángulo Equilátero");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        // Crear etiquetas y campos de texto
        JLabel ladoLabel = new JLabel("Lado del triángulo:");
        JTextField ladoField = new JTextField();

        JButton calcularButton = new JButton("Calcular");
        JTextArea resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);

        // Agregar componentes a la ventana
        frame.add(ladoLabel);
        frame.add(ladoField);
        frame.add(new JLabel()); // Espacio vacío
        frame.add(calcularButton);
        frame.add(new JLabel("Resultados:"));
        frame.add(resultadoArea);

        // Acción del botón
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double lado = Double.parseDouble(ladoField.getText());

                    // Cálculos
                    double perimetro = 3 * lado;
                    double altura = (Math.sqrt(3) / 2) * lado;
                    double area = (Math.sqrt(3) / 4) * lado * lado;

                    // Mostrar resultados
                    resultadoArea.setText(
                        "Perímetro: " + perimetro +
                        "\nAltura: " + altura +
                        "\nÁrea: " + area
                    );
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un valor válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Mostrar la ventana
        frame.setVisible(true);
    }
}
