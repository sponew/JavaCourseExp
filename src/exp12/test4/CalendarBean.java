package exp12.test4;

import java.util.Calendar;

class CalendarBean {
    String day[];
    int year = 2005, month = 0;

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public String[] getCalendar() {
        String a[] = new String[42];
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        int weeklyDay = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        int day = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            day = 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            day = 30;
        }
        if (month == 2) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                day = 29;
            } else {
                day = 28;
            }
        }
        for (int i = weeklyDay, n = 1; i < weeklyDay + day; i++) {
            a[i] = String.valueOf(n);
            n++;
        }
        return a;
    }
}
