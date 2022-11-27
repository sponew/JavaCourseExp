
package exp2.test4;

public class E {
    char x = 'Äã', y = 'e', z = '³Ô';

    public static void main(String[] args) {
        int s3 = 'Æ»' + '¹û';
        char s4 = (char) s3;
        System.out.println(s3);
        char x = 'Äã', y, z;
        //char x='Äã',y='e',z='³Ô';
        if (x > 'A') {
            y = 'Æ»';
            z = '¹û';
        } else
            y = 'Ëá';
        z = 'Ìð';
        System.out.print(x + "," + y + "'" + z);
    }
}
