package exp14.test2;

import java.io.*;

class English {
    String[] content = {"The arrow missed the target."};
    String[] content1 = {"They rejected the union demand."};
    String[] strs = {"Where does this road go to?"};
    String str = null;
    BufferedReader r;
    BufferedWriter w;

    public void read(File file) {
        try {
            w = new BufferedWriter(new FileWriter(file));
            for (String s : content) {
                w.write(s);
                w.newLine();
            }
            for (String s1 : content1) {
                w.write(s1);
                w.newLine();
            }
            for (String s2 : strs) {
                w.write(s2);
                w.newLine();
            }
            w.close();
            r = new BufferedReader(new FileReader(file));
            while ((str = r.readLine()) != null) {
                int sum = 0;

                char[] ch = str.toCharArray();
                for (char c : ch) {
                    if (c == ' ') {
                        sum++;
                    }
                }
                System.out.println(str + " " + (sum + 1));
            }

        } catch (IOException ioe) {
        }
    }
}
