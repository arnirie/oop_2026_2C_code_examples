package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OtherComponents extends JFrame{
    private JSpinner spinner1;
    private JPanel mainPanel;
    private JButton button1;
    private JSlider slider1;
    private JTextArea textArea1;
    private JProgressBar progressBar1;
    private JTabbedPane tabbedPane1;
    private JButton button2;
    private JTextField textField1;
    private JRadioButton radioButton1;

    public OtherComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        pack();
        button1.addActionListener(new ActionListener() {
            int pValue = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                pValue += 10;
                progressBar1.setValue(pValue);
            }
        });
    }
}
