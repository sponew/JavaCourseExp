package exp2.test1;

public class test1 {
    public static void main(String[] args) {
        System.out.println("“你”、“我”、“他” 依次在Unicode表中的位置为：");
        System.out.printf("\\u%04x\n", (int) '你');
        System.out.printf("\\u%04x\n", (int) '我');
        System.out.printf("\\u%04x\n", (int) '他');
    }
}
