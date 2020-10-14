package Tareas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JPanel {

    // ventana
    private JFrame ventana;
    // contenedor
    private Container contenedor;

    public Ventana() {
// inicializar la ventana
        ventana = new JFrame("Dibujando icono");
        // definir tamaño a ventana
        ventana.setSize(1100, 650);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);

        contenedor = ventana.getContentPane();
        contenedor.setSize(1100, 650);
        // agregar la ventana en el contenedor
        contenedor.add(this, BorderLayout.CENTER);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Figuras f = new Figuras();

        g.setColor(Color.RED);
        f.figura1(g);
        g.setColor(Color.BLUE);
        f.figura2(g);
        g.setColor(Color.LIGHT_GRAY);
        f.figura3(g);
        g.setColor(Color.MAGENTA);
        f.figura4(g);
        g.setColor(Color.ORANGE);
        f.figura5(g);
        g.setColor(Color.PINK);
        f.figura6(g);

    }
}
