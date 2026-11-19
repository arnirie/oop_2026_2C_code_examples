package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListDemo extends  JFrame {
    private JPanel mainPanel;
    private JComboBox cboxItems;
    private JTextField tfQty;
    private JButton btnCompute;
    private JLabel lbCost;
    private JList listAddedItems;
    private JButton btnDelete;
    private DefaultListModel<String> model;

    public ListDemo(){
        model = new DefaultListModel<>();
        listAddedItems.setModel(model);
        setContentPane(mainPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        btnCompute.addActionListener(new ActionListener() {
            double total = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                int itemIdx = cboxItems.getSelectedIndex();
                int qty = 0;
                try {
                    qty = Integer.parseInt(tfQty.getText());
                }catch (NumberFormatException ex){}
                double[] prices = {5.5, 4.75, 200, 45};
                double cost = qty * prices[itemIdx];
                total += cost;
                lbCost.setText("Total: " + total);
                String item = cboxItems.getSelectedItem().toString();
                item = item.split("-")[0];
                model.addElement(item + " - " + qty);
            }
        });
    }
}
