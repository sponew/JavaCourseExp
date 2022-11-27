package exp8.test4;

class bank {
    int year;
    int savemoney;
    double interet;
    double interetrate;

    double computerinteret() {
        interet = year * interetrate * savemoney;
        return interet;
    }

    void setlilv(double r) {
        interetrate = r;
    }
}
