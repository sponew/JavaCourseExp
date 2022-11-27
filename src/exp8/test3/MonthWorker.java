package exp8.test3;

class MonthWorker extends Employee {
    int month;
    double monthSalary;

    MonthWorker(int m, double s) {
        month = m;
        monthSalary = s;
    }

    double earnings() {
        return month * monthSalary;
    }
}
