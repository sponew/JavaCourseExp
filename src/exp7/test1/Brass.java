package exp7.test1;

public class Brass extends Instrument {
    //输出"弹奏brass"
    public void play() {
        System.out.println("弹奏brass");
    }

    //调用brass的play2
    public void play2() {
        System.out.println("调用wind的play2");
    }
}
