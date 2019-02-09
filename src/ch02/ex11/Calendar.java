package ch02.ex11;

/*
Przepisz klasę Cal w taki sposób, by używać statycznego importowania dla klas
System i LocalDate.
*/

import java.time.DayOfWeek;
import java.time.LocalDate;
import static java.time.LocalDate.now;

public class Calendar {
    public static void main(String[] args) {
        LocalDate date = now().withDayOfMonth(1);
        int month = date.getMonthValue();

        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1 = Monday, ... 7 = Sunday
        for (int i = 0; i < value; i++)
            System.out.print("    ");
        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 7)
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
    }
}
