package ch03.ex14;

/*
Napisz wywołanie Arrays.sort, które sortuje pracowników według wynagrodzenia,
a w przypadku takich samych wynagrodzeń według nazwiska. Użyj Comparator.thenComparing.
Następnie wykonaj to samo w odwrotnej kolejności.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Exercise14 {
    public static void main(String[] args){
        Employee[] employees = new Employee[]{
                new Employee("Kowalski", 5000),
                new Employee("Kowalski", 3000),
                new Employee("Zieliński", 2000),
                new Employee("Nowak", 2000),
                new Employee("Nowak", 1000)
        };

        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, Comparator.comparing(Employee::getSalary).thenComparing(Employee::getSecondName));
        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees, Comparator.comparing(Employee::getSecondName).thenComparing(Employee::getSalary));
        System.out.println(Arrays.toString(employees));
    }
}
