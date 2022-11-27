package exp3.test4;

public class PeopleTest {
    public static void main(String[] args) {
        People p = new People("张三", 18, "男", 180);
//        查看原先名字
//        System.out.println(p.getName());
        p.speak();
        p.plus(23, 45);
        p.setName("李四");
//        修改后的名字
        System.out.println(p.getName());
    }
}
