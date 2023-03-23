package Vues;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class FrmInscription extends JFrame {


    private JPanel pnlRoot;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JLabel lblTitre;
    private JLabel lblNom;
    private JLabel lblPrn;
    private JLabel lblMail;
    private JLabel lblUtilisateur;
    private JLabel lblMdp;
    private JLabel lblTel;
    private JButton btnValider;
    private JCheckBox etudiantCheckBox;
    private JCheckBox professeurCheckBox;
    private JButton btnConnexion;


    public FrmInscription() {
        this.setTitle("Inscription");
        this.setContentPane(pnlRoot);
        this.setPreferredSize(new Dimension(500,400));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);






        btnValider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrmMenu frmMenu = new FrmMenu();
                frmMenu.setVisible(true);
                dispose();

            }
        });
        etudiantCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED)
                {
                    professeurCheckBox.setSelected(false);
                }
            }
        });
        professeurCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED)
                {
                    etudiantCheckBox.setSelected(false);
                }
            }
        });
    }
}
