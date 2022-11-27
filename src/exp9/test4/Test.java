package exp9.test4;

public class Test {

    public static void main(String[] args) {
        Test c = new Test();
        Feiji f = new Feiji();
        Niao n = new Niao();
        c.makeFly(f, n);
    }

    public void makeFly(Feiji f, Niao n) {
        f.fly();
        n.fly();
    }
}



