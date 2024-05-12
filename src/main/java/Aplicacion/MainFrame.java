package Aplicacion;

import Lab.ManejoExperimentoImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private ManejoExperimentoImpl manejoExperimento;

    public MainFrame() {
        manejoExperimento = new ManejoExperimentoImpl();

        setTitle("Gestor de cultivo de bacterias");
        setSize(800, 600); // Ajusta el tamaño de la ventana
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel mainPanel = new MainPanel(manejoExperimento);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(mainPanel, BorderLayout.CENTER);

        // Crear un nuevo botón para cerrar la aplicación
        JButton closeButton = new JButton("Cerrar aplicación");
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Agregar el botón al panel principal
        getContentPane().add(closeButton, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}