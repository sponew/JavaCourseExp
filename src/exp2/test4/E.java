
package exp2.test4;

public class E {
    char x = '��', y = 'e', z = '��';

    public static void main(String[] args) {
        int s3 = 'ƻ' + '��';
        char s4 = (char) s3;
        System.out.println(s3);
        char x = '��', y, z;
        //char x='��',y='e',z='��';
        if (x > 'A') {
            y = 'ƻ';
            z = '��';
        } else
            y = '��';
        z = '��';
        System.out.print(x + "," + y + "'" + z);
    }
}
