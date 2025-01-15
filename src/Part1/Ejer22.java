package Part1;
import javax.swing.*;

public class Ejer22 {
    private String nombre;
    private double salarioPorHora;
    private int horasTrabajadas;

    public Ejer22(String nombre, double salarioPorHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double calcularSalarioMensual() {
        return salarioPorHora * horasTrabajadas;
    }

    public Ejer22() {
        // Crear la ventana
        JFrame frame = new JFrame("Ejercicio 22 (cap 4)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        //Label y text
        JLabel labelNombre = new JLabel("Nombre:");
        labelNombre.setBounds(10, 20, 150, 25);
        JTextField textNombre = new JTextField(20);
        textNombre.setBounds(180, 20, 200, 25);

        JLabel labelSalarioPorHora = new JLabel("Salario por Hora:");
        labelSalarioPorHora.setBounds(10, 60, 150, 25);
        JTextField textSalarioPorHora = new JTextField(20);
        textSalarioPorHora.setBounds(180, 60, 200, 25);

        JLabel labelHorasTrabajadas = new JLabel("Horas Trabajadas:");
        labelHorasTrabajadas.setBounds(10, 100, 150, 25);
        JTextField textHorasTrabajadas = new JTextField(20);
        textHorasTrabajadas.setBounds(180, 100, 200, 25);

        // Botón 
        JButton buttonCalcular = new JButton("Calcular Salario");
        buttonCalcular.setBounds(10, 140, 150, 60);

        JTextArea textAreaResultado = new JTextArea();
        textAreaResultado.setBounds(180, 140, 200, 60);
        textAreaResultado.setEditable(false);

        // Agregar componentes 
        frame.add(labelNombre);
        frame.add(textNombre);
        frame.add(labelSalarioPorHora);
        frame.add(textSalarioPorHora);
        frame.add(labelHorasTrabajadas);
        frame.add(textHorasTrabajadas);
        frame.add(buttonCalcular);
        frame.add(textAreaResultado);

        // Acción del botón
        buttonCalcular.addActionListener(e -> {
            try {
                String nombre = textNombre.getText();
                double salarioPorHora = Double.parseDouble(textSalarioPorHora.getText());
                int horasTrabajadas = Integer.parseInt(textHorasTrabajadas.getText());

                // Crear el objeto 
                Ejer22 empleado = new Ejer22(nombre, salarioPorHora, horasTrabajadas);

                double salarioMensual = empleado.calcularSalarioMensual();
                if (salarioMensual > 450000) {
                    textAreaResultado.setText("Nombre: " + empleado.nombre + "\nSalario Mensual: $" + String.format("%.2f", salarioMensual));
                } else {
                    textAreaResultado.setText("Nombre: " + empleado.nombre);
                }

            } catch (NumberFormatException ex) {
                textAreaResultado.setText("Por favor, ingrese valores válidos.");
            }
        });
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
    	new Ejer18();
    }
}