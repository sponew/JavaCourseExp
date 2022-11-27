package exp4.test3;

public class User {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        //功率设置为2000
        car.setPower(200);
        //速度设置为100
        car.setSpeed(100);
        System.out.println("汽车的速度为" + car.getSpeed());
        System.out.println("汽车的功率为" + car.getPower());
        //加速20
        int sUp = 20;
        car.speedUp(sUp);
        System.out.println("加速" + sUp + "后的速度为" + car.getSpeed());
        //减速30
        int dUp = 30;
        car.speedDown(dUp);
        System.out.println("加速" + dUp + "后的速度为" + car.getSpeed());
    }
}
