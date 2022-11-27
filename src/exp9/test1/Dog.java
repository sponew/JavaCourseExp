package exp9.test1;

class Dog implements Animal {
    //Dog类实现接口Animal的方法
    String name = "小白";

    public String getAnimalName() {
        System.out.println("我的名字是：" + name);
        return name;
    }

    public void cry() {
        System.out.println("汪汪......");

    }
}
