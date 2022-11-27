package exp13.test4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Window extends JFrame implements ActionListener {
    Lader2 lader;             //ģ��
    JTextField textAbove, textBottom, textHeight;   //��ͼ
    JTextArea showArea;         //��ͼ
    JButton controlButton;        //������

    Window() {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        lader = new Lader2();
        textAbove = new JTextField(5);
        textBottom = new JTextField(5);
        textHeight = new JTextField(5);
        showArea = new JTextArea();
        controlButton = new JButton("�������");
        JPanel pNorth = new JPanel();
        pNorth.add(new JLabel("�ϵ�:"));
        pNorth.add(textAbove);
        pNorth.add(new JLabel("�µ�:"));
        pNorth.add(textBottom);
        pNorth.add(new JLabel("��:"));
        pNorth.add(textHeight);
        pNorth.add(controlButton);
        controlButton.addActionListener(this);
        add(pNorth, BorderLayout.NORTH);
        add(new JScrollPane(showArea), BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double above = Double.parseDouble(textAbove.getText().trim());
            double bottom = Double.parseDouble(textBottom.getText().trim());
            double height = Double.parseDouble(textHeight.getText().trim());
            lader.setAbove(above);
            lader.setBottom(bottom);
            lader.setHeight(height);
            double area = lader.getArea();
            showArea.append("���:" + area + "\n");
        } catch (Exception ex) {
            showArea.append("\n" + ex + "\n");
        }
    }
}
