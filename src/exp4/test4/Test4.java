package exp4.test4;

public class Test4 {
    public static void main(String args[]) {
        TestD testB = new TestD();
    }


    public void hello() {
        System.out.println("你好");
    }

    static class TestC {
        public TestC(String s) {
            System.out.println("A");
            System.out.println(s);
        }
    }

    static class TestD extends TestC {
        public TestD() {
            super("name");
            System.out.println("B");
        }
    }
}
