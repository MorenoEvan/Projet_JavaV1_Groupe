package Vues;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmMenu extends JFrame {
    private JPanel pnlRoot;

    private ImageIcon imgOrt;
    private JTextField txtNom;
    private JPasswordField lblMotDePasse;
    private JLabel lblCo;
    private JButton btnConnexion;
    private JButton btnInscription;
    private JLabel lblImgo;
    private JLabel lblMdp;
    private JLabel lblNomu;
    private JLabel lblLogo;
    private JLabel lblInfo;
    private JLabel lblMention;
    private JLabel lblInfoMdp;
    private JLabel lblContact;
    private JLabel lblTel;
    private JLabel lblMail;


    public FrmMenu()
    {
        this.setTitle("Connexion");
        this.setContentPane(pnlRoot);
        this.setPreferredSize(new Dimension(1100,600));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        btnInscription.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmInscription frmI = new FrmInscription();
                frmI.setVisible(true);
                dispose();

            }
        });
        btnConnexion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (new FrmInscription().estEtudiant()) {
                    new FrmEtudiant().setVisible(true);
                } else if (new FrmInscription().estProfesseur()) {
                    new FrmProfesseur().setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"jsp");
                }


            }
        });
    }

}
