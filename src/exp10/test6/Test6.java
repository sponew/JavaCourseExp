package exp10.test6;

import java.util.Scanner;

public class Test6 {
    public static void main(String args[]) {
        String anxiety = "数学87分，物理76分，英语96分";
        Scanner scanner = new Scanner(anxiety);
        scanner.useDelimiter("\\D+");
        double sum = 0;
        int count = 0;
        while (scanner.hasNext()) {
            double score = scanner.nextDouble();
            count++;
            sum = sum + score;
            System.out.println(score);
        }
        System.out.println("总分:" + sum + "分");
        System.out.println("平均分:" + sum / count + "分");
    }
}
