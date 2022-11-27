package exp5.test5;

public class TV {
    private int channel;

    public TV() {
    }

    public TV(int channel) {
        this.channel = channel;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void showProgram() {
        switch (channel) {
            case 1 -> System.out.println("经济频道");
            case 2 -> System.out.println("体育频道");
            case 3 -> System.out.println("综艺频道");
            case 4 -> System.out.println("新闻频道");
            case 5 -> System.out.println("电影频道");
        }
    }
}
