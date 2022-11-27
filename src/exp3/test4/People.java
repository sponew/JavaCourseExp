package exp3.test4;

public class People {
    private String name;
    private int age;
    private String gender;
    private int height;

    public People() {
    }

    public People(String name, int age, String gender, int height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void speak() {
        System.out.println("你好");
    }

    public void plus(double a, double b) {
        System.out.println(a + b);
    }
}
