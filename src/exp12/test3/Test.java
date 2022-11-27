package exp12.test3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test extends JFrame implements ActionListener {
    public static void main(String[] args) {
        Test frame;
        frame = new Test("��������");
    }

    TextField textOne, textTwo, textResult;
    Button getProblem, giveAnswer;
    Label operatorLabel, message;
    Teacher teacher;

    Test(String s) {
        super(s);
        teacher = new Teacher();
        setLayout(new FlowLayout());
        textOne = new TextField(10);     //����textOne,��ɼ��ַ�����10
        textTwo = new TextField(10);     //����textTwo,��ɼ��ַ�����10
        textResult = new TextField(10);  //����textResult,��ɼ��ַ�����10
        operatorLabel = new Label("+");  //���� operatorLabel����ʼֵ��+��
        message = new Label("�㻹û�лش���");   //����message����ʼֵ���㻹û�лش��ء�
        getProblem = new Button("��ȡ��Ŀ"); //����getProblem����ʼֵ����ȡ��Ŀ��
        giveAnswer = new Button("ȷ�ϴ�"); //����giveAnswer����ʼֵ��ȷ�ϴ𰸡�
        add(getProblem);
        add(textOne);
        add(operatorLabel);
        add(textTwo);
        add(new Label("="));
        add(textResult);
        add(giveAnswer);
        add(message);//����������������
        textResult.requestFocus();//textResult ��ý���
        textOne.setEditable(false);
        textTwo.setEditable(false);//textOne����textOne��textTwo���ɱ༭
        getProblem.addActionListener(this);//����ǰ����ע��ΪgetProblem��ActionEvent�¼�������
        giveAnswer.addActionListener(this);//����ǰ����ע��ΪgiveAnwser��ActionEvent�¼�������
        textResult.addActionListener(this);//����ǰ����ע��ΪtextResult��ActionEvent�¼�������
        setBounds(100, 100, 450, 100);//���ó�����Ļ��ʱ�ĳ�ʼλ�ã�x=100,y=100,width=450,height=100
        setLocationRelativeTo(null);//���ô��������ʾ
        setVisible(true);//���ڵĿɼ�������
        validate();
        addWindowFocusListener(new WindowAdapter() {
                                   public void windowClosing(WindowEvent e) {
                                       System.exit(0);
                                   }
                               }
        );
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == getProblem)//�������ˡ���ȡ��Ŀ ��
        {
            int number1 = teacher.giveNumberOne(100);//��ȡ��һ����������ֵ
            int number2 = teacher.giveNumberTwo(100);//��ȡ�ڶ�����������ֵ
            String operator = teacher.giveOperator();//��ȡ�����
            textOne.setText("" + number1);
            textTwo.setText("" + number2);
            textResult.setText(null);
            operatorLabel.setText(operator);
            message.setText("��ش�");//����ͼ�ν������ı����Լ���ǩ���ı���������textOne,textTwo,textResult��operatorLabel,message
        }
        if (e.getSource() == giveAnswer)//�������ˡ�ȷ�ϴ� ��
        {
            String answer = textResult.getText();//��ȡ�ı���������Ĵ�
            try {
                int result = Integer.parseInt(answer);
                if (teacher.getRight(result) == true) {
                    message.setText("��ش���ȷ");//�������ȷ��message��ʾ����ش���ȷ�����������ȷ����ʾ����ش����
                } else {
                    message.setText("��ش����");
                }
            } catch (NumberFormatException ex) {
                message.setText("�����������ַ�");//�������Ĳ������֣���ʾ�������������ַ���
            }
        }
        textResult.requestFocus();//textResult ��ý���
        validate();
    }
}
