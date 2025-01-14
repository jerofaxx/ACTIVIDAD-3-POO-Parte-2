import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PruebaFiguras {

    public void mostrarVentana() {
        JFrame frame = new JFrame("Prueba de Figuras Geométricas");
        frame.setSize(1000, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1, 2));

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new BoxLayout(inputPanel, BoxLayout.Y_AXIS));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Entrada de Datos"));

        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new BorderLayout());
        resultPanel.setBorder(BorderFactory.createTitledBorder("Resultados"));

        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);
        resultArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        resultArea.setBackground(new Color(240, 240, 240));
        JScrollPane scrollPane = new JScrollPane(resultArea);
        resultPanel.add(scrollPane, BorderLayout.CENTER);

        JTextField radioField = new JTextField(10);
        JTextField baseRectanguloField = new JTextField(10);
        JTextField alturaRectanguloField = new JTextField(10);
        JTextField ladoCuadradoField = new JTextField(10);
        JTextField baseTrianguloField = new JTextField(10);
        JTextField alturaTrianguloField = new JTextField(10);
        JTextField diagonalMayorRomboField = new JTextField(10);
        JTextField diagonalMenorRomboField = new JTextField(10);
        JTextField baseMayorTrapecioField = new JTextField(10);
        JTextField baseMenorTrapecioField = new JTextField(10);
        JTextField alturaTrapecioField = new JTextField(10);

        inputPanel.add(new JLabel("Radio del Círculo:"));
        inputPanel.add(radioField);
        inputPanel.add(new JLabel("Base del Rectángulo:"));
        inputPanel.add(baseRectanguloField);
        inputPanel.add(new JLabel("Altura del Rectángulo:"));
        inputPanel.add(alturaRectanguloField);
        inputPanel.add(new JLabel("Lado del Cuadrado:"));
        inputPanel.add(ladoCuadradoField);
        inputPanel.add(new JLabel("Base del Triángulo Rectángulo:"));
        inputPanel.add(baseTrianguloField);
        inputPanel.add(new JLabel("Altura del Triángulo Rectángulo:"));
        inputPanel.add(alturaTrianguloField);
        inputPanel.add(new JLabel("Diagonal Mayor del Rombo:"));
        inputPanel.add(diagonalMayorRomboField);
        inputPanel.add(new JLabel("Diagonal Menor del Rombo:"));
        inputPanel.add(diagonalMenorRomboField);
        inputPanel.add(new JLabel("Base Mayor del Trapecio:"));
        inputPanel.add(baseMayorTrapecioField);
        inputPanel.add(new JLabel("Base Menor del Trapecio:"));
        inputPanel.add(baseMenorTrapecioField);
        inputPanel.add(new JLabel("Altura del Trapecio:"));
        inputPanel.add(alturaTrapecioField);

        JButton ejecutarButton = new JButton("Ejecutar Pruebas");
        ejecutarButton.addActionListener((ActionEvent e) -> {
            try {
                int radio = Integer.parseInt(radioField.getText());
                int baseRectangulo = Integer.parseInt(baseRectanguloField.getText());
                int alturaRectangulo = Integer.parseInt(alturaRectanguloField.getText());
                int ladoCuadrado = Integer.parseInt(ladoCuadradoField.getText());
                int baseTriangulo = Integer.parseInt(baseTrianguloField.getText());
                int alturaTriangulo = Integer.parseInt(alturaTrianguloField.getText());
                int diagonalMayorRombo = Integer.parseInt(diagonalMayorRomboField.getText());
                int diagonalMenorRombo = Integer.parseInt(diagonalMenorRomboField.getText());
                int baseMayorTrapecio = Integer.parseInt(baseMayorTrapecioField.getText());
                int baseMenorTrapecio = Integer.parseInt(baseMenorTrapecioField.getText());
                int alturaTrapecio = Integer.parseInt(alturaTrapecioField.getText());

                Circulo circulo = new Circulo(radio);
                Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
                Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
                TrianguloRectangulo triangulo = new TrianguloRectangulo(baseTriangulo, alturaTriangulo);
                Rombo rombo = new Rombo(diagonalMayorRombo, diagonalMenorRombo);
                Trapecio trapecio = new Trapecio(baseMayorTrapecio, baseMenorTrapecio, alturaTrapecio);

                resultArea.setText("Resultados:\n");
                resultArea.append("Área del Círculo: " + circulo.calcularArea() + "\n");
                resultArea.append("Perímetro del Círculo: " + circulo.calcularPerimetro() + "\n");
                resultArea.append("Área del Rectángulo: " + rectangulo.calcularArea() + "\n");
                resultArea.append("Perímetro del Rectángulo: " + rectangulo.calcularPerimetro() + "\n");
                resultArea.append("Área del Cuadrado: " + cuadrado.calcularArea() + "\n");
                resultArea.append("Perímetro del Cuadrado: " + cuadrado.calcularPerimetro() + "\n");
                resultArea.append("Área del Triángulo Rectángulo: " + triangulo.calcularArea() + "\n");
                resultArea.append("Perímetro del Triángulo Rectángulo: " + triangulo.calcularPerimetro() + "\n");
                resultArea.append("Área del Rombo: " + rombo.calcularArea() + "\n");
                resultArea.append("Perímetro del Rombo: " + rombo.calcularPerimetro() + "\n");
                resultArea.append("Área del Trapecio: " + trapecio.calcularArea() + "\n");
                resultArea.append("Perímetro del Trapecio: " + trapecio.calcularPerimetro() + "\n");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Por favor, ingrese datos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        inputPanel.add(ejecutarButton);

        frame.add(inputPanel);
        frame.add(resultPanel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new PruebaFiguras().mostrarVentana();
    }
}
