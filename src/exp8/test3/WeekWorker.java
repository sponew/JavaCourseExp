package exp8.test3;

class WeekWorker extends Employee {
    int week;
    double weekSalary;

    WeekWorker(int w, double s) {
        week = w;
        weekSalary = s;
    }

    double earnings() {
        return week * weekSalary;
    }
}
