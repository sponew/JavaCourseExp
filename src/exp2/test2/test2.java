package exp2.test2;

public class test2 {
    public static void main(String[] args) {
        //        第一个希腊字母的Unicode
        char a = 'α';

//        System.out.println((int)a);
//        System.out.printf("\\u%04x\n",(int)a);

//        最后一个希腊字母的Unicode
        char b = 'ω';
//        System.out.printf("\\u%04x\n",(int)b);


        int c = 0x3b1;
        while (a <= c && c <= b) {
            System.out.printf("\\u%04x\t", (int) c);
            System.out.println((char) c);
            c++;
        }
    }

}
