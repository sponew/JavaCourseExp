package exp10.test2;

public class Exapmle8_4 {
    public static void main(String args[]) {
        double sum = 0, item = 0;
        boolean computable = true;
        for (String s : args) {
            try {
                item = Double.parseDouble(s);
                sum = sum + item;
            } catch (NumberFormatException e) {
                System.out.println("您键入了非数字字符:" + e);
                computable = false;
            }
        }
        if (computable)
            System.out.println("sum=" + sum);
    }
}
