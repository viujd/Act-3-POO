package Part1;
import javax.swing.*;

public class Ejer7 {
    private int A;
    private int B;

    public Ejer7(int A, int B) {
        this.A = A;
        this.B = B;
    }

    public String comparar() {
        if (A > B) {
            return "A es mayor que B";
        } else if (A == B) {
            return "A es igual a B";
        } else {
            return "A es menor que B";
        }
    }

    public Ejer7() {
        // Crear la ventana
        JFrame frame = new JFrame("Ejercicio 7 (cap 4)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setLayout(null);

        // Label y text
        JLabel labelA = new JLabel("Valor de A:");
        labelA.setBounds(10, 20, 150, 25);
        JTextField textA = new JTextField(20);
        textA.setBounds(160, 20, 200, 25);

        JLabel labelB = new JLabel("Valor de B:");
        labelB.setBounds(10, 60, 150, 25);
        JTextField textB = new JTextField(20);
        textB.setBounds(160, 60, 200, 25);

        // Botón 
        JButton buttonComparar = new JButton("Comparar");
        buttonComparar.setBounds(10, 100, 150, 60);

        JTextArea textAreaResultado = new JTextArea();
        textAreaResultado.setBounds(160, 100, 200, 60);
        textAreaResultado.setEditable(false);

        // Agregar componentes 
        frame.add(labelA);
        frame.add(textA);
        frame.add(labelB);
        frame.add(textB);
        frame.add(buttonComparar);
        frame.add(textAreaResultado);

        // Acción del botón
        buttonComparar.addActionListener(e -> {
            try {
                int A = Integer.parseInt(textA.getText());
                int B = Integer.parseInt(textB.getText());
                
                //Crear el objeto
                Ejer7 comparador = new Ejer7(A, B);

                textAreaResultado.setText(comparador.comparar());

            } catch (NumberFormatException ex) {
                textAreaResultado.setText("Por favor, ingrese valores numéricos válidos.");
            }
        });
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
    	new Ejer18();
    }
}