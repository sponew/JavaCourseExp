package exp8.test3;

class YearWorker extends Employee {
    int year;
    double yearSalary;

    YearWorker(int y, double s) { //工作年数，年工资
        year = y;
        yearSalary = s;
    }

    double earnings() {  //重写抽象方法
        return year * yearSalary;
    }

}
