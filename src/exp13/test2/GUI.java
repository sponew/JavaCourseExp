package exp13.test2;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class GUI extends JFrame {
    JTextArea textArea;

    public GUI() {
        JFrame frame = new JFrame("键盘测试");
        JPanel panel = new JPanel();
        textArea = new JTextArea();
        panel.add(textArea);
        panel.setBounds(100, 100, 100, 100);
        textArea.addKeyListener(new MyListener());
        textArea.append("开始吧：\n");
        frame.add(textArea);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class MyListener implements KeyListener {
        @Override // 按下
        public void keyPressed(KeyEvent e) {
            textArea.append("按下：" + KeyEvent.getKeyText(e.getKeyCode()) + "\n");
        }

        @Override // 松开
        public void keyReleased(KeyEvent e) {
            textArea.append("松开：" + KeyEvent.getKeyText(e.getKeyCode()) + "\n");
            if (KeyEvent.getKeyText(e.getKeyCode()).equals("C")) {
                textArea.setText("");
            }
        }

        @Override // 输入的内容
        public void keyTyped(KeyEvent e) {
            textArea.append("输入：" + e.getKeyChar() + "\n");
        }
    }
}
