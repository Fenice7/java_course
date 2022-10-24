package tasks;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class PrintDayOfTheWeek {

    // Вывести на экран текущее название дня недели, название месяца и свое имя.
    // Каждое слово должно быть в отдельной строке.

    public static void main(String[] args) {
        System.out.println("Today is - " + getDayString(LocalDate.now(), Locale.ENGLISH));
        System.out.println("Current month is - " + getMonthString(LocalDate.now(), Locale.ENGLISH));
        System.out.println("My name is Anna");
    }

    public static String getDayString(LocalDate date, Locale locale) {
        DayOfWeek day = date.getDayOfWeek();
        return day.getDisplayName(TextStyle.FULL, locale);
    }

    public static String getMonthString(LocalDate date, Locale  locale) {
        Month month = date.getMonth();
        return month.getDisplayName(TextStyle.FULL, locale);
    }
}
