package DateAndTime;

/**
 * Created by fang on 01/11/2016.
 * <p>
 * The Calendar class is an abstract class that provides methods for converting
 * between a specific instant in time and a set of calendar fields such as
 * YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields,
 * such as getting the date of the next week.
 * <p>
 * You are given a date. Your task is to find what the day is on that date.
 */


import java.util.*;
import java.text.DateFormatSymbols;

public class DateAndTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();

        GregorianCalendar gc = new GregorianCalendar();
        gc.set(year, month-1, day);
        int weekday = gc.get(Calendar.DAY_OF_WEEK);

        String[] WeekDays = new DateFormatSymbols().getWeekdays();
        String wd = WeekDays[weekday].toUpperCase();
        System.out.println(wd);
    }
}
