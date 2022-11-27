package exp13.test2;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class GUI extends JFrame {
    JTextArea textArea;

    public GUI() {
        JFrame frame = new JFrame("���̲���");
        JPanel panel = new JPanel();
        textArea = new JTextArea();
        panel.add(textArea);
        panel.setBounds(100, 100, 100, 100);
        textArea.addKeyListener(new MyListener());
        textArea.append("��ʼ�ɣ�\n");
        frame.add(textArea);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    class MyListener implements KeyListener {
        @Override // ����
        public void keyPressed(KeyEvent e) {
            textArea.append("���£�" + KeyEvent.getKeyText(e.getKeyCode()) + "\n");
        }

        @Override // �ɿ�
        public void keyReleased(KeyEvent e) {
            textArea.append("�ɿ���" + KeyEvent.getKeyText(e.getKeyCode()) + "\n");
            if (KeyEvent.getKeyText(e.getKeyCode()).equals("C")) {
                textArea.setText("");
            }
        }

        @Override // ���������
        public void keyTyped(KeyEvent e) {
            textArea.append("���룺" + e.getKeyChar() + "\n");
        }
    }
}
