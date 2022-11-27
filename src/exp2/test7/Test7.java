package exp2.test7;

public class Test7 {

    public static void main(String[] args) {
        //需求：分别用do-while和for循环计算1+1/2!+1/3!+…的前20项和

        int i, j;
        double s = 0;
        for (i = 1; i <= 20; i++) {
            double t = 1;
            for (j = 1; j <= i; j++) {
                t = t * j;

            }
            s += (double) (1 / t);
        }
        System.out.println(s);

        int n = 1, t = 1;
        float q = 0;
        do {
            t *= n;
            n++;
            q += 1 / (float) t;

        } while (n <= 20);
        System.out.println(q);
    }
}
