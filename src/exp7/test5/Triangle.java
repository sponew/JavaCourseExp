package exp7.test5;

public class Triangle extends Shape {
    public Triangle(double a, double b) {
        super(a, b);
    }

    public double getCircumference() {
        return a * b / 2;
    }
}
