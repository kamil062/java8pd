package ch03.ex02;

/*
Kontynuując poprzednie ćwiczenie, utwórz metodę Measurable largest(Measurable[] objects).
Wykorzystaj ją do ustalenia nazwiska pracownika z najwyższym wynagrodzeniem. Do czego użyjesz rzutowania?
*/

import java.util.Random;

public class Exercise2 {
    private static final Random generator = new Random();

    private static double average(Measurable[] objects){
        double sum = 0.0;
        int count = 0;
        for(Measurable o : objects){
            sum += o.getMeasure();
            count++;
        }

        return sum / count;
    }

    private static Measurable largest(Measurable[] objects){
        Measurable highest = objects[0];
        for(Measurable o : objects){
            if(o.getMeasure() > highest.getMeasure()){
                highest = o;
            }
        }

        return highest;
    }

    public static void main(String[] args){
        Employee[] employees = new Employee[] {
                new Employee(generator.nextDouble() + 1000 + generator.nextInt(3000)),
                new Employee(generator.nextDouble() + 1000 + generator.nextInt(3000)),
                new Employee(generator.nextDouble() + 1000 + generator.nextInt(3000)),
                new Employee(generator.nextDouble() + 1000 + generator.nextInt(3000)),
                new Employee(generator.nextDouble() + 1000 + generator.nextInt(3000))
        };


        for(Employee e : employees)
            System.out.println(e);

        Employee largestSalary = (Employee) largest(employees);

        System.out.println();
        System.out.printf("Avg salary: %.2f\n", average(employees));
        System.out.printf("Largest salary: %s %s - %.2f\n",
                largestSalary.getFirstName(), largestSalary.getSecondName(), largestSalary.getSalary());
    }
}
