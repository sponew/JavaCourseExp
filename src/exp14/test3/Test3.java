package exp14.test3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        RandomAccessFile file = null;
        Scanner sc = null;
        int count = 0;    //�������м�������
        double sum = 0;    //�ܵļ�ֵ
        BufferedWriter w = null;
        String[] content1 = {"��Ʒ�б�\n" +
                "���ӻ�,2567Ԫ/̨\t" +
                "ϴ�»�,3562Ԫ/̨\t" +
                "����,6573Ԫ/̨"};
        File file1 = new File("src/exp14/test3/avg.txt");
        try {
            w = new BufferedWriter(new FileWriter(file1));
            for (String s1 : content1) {
                w.write(s1);
                w.newLine();
            }
            w.close();

            file = new RandomAccessFile(file1, "r");    //ֻ�����ļ�test.txt
            StringBuilder sb = new StringBuilder();            //����һ���ַ������棬���ַ�����Ż�����
            String s = null;                                //��ʱ����
            byte b[];                                        //��ʱ�ַ�����
            while ((s = file.readLine()) != null) {                                            //���ж�ȡ�ļ����ݣ�����ȡ���з���ĩβ�Ŀո�
                b = s.getBytes("iso-8859-1");            //���±���  ��ֹ����
                String content = new String(b, "UTF-8");    //���ַ�����ת��Ϊ�ַ���
                sb.append(content + "\n");                //����ȡ���ַ�����ӻ��з����ۼӴ���ڻ�����
            }
            file.close();    //�ر��ļ�
            String str = sb.toString();//ת��Ϊstring����
            double price = 0;
            System.out.println("��ȡ���ļ�����Ϊ:\n" + str);
            sc = new Scanner(str);
            sc.useDelimiter("[^0123456789.]+");//�Է�������Ϊ�ָ���
            while (sc.hasNextDouble())    //������double����ʱ����ѭ��
            {
                price = sc.nextDouble();//������double���͸�ֵ��price���������Զ�תΪdouble
                count++;
                sum += price;
                System.out.print(price + "  ");
            }
            double aver = sum / count;
            System.out.println("ƽ���۸�Ϊ��" + aver);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}


