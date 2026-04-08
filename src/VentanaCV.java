import javax.swing.*;
import java.awt.*;

class VentanaCV extends JFrame {
    VentanaCV() {
        setTitle("CV generator");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPersonal = new JPanel();
        panelPersonal.add(new JLabel("Name:"));
        panelPersonal.add(new JTextField(20));
        panelPersonal.add(new JLabel("Mail:"));
        panelPersonal.add(new JTextField(20));
        panelPersonal.add(new JLabel("Telephone:"));
        panelPersonal.add(new JTextField(20));

        panelPersonal.setLayout(new GridLayout(3, 2, 10, 10));

        JPanel wrapperPersonal = new JPanel();
        wrapperPersonal.add(panelPersonal);

        JTextField campoLanguage = new JTextField(20);
        JTextField campoLevel = new JTextField(20);
        JTextField campoCertification = new JTextField(20);

        DefaultListModel<String> listaModel = new DefaultListModel<>();
        JList<String> listaIdiomas = new JList<>(listaModel);
        JButton botonAgregar = new JButton("Add language");

        botonAgregar.addActionListener(e -> {
            String idioma = campoLanguage.getText() + " - " + campoLevel.getText() + " - " + campoCertification.getText();
            listaModel.addElement(idioma);
            campoLanguage.setText("");
            campoLevel.setText("");
            campoCertification.setText("");
        });

        JPanel panelIdiomas = new JPanel();
        panelIdiomas.add(new JLabel("Language:"));
        panelIdiomas.add(campoLanguage);
        panelIdiomas.add(new JLabel("Level:"));
        panelIdiomas.add(campoLevel);
        panelIdiomas.add(new JLabel("Certification:"));
        panelIdiomas.add(campoCertification);

        panelIdiomas.setLayout(new GridLayout(3, 2, 10, 10));

        JPanel wrapperIdiomas = new JPanel();
        wrapperIdiomas.add(panelIdiomas);
        wrapperIdiomas.add(botonAgregar);
        wrapperIdiomas.add(new JScrollPane(listaIdiomas));

        JTabbedPane pestanas = new JTabbedPane();
        pestanas.addTab("Personal Data", wrapperPersonal);
        pestanas.addTab("Languages", wrapperIdiomas);
        pestanas.addTab("Experience", new JPanel());
        pestanas.addTab("Education", new JPanel());
        add(pestanas);

        setVisible(true);
    }
}