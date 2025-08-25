import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FrmJuego extends JFrame {

    // Metodo constructor

    public FrmJuego() {
        setTitle("Juego de Dados");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblDado1 = new JLabel();
        String archivoImagen = "imagenes/3.jpg";
        ImageIcon imgDado = new ImageIcon(getClass().getResource(archivoImagen));
        lblDado1.setIcon(imgDado);
        lblDado1.setBounds(10, 10, imgDado.getIconWidth(), imgDado.getIconHeight());
        getContentPane().add(lblDado1);

        JLabel lblDado2 = new JLabel();
        lblDado2.setIcon(imgDado);
        lblDado2.setBounds(20 + imgDado.getIconWidth(), 10, imgDado.getIconWidth(), imgDado.getIconHeight());
        getContentPane().add(lblDado2);

        JLabel lblTituloLanzamiento = new JLabel("Lanzamientos:");
        lblTituloLanzamiento.setBounds(100 + 2 * imgDado.getIconWidth(), 10, 100, 25);
        getContentPane().add(lblTituloLanzamiento);

        JLabel lblTituloCenas = new JLabel("Cenas:");
        lblTituloCenas.setBounds(240 + 2 * imgDado.getIconWidth(), 40, 100, 25);
        getContentPane().add(lblTituloCenas);

        JLabel lbLanzamientos = new JLabel("0");
        lbLanzamientos.setBounds(30 + 2 * imgDado.getIconWidth(), 40, 100, 100);
        lbLanzamientos.setFont(new Font("Tahoma", 1, 72));
        lbLanzamientos.setHorizontalAlignment(SwingConstants.RIGHT);
        lbLanzamientos.setBackground(new Color(0, 0, 0));
        lbLanzamientos.setForeground(new Color(60, 255, 0));
        lbLanzamientos.setOpaque(true);
        getContentPane().add(lbLanzamientos);

        JLabel lbCenas = new JLabel("0");
        lbCenas.setBounds(140 + 2 * imgDado.getIconWidth(), 40, 100, 100);
        lbCenas.setFont(new Font("Tahoma", 1, 72));
        lbCenas.setHorizontalAlignment(SwingConstants.RIGHT);
        lbCenas.setBackground(new Color(0, 0, 0));
        lbCenas.setForeground(new Color(60, 255, 0));
        lbCenas.setOpaque(true);
        getContentPane().add(lbCenas);

        JButton btnIniciar = new JButton("Iniciar");
        btnIniciar.setBounds(10, 10 + imgDado.getIconWidth(), 100, 25);
        getContentPane().add(btnIniciar);

        JButton btnLanzar = new JButton("Lanzar");
        btnLanzar.setBounds(10, 40 + imgDado.getIconWidth(), 100, 25);
        getContentPane().add(btnLanzar);

        btnIniciar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarLanzamientos();
            }

        });

        btnLanzar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Lanzar();
            }

        });

    }

    private void iniciarLanzamientos() {

    }

    private void Lanzar() {

    }
}
