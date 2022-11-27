package exp14.test2;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/exp14/test2/EnglishInit.txt");
        File file1 = new File("src/exp14/test2/EnglishCount.txt");
        English b = new English();
        b.read(file1);
    }
}

