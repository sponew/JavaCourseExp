package exp10.test5;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = new String();
        System.out.println("请输入，实列abcd4673ydbf：");
        s = in.nextLine();
        for (int index = 0; index <= s.length() - 1; index++) {
            if (s.charAt(index) >= 48 && s.charAt(index) <= 57) {
                System.out.print(s.charAt(index));
            }
        }
    }
}
