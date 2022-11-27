package exp3.test1;

public class Example4_3 {
    public static void main(String[] args) {
        Point p1, p2;
        p1 = new Point();
        p2 = new Point();
        System.out.println("p1的引用：" + p1);//应用数据类型 传递地址值
        System.out.println("p2的引用：" + p2);
        p1.setXY(1111, 2222);
        p2.setXY(-100, -200);
        System.out.println("p1 的 x,y 坐标：" + p1.x + "," + p1.y);
        System.out.println("p2 的 x,y 坐标：" + p2.x + "," + p2.y);
        p1 = p2;
        System.out.println("将p2的应用赋给p1后：");
        System.out.println("p1的引用：" + p1);
        System.out.println("p2的引用：" + p2);
        System.out.println("p1 的 x,y 坐标：" + p1.x + "," + p1.y);
        System.out.println("p2 的 x,y 坐标：" + p2.x + "," + p2.y);
    }
}
