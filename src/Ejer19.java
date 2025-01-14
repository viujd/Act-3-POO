import javax.swing.*;

public class Ejer19 {
    private double lado;

    public Ejer19(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro() {
        return 3 * lado;
    }

    public double calcularAltura() {
        return (Math.sqrt(3) / 2) * lado;
    }

    public double calcularArea() {
        return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
    }

    public Ejer19() {
        // Crear la ventana
        JFrame frame = new JFrame("Ejercicio 19 (cap 3)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setLayout(null);

        // Label y text
        JLabel labelLado = new JLabel("Lado del triángulo equilátero:");
        labelLado.setBounds(10, 20, 200, 25);
        JTextField textLado = new JTextField(20);
        textLado.setBounds(220, 20, 250, 25);

        // Botón 
        JButton buttonCalcular = new JButton("Calcular");
        buttonCalcular.setBounds(10, 60, 150, 60);
 
        JTextArea textAreaResultado = new JTextArea();
        textAreaResultado.setBounds(180, 60, 290, 60);
        textAreaResultado.setEditable(false);

        // Agregar componentes
        frame.add(labelLado);
        frame.add(textLado);
        frame.add(buttonCalcular);
        frame.add(textAreaResultado);

        // Acción del botón
        buttonCalcular.addActionListener(e -> {
            try {
                double lado = Double.parseDouble(textLado.getText());

                // Crear el objeto 
                Ejer19 triangulo = new Ejer19(lado);

                textAreaResultado.setText(
                    "Perímetro: " + String.format("%.2f", triangulo.calcularPerimetro()) +
                    "\nAltura: " + String.format("%.2f", triangulo.calcularAltura()) +
                    "\nÁrea: " + String.format("%.2f", triangulo.calcularArea())
                );

            } catch (NumberFormatException ex) {
                textAreaResultado.setText("Por favor, ingrese un valor válido para el lado.");
            }
        });
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
    	new Ejer18();
    }
}