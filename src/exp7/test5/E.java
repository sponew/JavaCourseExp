package exp7.test5;

public class E {
    public static void main(String[] args) {
        Shape a = new Rectangle(1, 2);
        Shape b = new Triangle(1, 2);
        System.out.println(a.getCircumference());
        System.out.println(b.getCircumference());
    }
}
