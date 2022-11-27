package exp6.test1;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("我调用的是第一个求和的方法,结果是 " + add(12, 13));
        System.out.println("我调用的是参数个数不同,构成重载的方法,结果是 " + add(31, 1, 33));
        System.out.println("我调用的是参数类型不同,构成重载的方法,结果是 " + add(1.2, 1.3));
        System.out.println("我调用的是参数顺序不同,构成重载的方法,结果是 " + add(12, 1.3));
    }

    // 求和的方法
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // 方法名相同，参数个数不同，构成重载
    public static int add(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    // 方法名相同，参数类型不同，构成重载
    public static double add(double a, double b) {
        double sum = a + b;
        return sum;
    }

    // 方法名相同，参数顺序不同，构成重载
    public static double add(int a, double b) {
        double sum = a + b;
        return sum;
    }
}