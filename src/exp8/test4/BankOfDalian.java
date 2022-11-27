package exp8.test4;

class BankOfDalian extends bank {
    double year;

    double computerinteret() {
        super.year = (int) year;
        double yearinteret = super.computerinteret();
        double r = year - (int) year;
        double day = (int) (r * 1000);
        double dayinteret = day * 0.00807938 * savemoney;
        interet = yearinteret + dayinteret;
        return interet;
    }
}
