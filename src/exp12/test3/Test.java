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
        frame = new Test("算术测试");
    }

    TextField textOne, textTwo, textResult;
    Button getProblem, giveAnswer;
    Label operatorLabel, message;
    Teacher teacher;

    Test(String s) {
        super(s);
        teacher = new Teacher();
        setLayout(new FlowLayout());
        textOne = new TextField(10);     //创建textOne,其可见字符长是10
        textTwo = new TextField(10);     //创建textTwo,其可见字符长是10
        textResult = new TextField(10);  //创建textResult,其可见字符长是10
        operatorLabel = new Label("+");  //创建 operatorLabel，初始值“+”
        message = new Label("你还没有回答呢");   //创建message，初始值“你还没有回答呢”
        getProblem = new Button("获取题目"); //创建getProblem，初始值“获取题目”
        giveAnswer = new Button("确认答案"); //创建giveAnswer，初始值“确认答案”
        add(getProblem);
        add(textOne);
        add(operatorLabel);
        add(textTwo);
        add(new Label("="));
        add(textResult);
        add(giveAnswer);
        add(message);//添加若干组件到窗口
        textResult.requestFocus();//textResult 获得焦点
        textOne.setEditable(false);
        textTwo.setEditable(false);//textOne设置textOne和textTwo不可编辑
        getProblem.addActionListener(this);//将当前窗口注册为getProblem的ActionEvent事件监视器
        giveAnswer.addActionListener(this);//将当前窗口注册为giveAnwser的ActionEvent事件监视器
        textResult.addActionListener(this);//将当前窗口注册为textResult的ActionEvent事件监视器
        setBounds(100, 100, 450, 100);//设置出现屏幕上时的初始位置，x=100,y=100,width=450,height=100
        setLocationRelativeTo(null);//设置窗体居中显示
        setVisible(true);//窗口的可见性设置
        validate();
        addWindowFocusListener(new WindowAdapter() {
                                   public void windowClosing(WindowEvent e) {
                                       System.exit(0);
                                   }
                               }
        );
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == getProblem)//如果点击了“获取题目 ”
        {
            int number1 = teacher.giveNumberOne(100);//获取第一个操作数的值
            int number2 = teacher.giveNumberTwo(100);//获取第二个操作数的值
            String operator = teacher.giveOperator();//获取运算符
            textOne.setText("" + number1);
            textTwo.setText("" + number2);
            textResult.setText(null);
            operatorLabel.setText(operator);
            message.setText("请回答");//设置图形界面上文本框以及标签的文本，包括：textOne,textTwo,textResult，operatorLabel,message
        }
        if (e.getSource() == giveAnswer)//如果点击了“确认答案 ”
        {
            String answer = textResult.getText();//获取文本框中输入的答案
            try {
                int result = Integer.parseInt(answer);
                if (teacher.getRight(result) == true) {
                    message.setText("你回答正确");//如果答案正确，message显示“你回答正确”，如果不正确，显示“你回答错误”
                } else {
                    message.setText("你回答错误");
                }
            } catch (NumberFormatException ex) {
                message.setText("请输入数字字符");//如果输入的不是数字，显示“请输入数字字符”
            }
        }
        textResult.requestFocus();//textResult 获得焦点
        validate();
    }
}
