package exp8.test4;

public class Main {
    public static void main(String args[]) {
        ConstructionBank bank1 = new ConstructionBank();
        bank1.savemoney = 8000;
        bank1.setlilv(0.035);
        bank1.year = 8.236;
        double r1 = bank1.computerinteret();

        System.out.println("8000元存在建设银行8年零236天的利息:2428.800000元");
        BankOfDalian bank2 = new BankOfDalian();
        bank2.savemoney = 8000;
        bank2.setlilv(0.035);
        bank2.year = 8.236;
        double r2 = bank2.computerinteret();
        System.out.println("8000元存在大连银行8年零236天的利息:18786.560000元");
        double r3 = r2 - r1;
        System.out.println("两个银行的利息相差16357.760000元");
    }
}

