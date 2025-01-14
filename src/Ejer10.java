import javax.swing.*;

public class Ejer10 {
    private String numeroInscripcion;
    private String nombres;
    private double patrimonio;
    private int estrato;

    public Ejer10(String numeroInscripcion, String nombres, double patrimonio, int estrato) {
        this.numeroInscripcion = numeroInscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estrato = estrato;
    }

    public double calcularPagoMatricula() {
        double pago = 50000;
        if (patrimonio > 2000000 && estrato > 3) {
            pago += 0.03 * patrimonio;
        }
        return pago;
    }

    public Ejer10() {
        // Crear la ventana
        JFrame frame = new JFrame("Ejercicio 10 (cap 4)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 330);
        frame.setLayout(null);

        //Label y text
        JLabel labelInscripcion = new JLabel("Número de Inscripción:");
        labelInscripcion.setBounds(10, 20, 200, 25);
        JTextField textInscripcion = new JTextField(20);
        textInscripcion.setBounds(180, 20, 200, 25);

        JLabel labelNombres = new JLabel("Nombres:");
        labelNombres.setBounds(10, 60, 150, 25);
        JTextField textNombres = new JTextField(20);
        textNombres.setBounds(180, 60, 200, 25);

        JLabel labelPatrimonio = new JLabel("Patrimonio:");
        labelPatrimonio.setBounds(10, 100, 150, 25);
        JTextField textPatrimonio = new JTextField(20);
        textPatrimonio.setBounds(180, 100, 200, 25);

        JLabel labelEstrato = new JLabel("Estrato Social:");
        labelEstrato.setBounds(10, 140, 150, 25);
        JTextField textEstrato = new JTextField(20);
        textEstrato.setBounds(180, 140, 200, 25);

        // Botón
        JButton buttonCalcular = new JButton("Calcular Pago");
        buttonCalcular.setBounds(125, 180, 150, 40);

        JTextArea textAreaResultado = new JTextArea();
        textAreaResultado.setBounds(10, 230, 370, 40);
        textAreaResultado.setEditable(false);
        textAreaResultado.setLineWrap(true);  
        textAreaResultado.setWrapStyleWord(true);

        // Agregar componentes 
        frame.add(labelInscripcion);
        frame.add(textInscripcion);
        frame.add(labelNombres);
        frame.add(textNombres);
        frame.add(labelPatrimonio);
        frame.add(textPatrimonio);
        frame.add(labelEstrato);
        frame.add(textEstrato);
        frame.add(buttonCalcular);
        frame.add(textAreaResultado);

        // Acción del botón
        buttonCalcular.addActionListener(e -> {
            try {
                String numeroInscripcion = textInscripcion.getText();
                String nombres = textNombres.getText();
                double patrimonio = Double.parseDouble(textPatrimonio.getText());
                int estrato = Integer.parseInt(textEstrato.getText());

                // Crear el objeto 
                Ejer10 estudiante = new Ejer10(numeroInscripcion, nombres, patrimonio, estrato);

                textAreaResultado.setText(
                        "El estudiante con número de inscripción " + estudiante.numeroInscripcion +
                                " y nombre " + estudiante.nombres +
                                " debe pagar: $" + String.format("%.2f", estudiante.calcularPagoMatricula())
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