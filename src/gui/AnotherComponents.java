package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AnotherComponents extends JFrame{
    private JPanel mainPanel;
    private JRadioButton rbSingle;
    private JRadioButton rbMarried;
    private JRadioButton rbWidowed;
    private JButton btnCheckCivilStat;
    private JCheckBox cbPermanent;
    private JCheckBox cbPrimary;
    private JCheckBox cbEmployment;
    private JButton btnCheckAddrress;
    private JList listFruits;
    private JComboBox cboxFruits;
    private JButton btnCheckFruits;
    private JList listViand;
    private JTextField tfServings;
    private JButton btnCompute;
    private JLabel lbCost;

    public AnotherComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("another");
        setContentPane(mainPanel);
        pack();
        btnCheckCivilStat.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String civilStat = "";
                if(rbSingle.isSelected()) civilStat = rbSingle.getText();
                else if(rbMarried.isSelected()) civilStat = rbMarried.getText();
                else civilStat = rbWidowed.getText();
                JOptionPane.showMessageDialog(btnCheckCivilStat, civilStat ) ;
            }
        });
        btnCheckAddrress.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                String choice = "";
                if(cbPermanent.isSelected()) choice = cbPermanent.getText() + "\n";
                if(cbPrimary.isSelected()) choice += cbPrimary.getText() + "\n";
                if(cbEmployment.isSelected()) choice += cbEmployment.getText() + "\n";
                JOptionPane.showMessageDialog(btnCheckAddrress, choice);
            }
        });
        btnCheckFruits.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //combobox
//                IO.println(cboxFruits.getSelectedItem());
//                cboxFruits.getSelectedIndex()
//                IO.println(Arrays.toString(listFruits.getSelectedValues()));
                for(Object o : listFruits.getSelectedValuesList()){
                    IO.println(o);
                }
            }
        });
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int viandIndex = listViand.getSelectedIndex();
                int[] prices = {60, 50, 200, 80};
                int serving = Integer.parseInt(tfServings.getText());
                int cost = prices[viandIndex] * serving;
                lbCost.setText("Cost: " + cost);
//                if(viandIndex == 0) cost = 60 * serving;
//                else if(viandIndex == 1) cost = 50 * serving;
//                else if(viandIndex == 2) cost = 200 * serving;
//                else if(viandIndex == 3) cost = 80 * serving;
//                lbCost.setText("Cost: " + cost);
            }
        });
    }
}
