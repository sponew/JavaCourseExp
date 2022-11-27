package exp5.test4;

public class MobileTelephone {
    SIM sim;

    void setSIM(SIM card) {
        sim = card;
    }

    long lookNumber() {
        return sim.getNumber();
    }
}
