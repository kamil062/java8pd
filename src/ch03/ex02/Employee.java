package ch03.ex02;

import java.util.Random;

public class Employee implements Measurable {
    private String firstName;
    private String secondName;
    private double salary;
    private static final Random generator = new Random();

    public Employee(double salary){
        this.firstName = Long.toString(Math.abs(generator.nextLong()), 36);
        this.secondName = Long.toString(Math.abs(generator.nextLong()), 36);
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return this.salary;
    }

    @Override
    public String toString(){
        return String.format("Employee %s %s, salary: %.2f", this.firstName, this.secondName, this.salary);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public double getSalary() {
        return salary;
    }
}
