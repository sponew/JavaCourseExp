package exp5.test5;

public class Family {
    private TV homeTV;

    public void buyTV(TV tv) {
        homeTV = tv;
    }

    public void watchTV() {
        homeTV.showProgram();
    }

    public void remoteControl(int c) {
        homeTV.setChannel(c);
    }

}
