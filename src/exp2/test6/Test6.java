package exp2.test6;

public class Test6 {
    public static void main(String[] args) {

        //需求：求1！+2！+….+10!

        int conunt = 1;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            conunt *= i;
            sum += conunt;
        }
        System.out.println("1~10的阶乘之和为：" + sum);

    }

}
