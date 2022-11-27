package exp5.test4;

public class Circular {
    Circle bottom;
    double height;

    Circular(Circle bottom, double height) {
        this.bottom = bottom;
        this.height = height;
    }

    double getVolme() {
        return bottom.getArea() * height / 3.0;
    }

    double getBottomRadius() {
        return bottom.getRadius();
    }

    public void setBottomRadius(double radius) {
        bottom.setRadius(radius);
    }
}
