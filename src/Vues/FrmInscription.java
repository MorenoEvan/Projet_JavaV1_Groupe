package Vues;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmInscription extends JFrame {


    private JPanel pnlRoot;
    private JLabel lblTitre;
    private JButton btnConnexion;


    public FrmInscription() {
        this.setTitle("Inscription");
        this.setContentPane(pnlRoot);
        this.setPreferredSize(new Dimension(1100,600));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);






        btnConnexion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmMenu frmMenu = new FrmMenu();
                frmMenu.setVisible(true);
                dispose();

            }
        });
    }
}
