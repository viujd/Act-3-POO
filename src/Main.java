import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        // Crear la ventana del menú
        JFrame frame = new JFrame("Menú de Ejercicios");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(null);

        String[] ejercicios = {
            "Ejercicio 18 - Salario del empleado",
            "Ejercicio 19 - Triángulo equilátero",
            "Ejercicio 7 - Comparación de A y B",
            "Ejercicio 10 - Pago de matrícula",
            "Ejercicio Ecuación de Segundo Grado"
        };
        JComboBox<String> comboEjercicios = new JComboBox<>(ejercicios);
        comboEjercicios.setBounds(50, 50, 300, 30);

        // Botón
        JButton buttonAbrir = new JButton("Abrir Ejercicio");
        buttonAbrir.setBounds(50, 100, 300, 50);

        // Agregar componentes
        frame.add(comboEjercicios);
        frame.add(buttonAbrir);

        // Acción del botón
        buttonAbrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ejercicioSeleccionado = (String) comboEjercicios.getSelectedItem();

                switch (ejercicioSeleccionado) {
                    case "Ejercicio 18 - Salario del empleado":
                        new Ejer18();
                        break;
                    case "Ejercicio 19 - Triángulo equilátero":
                        new Ejer19(); 
                        break;
                    case "Ejercicio 7 - Comparación de A y B":
                        new Ejer7();
                        break;
                    case "Ejercicio 10 - Pago de matrícula":
                        new Ejer10(); 
                        break;
                    case "Ejercicio 22 - Pago de horas de trabajo":
                        new Ejer10();
                        break;
                    case "Ejercicio 23 - Ecuacion de Segundo Grado":
                        new Ejer23();
                        break;
                    default:
                        JOptionPane.showMessageDialog(frame, "Ejercicio no reconocido.");
                }
            }
        });
        frame.setVisible(true);
    }
}

