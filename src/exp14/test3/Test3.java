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
        int count = 0;    //计数共有几个数字
        double sum = 0;    //总的价值
        BufferedWriter w = null;
        String[] content1 = {"商品列表：\n" +
                "电视机,2567元/台\t" +
                "洗衣机,3562元/台\t" +
                "冰箱,6573元/台"};
        File file1 = new File("src/exp14/test3/avg.txt");
        try {
            w = new BufferedWriter(new FileWriter(file1));
            for (String s1 : content1) {
                w.write(s1);
                w.newLine();
            }
            w.close();

            file = new RandomAccessFile(file1, "r");    //只读打开文件test.txt
            StringBuilder sb = new StringBuilder();            //定义一个字符串缓存，将字符串存放缓存中
            String s = null;                                //临时变量
            byte b[];                                        //临时字符数组
            while ((s = file.readLine()) != null) {                                            //逐行读取文件内容，不读取换行符和末尾的空格
                b = s.getBytes("iso-8859-1");            //重新编码  防止乱码
                String content = new String(b, "UTF-8");    //将字符数组转化为字符串
                sb.append(content + "\n");                //将读取的字符串添加换行符后累加存放在缓存中
            }
            file.close();    //关闭文件
            String str = sb.toString();//转化为string类型
            double price = 0;
            System.out.println("读取到文件内容为:\n" + str);
            sc = new Scanner(str);
            sc.useDelimiter("[^0123456789.]+");//以非数字作为分隔符
            while (sc.hasNextDouble())    //读不到double类型时结束循环
            {
                price = sc.nextDouble();//读到的double类型赋值给price，若不是自动转为double
                count++;
                sum += price;
                System.out.print(price + "  ");
            }
            double aver = sum / count;
            System.out.println("平均价格为：" + aver);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}


