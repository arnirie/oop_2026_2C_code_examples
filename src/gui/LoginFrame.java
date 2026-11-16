package gui;

import javax.swing.*;
import java.awt.event.*;

public class LoginFrame extends JFrame{
    private JPanel mainPanel;
    private JPanel header;
    private JPanel footer;
    private JPanel form;
    private JButton btnLogin;
    private JButton btnReset;
    private JTextField tfUsername;
    private JTextField tfStudentId;
    private JPasswordField tfPassword;

    public LoginFrame(){
        //set properties jframe
        setTitle("SIS :: Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        pack();
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnLogin,  tfUsername.getText() + "\n" + tfStudentId.getText() + "\n" + new String(tfPassword.getPassword()));
            }
        });
        btnReset.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                IO.println("clicked");
                tfUsername.setText("");
                tfStudentId.setText("");
                tfPassword.setText("");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                IO.println("pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                IO.println("released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                IO.println("entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                IO.println("exited");
            }

            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                super.mouseWheelMoved(e);
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
            }
        });
    }
}
