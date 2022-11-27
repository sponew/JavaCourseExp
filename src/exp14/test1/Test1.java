package exp14.test1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {

        //从文件out.txt中读取文件
        FileInputStream inp = new FileInputStream("src/exp14/test1/input.txt");
        byte[] b = new byte[1024];
        int length = inp.read(b);
        String s = new String(b, 0, length);
        System.out.println(s);
        inp.close();

        //把读出的字符串写入到in.txt
        FileOutputStream out = new FileOutputStream("src/exp14/test1/out.txt");
        byte[] b2 = s.getBytes();
        out.write(b2);
        System.out.println("写入成功");
        out.close();
    }
}
