package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemo {
    static void main() {
        JFrame frame = new JFrame();
        frame.setTitle("SIS :: Login");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout()); //borderlayout
        //panel
        JPanel header = new JPanel();//flowlayout
        header.add(new JLabel("Student Information System"));
        frame.add(header, BorderLayout.NORTH);

        JPanel footer = new JPanel();
        JButton btnLogin = new JButton("Login");
        footer.add(btnLogin);
        JButton btnReset = new JButton("Reset");
        footer.add(btnReset);
        frame.add(footer, BorderLayout.SOUTH);

        JPanel mainPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        mainPanel.add(new JLabel("Username:"));
        JTextField tfUsername = new JTextField();
        mainPanel.add(tfUsername);
        mainPanel.add(new JLabel("Student ID:"));
        mainPanel.add(new JTextField(10));
        mainPanel.add(new JLabel("Password:"));
        mainPanel.add(new JPasswordField());
        frame.add(mainPanel, BorderLayout.CENTER);

        //event source -> register -> event listener -> event object
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnLogin, "Username: " + tfUsername.getText());
            }
        });

        //lambda expression param -> body
        btnReset.addActionListener(e -> {
            tfUsername.setText("");
        });

        frame.pack();
        frame.setVisible(true);
//        JFrame frame = new JFrame("My First Frame");
//        frame.setSize(500, 300);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JButton button = new JButton("Click me");
//        frame.add(button);
//        frame.setVisible(true);
//        JOptionPane.showMessageDialog(null, "hello", "hi", JOptionPane.INFORMATION_MESSAGE);
        //parsing -> coversion from String to other type
//        try {
//            int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//        } catch(NumberFormatException ex){
//            JOptionPane.showMessageDialog(null, "Invalid Input");
//        }
//        String response = JOptionPane.showInputDialog(null , "Enter your name:", "Input", JOptionPane.WARNING_MESSAGE);
//        if(response != null)
//            JOptionPane.showMessageDialog(null, "your name is "+ response);
    }
}
