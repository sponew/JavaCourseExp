package exp11.test5;

import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        File file = new File("src/exp11/test5/cost.txt");
        Scanner scanner = new Scanner(file);
        int count = 0;
        double sum = 0;
        double cost;
        while (scanner.hasNext()) { //默认分隔符为空格
            try {
                cost = scanner.nextInt();
                sum = sum + cost;
                System.out.println(cost);
                count++;
            } catch (Exception E) {
                String t = scanner.next();  //返回该数的数字型单词
            }
        }
        double aver = sum / count;
        System.out.println("平均数:" + aver);
    }
}
