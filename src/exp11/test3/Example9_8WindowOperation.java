package exp11.test3;

import javax.swing.*;
import java.awt.*;

public class Example9_8WindowOperation extends JFrame {
    JTextField inputNumberOne, inputNumberTwo;
    JComboBox choiceFuhao;
    JTextArea textShow;
    JButton button;
    Example9_8OperatorListener operator;
    Example9_8ComputerListener computer;

    public Example9_8WindowOperation() {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        setLayout(new FlowLayout());
        inputNumberOne = new JTextField(5);
        inputNumberTwo = new JTextField(5);
        choiceFuhao = new JComboBox();
        button = new JButton("º∆À„");
        choiceFuhao.addItem("—°‘Ò‘ÀÀ„∑˚∫≈:");
        String[] a = {"+", "-", "*", "/"};
        for (int i = 0; i < a.length; i++) {
            choiceFuhao.addItem(a[i]);
        }
        textShow = new JTextArea(9, 30);
        operator = new Example9_8OperatorListener();
        computer = new Example9_8ComputerListener();
        operator.setJComboBox(choiceFuhao);
        operator.setWorkTogether(computer);
        computer.setJTextFieldOne(inputNumberOne);
        computer.setJTextFieldTwo(inputNumberTwo);
        computer.setJTextArea(textShow);
        choiceFuhao.addItemListener(operator);
        button.addActionListener(computer);
        add(inputNumberOne);
        add(choiceFuhao);
        add(inputNumberTwo);
        add(button);
        add(new JScrollPane(textShow));
    }
}
