package exp2.test8;

public class Test8 {

    public static void main(String[] args) {
        //需求：一个数如果恰好等于它的因子之和，这个数就称为完数。编写应用程序求1000之内的所有完数

        //i是要判断的数，j是因子，sum是和
        int i, j, sum;
        for (i = 1; i <= 1000; i++) {
            sum = 0;
            for (j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum = sum + j;
                }
            }
            if (i == sum)
                System.out.println(i);

        }

    }
}
