package Part1;
import javax.swing.*;

public class Ejer23 {
    private double A;
    private double B;
    private double C;

    public Ejer23(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double calcularDiscriminante() {
        return B * B - 4 * A * C;
    }

    public String calcularSoluciones() {
        double discriminante = calcularDiscriminante();
        if (discriminante > 0) {
            double x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double x2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            return "Soluciones reales:\nX1 = " + x1 + "\nX2 = " + x2;
        } else if (discriminante == 0) {
            double x = -B / (2 * A);
            return "Solución doble (unica solución real):\nX = " + x;
        } else {
            return "No hay soluciones reales.";
        }
    }

    public Ejer23() {
        // Crear la ventana
        JFrame frame = new JFrame("Ejercicio 23 (cap 4)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        //Label y text
        JLabel labelEc = new JLabel("Ecuacion Ax^2 + Bx + C = 0");
        labelEc.setBounds(100, 10, 200, 25);
        
        JLabel labelA = new JLabel("Valor de A:");
        labelA.setBounds(10, 50, 150, 25);
        JTextField textA = new JTextField(20);
        textA.setBounds(180, 50, 200, 25);

        JLabel labelB = new JLabel("Valor de B:");
        labelB.setBounds(10, 90, 150, 25);
        JTextField textB = new JTextField(20);
        textB.setBounds(180, 90, 200, 25);

        JLabel labelC = new JLabel("Valor de C:");
        labelC.setBounds(10, 130, 150, 25);
        JTextField textC = new JTextField(20);
        textC.setBounds(180, 130, 200, 25);

        // Botón
        JButton buttonCalcular = new JButton("Calcular Soluciones");
        buttonCalcular.setBounds(100, 165, 200, 60);

        JTextArea textAreaResultado = new JTextArea();
        textAreaResultado.setBounds(100, 240, 200, 100);
        textAreaResultado.setEditable(false);

        // Agregar componentes 
        frame.add(labelEc);
        frame.add(labelA);
        frame.add(textA);
        frame.add(labelB);
        frame.add(textB);
        frame.add(labelC);
        frame.add(textC);
        frame.add(buttonCalcular);
        frame.add(textAreaResultado);

        // Acción del botón
        buttonCalcular.addActionListener(e -> {
            try {
                double A = Double.parseDouble(textA.getText());
                double B = Double.parseDouble(textB.getText());
                double C = Double.parseDouble(textC.getText());

                // Crear el objeto 
                Ejer23 ecuacion = new Ejer23(A, B, C);

                textAreaResultado.setText(ecuacion.calcularSoluciones());
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

