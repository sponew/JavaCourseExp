package exp5.test4;

public class Example4_9 {
    public static void main(String[] args) {
        //SIM卡1
        SIM simOne = new SIM(13889776509L);
        MobileTelephone mobile = new MobileTelephone();
        mobile.setSIM(simOne);
        System.out.println("手机号码：" + mobile.lookNumber());

        //SIM卡2
        SIM simTwo = new SIM(15967563567L);
        //更换SIM卡
        mobile.setSIM(simTwo);
        System.out.println("手机号码：" + mobile.lookNumber());
    }
}
