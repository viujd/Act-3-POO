import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejer18 {
    public static void main(String[] args) {
        // Crear la ventana
        JFrame frame = new JFrame("Información del Empleado");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 2, 10, 10));

        // Crear etiquetas y campos de texto
        JLabel nombreLabel = new JLabel("Nombre:");
        JTextField nombreField = new JTextField();

        JLabel horasLabel = new JLabel("Horas laborales:");
        JTextField horasField = new JTextField();

        JLabel valorHoraLabel = new JLabel("Valor por hora ($):");
        JTextField valorHoraField = new JTextField();

        JLabel retencionLabel = new JLabel("Retención (%):");
        JTextField retencionField = new JTextField();

        JButton calcularButton = new JButton("Calcular");
        JTextArea resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);

        // Agregar componentes a la ventana
        frame.add(nombreLabel);
        frame.add(nombreField);
        frame.add(horasLabel);
        frame.add(horasField);
        frame.add(valorHoraLabel);
        frame.add(valorHoraField);
        frame.add(retencionLabel);
        frame.add(retencionField);
        frame.add(calcularButton);
        frame.add(resultadoArea);

        // Acción del botón
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = nombreField.getText();
                    int horas = Integer.parseInt(horasField.getText());
                    double valorHora = Double.parseDouble(valorHoraField.getText());
                    double retencion = Double.parseDouble(retencionField.getText());

                    double salarioBruto = horas * valorHora;
                    double salarioNeto = salarioBruto - (salarioBruto * retencion / 100);

                    resultadoArea.setText(
                        "Nombre: " + nombre +
                        "\nSalario Bruto: $" + salarioBruto +
                        "\nSalario Neto: $" + salarioNeto
                    );
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese valores válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Mostrar la ventana
        frame.setVisible(true);
    }
}

