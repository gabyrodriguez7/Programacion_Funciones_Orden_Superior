package View;
import javax.swing.*;
import java.awt.*;
import Controller.Container;

public class Window extends JFrame {
    private JButton btnTriangulo, btnCirculo, btnCuadrado;
    private JPanel panelDibujo;
    private Container container;
    private String figuraActual;

    public Window() {
        super("Figuras Geométricas");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear botones
        btnTriangulo = new JButton("Triángulo");
        btnCirculo = new JButton("Círculo");
        btnCuadrado = new JButton("Cuadrado");
        setLocationRelativeTo(null);
        // Crear panel para el dibujo
        panelDibujo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (figuraActual != null) {
                    container.dibujarFigura(g, figuraActual);
                }
            }

        };
        panelDibujo.setBackground(Color.WHITE);

        // Configurar layout del JFrame
        setLayout(new BorderLayout());
        JPanel panelBotones = new JPanel();
        panelBotones.add(btnTriangulo);
        panelBotones.add(btnCirculo);
        panelBotones.add(btnCuadrado);

        add(panelBotones, BorderLayout.NORTH);
        add(panelDibujo, BorderLayout.CENTER);

        // Crear instancia del contenedor
        container = new Container();

        // Agregar listeners a los botones usando lambda
        btnTriangulo.addActionListener(e -> {
            figuraActual = "Triángulo";
            panelDibujo.repaint(); // Redibujar el panel
        });

        btnCirculo.addActionListener(e -> {
            figuraActual = "Círculo";
            panelDibujo.repaint(); // Redibujar el panel
        });

        btnCuadrado.addActionListener(e -> {
            figuraActual = "Cuadrado";
            panelDibujo.repaint(); // Redibujar el panel
        });
    }
}