package exp13.test4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Window extends JFrame implements ActionListener {
    Lader2 lader;             //模型
    JTextField textAbove, textBottom, textHeight;   //视图
    JTextArea showArea;         //视图
    JButton controlButton;        //控制器

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
        controlButton = new JButton("计算面积");
        JPanel pNorth = new JPanel();
        pNorth.add(new JLabel("上底:"));
        pNorth.add(textAbove);
        pNorth.add(new JLabel("下底:"));
        pNorth.add(textBottom);
        pNorth.add(new JLabel("高:"));
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
            showArea.append("面积:" + area + "\n");
        } catch (Exception ex) {
            showArea.append("\n" + ex + "\n");
        }
    }
}
