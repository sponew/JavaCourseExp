package exp2.test9;

public class Test9 {
    public static void main(String[] args) {
        long sum = 0, conunt = 8;
        for (int i = 1; i <= 10; i++) {
            sum = sum + conunt;
            System.out.println("第" + i + "项：" + conunt);
            conunt = conunt * 10 + 8;

        }
        System.out.println("8+88+888+……前10项之和=" + sum);
    }
}
