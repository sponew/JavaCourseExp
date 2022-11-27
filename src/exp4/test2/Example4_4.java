package exp4.test2;

public class Example4_4 {
    public static void main(String[] args) {
        Rect rect = new Rect();
        double w = 12.76;
        double h = 25.28;

        rect.setWidth(w);
        rect.setHeight(h);

        System.out.println("矩形对象的宽：" + rect.getWidth() + "矩形对象的高：" + rect.getHeight());
        System.out.println("矩形对象的面积：" + rect.getArea());

        w = 100;
        h = 256;

        System.out.println("矩形对象的宽：" + rect.getWidth() + "矩形对象的高：" + rect.getHeight());
    }
}
