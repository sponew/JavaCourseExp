package exp5.test4;

public class Example4_5 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println("main方法中circle的引用：" + circle);
        System.out.println("main方法中circle的半径：" + circle.getRadius());
        Circular circular = new Circular(circle, 20);
        System.out.println("circular 圆锥的 bottom 的引用：" + circular.bottom);
        System.out.println("圆锥的 bottom 的半径：" + circular.getBottomRadius());
        System.out.println("圆锥的体积：" + circular.getVolme());
        double radius = 8888;
        System.out.println("圆锥更改底圆 bottom 的半径：" + radius);
        circular.setBottomRadius(radius);
        System.out.println("圆锥的 bottom 的半径：" + circular.getBottomRadius());
        System.out.println("main方法中 circle 的半径：" + circle.getRadius());
        System.out.println("main方法中 circle 的引用将发生变化");
        circle = new Circle(1000);
        System.out.println("现在main方法中的circle的引用" + circle);
        System.out.println("main方法中 circle 的半径：" + circle.getRadius());
        System.out.println("但是不影响 circular 圆锥的 bottom 的引用");
        System.out.println("circular 圆锥的 bottom 的引用：" + circular.bottom);
        System.out.println("圆锥的 bottom 的半径：" + circular.getBottomRadius());
    }
}
