package exp9.test2;

public class Adventure {
    public static void main(String[] args) {
        Hero hb = new Hero("jack");
        hb.swim();
        hb.fight("bobo");
        hb.fly();
        CanFly cf = hb;
        cf.fly();
        CanSwin cs = hb;
        hb.swim();
        ActionCharacter ac = hb;
        hb.fight("scott");
        hb.speak("my power is money");
    }
}
