package Vues;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmMenu extends JFrame {
    private JPanel pnlRoot;

    private ImageIcon imgOrt;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JLabel lblCo;
    private JButton btnConnexion;
    private JButton btnInscription;
    private JLabel lblImgo;
    private JLabel lblMdp;
    private JLabel lblNomu;
    private JLabel lblLogo;

    public FrmMenu()
    {
        this.setTitle("V1");
        this.setContentPane(pnlRoot);
        this.setPreferredSize(new Dimension(1100,600));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        btnInscription.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO : Ajouter commande pour ouvrir un nouveau formulaire et fermer l'accueil
                FrmInscription frmI = new FrmInscription();
                frmI.setVisible(true);
                dispose();

            }
        });
    }

}
