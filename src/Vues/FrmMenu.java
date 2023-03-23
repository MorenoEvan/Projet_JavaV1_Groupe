package Vues;

import javax.swing.*;

public class FrmMenu extends JFrame {
    private JPanel pnlRoot;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JLabel lblCo;
    private JLabel lblTitre;

    public FrmMenu()
    {
        this.setTitle("V1");
        this.setContentPane(pnlRoot);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
    }
}
