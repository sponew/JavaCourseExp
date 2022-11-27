package exp5.test5;

public class MainClass {
    public static void main(String[] args) {
        TV haierTV = new TV();
        Family myfamily = new Family();

        myfamily.buyTV(haierTV);
        //通过遥控设置频道为2
        myfamily.remoteControl(2);
        //播放当前频道
        myfamily.watchTV();
        myfamily.remoteControl(5);
        myfamily.watchTV();
    }
}
