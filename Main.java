import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Actividad 3 POO Parte 2");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        Color backgroundColor = new Color(245, 245, 245);
        Color buttonColor = new Color(100, 150, 255);

        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BorderLayout());
        headerPanel.setBackground(backgroundColor);

        JLabel headerLabel = new JLabel("<html><center>FIGURAS GEOMÉTRICAS<br>" +
                "Jeronimo Restrepo Ramirez<br>" +
                "Ciencias de la Computación<br>" +
                "Grupo: 4</center></html>", SwingConstants.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 16));
        headerLabel.setBackground(new Color(250, 216, 230));
        headerLabel.setOpaque(true);
        headerLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        try {
            ImageIcon originalIcon = new ImageIcon("gatito.jpg");
            Image scaledImage = originalIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);
            JLabel gatoLabel = new JLabel(scaledIcon);
            headerPanel.add(gatoLabel, BorderLayout.WEST);
        } catch (Exception e) {
            JLabel errorLabel = new JLabel("No se pudo cargar la imagen del gatito", SwingConstants.CENTER);
            headerPanel.add(errorLabel, BorderLayout.WEST);
        }

        headerPanel.add(headerLabel, BorderLayout.CENTER);
        frame.add(headerPanel, BorderLayout.NORTH);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        inputPanel.setBackground(backgroundColor);

        JButton pruebaFigurasButton = new JButton("Probar Figuras");
        pruebaFigurasButton.setBackground(buttonColor);
        pruebaFigurasButton.setFont(new Font("Arial", Font.BOLD, 14));
        pruebaFigurasButton.setForeground(Color.WHITE);
        pruebaFigurasButton.setFocusPainted(false);

        inputPanel.add(pruebaFigurasButton);
        frame.add(inputPanel, BorderLayout.CENTER);

        pruebaFigurasButton.addActionListener((ActionEvent e) -> {
            PruebaFiguras ventanaPrueba = new PruebaFiguras();
            ventanaPrueba.mostrarVentana();
        });

        frame.setVisible(true);
    }
}
