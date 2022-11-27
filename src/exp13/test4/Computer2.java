package exp13.test4;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

class Computer2 extends JFrame implements DocumentListener {
    JTextArea text1, text2;
    int count = 1;
    double sum = 0, aver = 0;

    Computer2() {
        setLayout(new FlowLayout());
        text1 = new JTextArea(6, 20);
        text2 = new JTextArea(6, 20);
        add(new JScrollPane(text1));
        add(new JScrollPane(text2));
        text2.setEditable(false);
        (text1.getDocument()).addDocumentListener(this);
        setSize(300, 320);
        setVisible(true);
        validate();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void changedUpdate(DocumentEvent e) {
        String s = text1.getText();
        String[] a = s.split("[^0123456789.]+");
        sum = 0;
        aver = 0;
        for (int i = 0; i < a.length; i++) {
            try {
                sum = sum + Double.parseDouble(a[i]);
            } catch (Exception ee) {
            }
        }
        aver = sum / count;
        text2.setText(null);
        text2.append("\n和:" + sum);
        text2.append("\n平均值:" + aver);
    }

    @Override
    public void insertUpdate(DocumentEvent e) {

    }

    public void removeUpdate(DocumentEvent e) {
        changedUpdate(e);
    }

    public int add(int m, int n) {
        return 1;
    }
}
