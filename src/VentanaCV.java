import javax.swing.*;

class VentanaCV extends JFrame {
    VentanaCV() {
        setTitle("Generador de CV");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPersonal = new JPanel();
        panelPersonal.add(new JLabel("Nombre:"));
        panelPersonal.add(new JTextField(20));
        panelPersonal.add(new JLabel("Correo:"));
        panelPersonal.add(new JTextField(20));
        panelPersonal.add(new JLabel("Teléfono:"));
        panelPersonal.add(new JTextField(20));

        JTabbedPane pestanas = new JTabbedPane();
        pestanas.addTab("Datos Personales", panelPersonal);
        pestanas.addTab("Idiomas", new JPanel());
        pestanas.addTab("Experiencia", new JPanel());
        pestanas.addTab("Educación", new JPanel());
        add(pestanas);

        setVisible(true);
    }
}