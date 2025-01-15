package Part2;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de Figuras Geométricas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(null);

        JLabel labelFigura = new JLabel("Seleccione la figura:");
        labelFigura.setBounds(20, 20, 300, 25);

        String[] opciones = {"Círculo (Ingresa dato 1-Radio)", "Cuadrado (Ingresa dato 1-Lado)", "Rectángulo (Ingresa dato 1-Base y dato 2-Altura)", "Triángulo Rectángulo (Ingresa dato 1-Base y dato 2-Altura)"};
        JComboBox<String> comboFiguras = new JComboBox<>(opciones);
        comboFiguras.setBounds(180, 20, 300, 25);

        JLabel label1 = new JLabel("Dato 1:");
        label1.setBounds(20, 60, 100, 25);
        JTextField textDato1 = new JTextField();
        textDato1.setBounds(180, 60, 300, 25);

        JLabel label2 = new JLabel("Dato 2:");
        label2.setBounds(20, 100, 100, 25);
        JTextField textDato2 = new JTextField();
        textDato2.setBounds(180, 100, 300, 25);

        JButton buttonCalcular = new JButton("Calcular");
        buttonCalcular.setBounds(100, 140, 150, 30);

        JTextArea textAreaResultado = new JTextArea();
        textAreaResultado.setBounds(100, 180, 340, 150);
        textAreaResultado.setEditable(false);

        frame.add(labelFigura);
        frame.add(comboFiguras);
        frame.add(label1);
        frame.add(textDato1);
        frame.add(label2);
        frame.add(textDato2);
        frame.add(buttonCalcular);
        frame.add(textAreaResultado);

        buttonCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String figura = (String) comboFiguras.getSelectedItem();
                try {
                    int dato1 = Integer.parseInt(textDato1.getText());
                    int dato2 = textDato2.getText().isEmpty() ? 0 : Integer.parseInt(textDato2.getText());
                    double area = 0, perimetro = 0;

                    switch (figura) {
                        case "Círculo":
                            Circulo c = new Circulo(dato1);
                            area = c.calcularArea();
                            perimetro = c.calcularPerimetro();
                            break;
                        case "Cuadrado":
                            Cuadrado cu = new Cuadrado(dato1);
                            area = cu.calcularArea();
                            perimetro = cu.calcularPerimetro();
                            break;
                        case "Rectángulo":
                            Rectangulo r = new Rectangulo(dato1, dato2);
                            area = r.calcularArea();
                            perimetro = r.calcularPerimetro();
                            break;
                        case "Triángulo Rectángulo":
                            TrianguloRectangulo t = new TrianguloRectangulo(dato1, dato2);
                            area = t.calcularArea();
                            perimetro = t.calcularPerimetro();
                            break;
                    }
                    textAreaResultado.setText("Área: " + area + "\nPerímetro: " + perimetro);
                } catch (NumberFormatException ex) {
                    textAreaResultado.setText("Por favor, ingrese valores válidos.");
                }
            }
        });

        frame.setVisible(true);
    }
} 