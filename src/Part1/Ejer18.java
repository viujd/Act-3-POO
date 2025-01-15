package Part1;
import javax.swing.*;

public class Ejer18 {
    private String codigo;
    private String nombres;
    private int horasTrabajadas;
    private double valorHora;
    private double porcentajeRetencion;

    public Ejer18(String codigo, String nombres, int horasTrabajadas, double valorHora, double porcentajeRetencion) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.porcentajeRetencion = porcentajeRetencion;
    }

    public double calcularSalarioBruto() {
        return horasTrabajadas * valorHora;
    }

    public double calcularSalarioNeto() {
        return calcularSalarioBruto() * (1 - porcentajeRetencion / 100);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public Ejer18() {
        // Crear la ventana
        JFrame frame = new JFrame("Ejercicio 18 (cap 3)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(null);
        
        // Label y text
        JLabel labelCodigo = new JLabel("Código:");
        labelCodigo.setBounds(10, 20, 150, 25);
        JTextField textCodigo = new JTextField(20);
        textCodigo.setBounds(160, 20, 300, 25);
        
        JLabel labelNombre = new JLabel("Nombre:");
        labelNombre.setBounds(10, 50, 150, 25);
        JTextField textNombre = new JTextField(20);
        textNombre.setBounds(160, 50, 300, 25);

        JLabel labelHoras = new JLabel("Horas Trabajadas:");
        labelHoras.setBounds(10, 80, 150, 25);
        JTextField textHoras = new JTextField(20);
        textHoras.setBounds(160, 80, 300, 25);

        JLabel labelValorHora = new JLabel("Valor por Hora:");
        labelValorHora.setBounds(10, 110, 150, 25);
        JTextField textValorHora = new JTextField(20);
        textValorHora.setBounds(160, 110, 300, 25);

        JLabel labelRetencion = new JLabel("Retención (%):");
        labelRetencion.setBounds(10, 140, 150, 25);
        JTextField textRetencion = new JTextField(20);
        textRetencion.setBounds(160, 140, 300, 25);

        // Botón 
        JButton buttonCalcular = new JButton("Calcular");
        buttonCalcular.setBounds(10, 180, 150, 60);
       
        JTextArea textAreaResultado = new JTextArea();
        textAreaResultado.setBounds(180, 180, 280, 60);
        textAreaResultado.setEditable(false);

        // Agregar componentes a la ventana
        frame.add(labelCodigo);
        frame.add(textCodigo);
        frame.add(labelNombre);
        frame.add(textNombre);
        frame.add(labelHoras);
        frame.add(textHoras);
        frame.add(labelValorHora);
        frame.add(textValorHora);
        frame.add(labelRetencion);
        frame.add(textRetencion);
        frame.add(buttonCalcular);
        frame.add(textAreaResultado);

        // Acción del botón
        buttonCalcular.addActionListener(e -> {
            try {
                String codigo = textCodigo.getText();
                String nombre = textNombre.getText();
                int horas = Integer.parseInt(textHoras.getText());
                double valorHora = Double.parseDouble(textValorHora.getText());
                double retencion = Double.parseDouble(textRetencion.getText());

                // Crear el objeto 
                Ejer18 empleado = new Ejer18(codigo, nombre, horas, valorHora, retencion);
                
                textAreaResultado.setText(
                    "Código: " + empleado.getCodigo() +
                    "\nNombre: " + empleado.getNombres() +
                    "\nSalario Bruto: $" + String.format("%.2f", empleado.calcularSalarioBruto()) +
                    "\nSalario Neto: $" + String.format("%.2f", empleado.calcularSalarioNeto())
                );

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