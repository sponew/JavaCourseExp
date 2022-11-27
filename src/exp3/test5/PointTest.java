package exp3.test5;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        System.out.println(p1.getX());
        System.out.println(p1.getY());

        Point p2 = new Point();
        p2.setX(3);
        p2.setY(4);
        System.out.println(p2.getX());
        System.out.println(p2.getY());
    }
}
