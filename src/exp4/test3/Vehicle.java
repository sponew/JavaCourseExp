package exp4.test3;

public class Vehicle {
    //速度
    private double speed;
    //功率
    private int power;

    public Vehicle() {
    }

    public Vehicle(double speed, int power) {
        this.speed = speed;
        this.power = power;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    //加速
    public void speedUp(double s) {
        speed += s;
    }

    //减速
    public void speedDown(double d) {
        speed -= d;
    }
}
