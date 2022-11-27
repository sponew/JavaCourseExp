package exp2.test3;

import java.util.Arrays;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {

        int[] array = {10, 1, 45, -34, 56, 77, 99, 100, 25, 66};
        //先把数组从小到大排序
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print(" " + array[i]);
        }

        int start = 0, minddle, end = array.length;
        System.out.print("请输入你想要查找的数：");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        while (start <= end) {
            minddle = (start + end) / 2;
            if (number == array[minddle]) {
                System.out.println("恭喜你找到该数！");
                System.exit(0);
            } else if (number < array[minddle]) {
                end = minddle - 1;
            } else if (number > array[minddle]) {
                start = minddle + 1;
            }
        }
        System.out.println("没有找到！");
    }
}
