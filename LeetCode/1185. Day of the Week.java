class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        int[] months = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (leapYear(year)) {
            months[2] = 29;
        }
        int totalDays = 4;
        for (int i = 1971; i < year; i++) {
            if (leapYear(i)) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }
        for (int i = 1; i < month; i++) {
            totalDays += months[i];
        }
        totalDays += day;
        return days[totalDays % 7];
    }

    public boolean leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }
}
