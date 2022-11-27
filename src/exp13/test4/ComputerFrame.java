package exp13.test4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ComputerFrame extends JFrame implements ActionListener {
    JTextField text1, text2, text3;
    JButton buttonAdd, buttonSub, buttonMul, buttonDiv;
    JLabel label;

    public ComputerFrame() {
        setLayout(new FlowLayout());
        text1 = new JTextField(10);
        text2 = new JTextField(10);
        text3 = new JTextField(10);
        label = new JLabel(" ", JLabel.CENTER);
        label.setBackground(Color.green);
        add(text1);
        add(label);
        add(text2);
        add(text3);
        buttonAdd = new JButton("¼Ó");
        buttonSub = new JButton("¼õ");
        buttonMul = new JButton("³Ë");
        buttonDiv = new JButton("³ý");
        add(buttonAdd);
        add(buttonSub);
        add(buttonMul);
        add(buttonDiv);
        buttonAdd.addActionListener(this);
        buttonSub.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonDiv.addActionListener(this);
        setSize(300, 320);
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        double n;
        if (e.getSource() == buttonAdd) {
            double n1, n2;
            try {
                n1 = Double.parseDouble(text1.getText());
                n2 = Double.parseDouble(text2.getText());
                n = n1 + n2;
                text3.setText(String.valueOf(n));
                label.setText("+");
            } catch (NumberFormatException ee) {
                text3.setText("ÇëÊäÈëÊý×Ö×Ö·û");
            }
        } else if (e.getSource() == buttonSub) {
            double n1, n2;
            try {
                n1 = Double.parseDouble(text1.getText());
                n2 = Double.parseDouble(text2.getText());
                n = n1 - n2;
                text3.setText(String.valueOf(n));
                label.setText("-");
            } catch (NumberFormatException ee) {
                text3.setText("ÇëÊäÈëÊý×Ö×Ö·û");
            }
        } else if (e.getSource() == buttonMul) {
            double n1, n2;
            try {
                n1 = Double.parseDouble(text1.getText());
                n2 = Double.parseDouble(text2.getText());
                n = n1 * n2;
                text3.setText(String.valueOf(n));
                label.setText("*");
            } catch (NumberFormatException ee) {
                text3.setText("ÇëÊäÈëÊý×Ö×Ö·û");
            }
        } else if (e.getSource() == buttonDiv) {
            double n1, n2;
            try {
                n1 = Double.parseDouble(text1.getText());
                n2 = Double.parseDouble(text2.getText());
                n = n1 / n2;
                text3.setText(String.valueOf(n));
                label.setText("/");
            } catch (NumberFormatException ee) {
                text3.setText("ÇëÊäÈëÊý×Ö×Ö·û");
            }
        }
        validate();
    }
}
