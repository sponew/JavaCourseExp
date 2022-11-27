package exp7.test1;

public class Music {
    public static void main(String[] args) {
        //调用tune方法，以Wind类对象为参数
        Wind wind = new Wind();
        Brass brass = new Brass();
        tune(wind);
        //调用tune方法，以Brass类对象为参数
        tune(brass);
    }

    public static void tune(Instrument i) {
        i.play();
    }
}
