package exp9.test1;

class Cat implements Animal {
    //Cat类实现接口Animal的方法
    String name = "小咪";

    public String getAnimalName() {
        System.out.println("我的名字是：" + name);
        return name;
    }

    public void cry() {
        System.out.println("喵猫......");

    }

    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.playSound(new Dog());
        simulator.playSound(new Cat());
    }
}
