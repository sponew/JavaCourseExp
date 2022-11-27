package exp3.test3;

public class Circle {
    private double radius;
    private double circumference;
    private double area;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
        setArea(radius);
        setCircumference(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return radius * 2.0 * 3.14;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public double getArea() {
        return radius * 3.14 * 3.14;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
