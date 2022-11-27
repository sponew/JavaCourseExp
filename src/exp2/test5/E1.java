package exp2.test5;

public class E1 {
    public static void main(String[] args) {
        char c = '\0';
        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1:
                    c = 'J';
                    System.out.print(c);
                case 2:
                    c = 'e';
                    System.out.print(c);
                    //break;
                case 3:
                    c = 'p';
                    System.out.print(c);
                default:
                    System.out.print("好");
            }
        }
    }
}


