package ch03.ex14;

import java.util.Random;

public class Employee {
    private String firstName;
    private String secondName;
    private int salary;
    private static final Random generator = new Random();

    public Employee(String secondName, int salary){
        this.firstName = Long.toString(Math.abs(generator.nextLong()), 36);
        this.secondName = secondName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.secondName + " " + salary;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getSalary() {
        return salary;
    }
}
