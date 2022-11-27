package exp5.test6;

public class PC {
    CPU cpu;
    HardDisk hd;

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setHardDisk(HardDisk hd) {
        this.hd = hd;
    }

    public void show() {
        System.out.println(cpu.getSpeed());
        System.out.println(hd.getAmount());
    }
}
