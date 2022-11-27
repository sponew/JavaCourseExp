package exp1.test3;

public class Test3 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("main方法中circle的引用：" + circle);
        System.out.println("main方法中ciecle的半径：" + circle.getRadius());
        Circular circular = new Circular(circle, 20);
        System.out.println("circular圆锥的bottom的引用：" + circular.bottom);
    }
}

class Circular {
    Circle bottom;
    double height;

    Circular(Circle c, double h) {
        bottom = c;
        height = h;
    }

    double getVolme() {
        return bottom.getArea() * height / 3.0;
    }

    double getBottomRadius() {
        return bottom.getRadius();
    }

    public void setBottomRadius(double r) {
        bottom.setRadius(r);
    }
}

class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }

    void setRadius(double r) {
        radius = r;
    }

    double getRadius() {
        return radius;
    }

}
