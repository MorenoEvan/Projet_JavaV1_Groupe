package Vues;

import javax.swing.*;
import java.awt.*;

public class FrmConnecte extends JFrame{
    private JPanel pnlRoot;
    private JButton btnValider;
    private JLabel lblTitre;
    private JLabel lblNom;
    private JLabel lblPrn;
    private JLabel lblMail;
    private JLabel lblTel;
    private JLabel lblMdp;
    private JLabel lblUtilisateur;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;

    public FrmConnecte()
    {
        this.setTitle("Accueil");
        this.setContentPane(pnlRoot);
        this.setPreferredSize(new Dimension(1100,600));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
    }
}
