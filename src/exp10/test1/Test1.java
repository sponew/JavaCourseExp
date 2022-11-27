package exp10.test1;

import java.util.Scanner;

public class Test1 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while (sc.hasNextDouble()) {
            double x = sc.nextDouble();
            assert x < 100 : "数字要小于100";
            assert x > 0 : "数字要大于0";
            m = m + 1;
            sum = sum + x;
        }
        System.out.printf("%d个数的和为%f\n", m, sum);
        System.out.printf("%d个数的平均值为%f\n", m, sum / m);
    }
}
