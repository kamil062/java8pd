package ch03.ex01;

/*
Utwórz interfejs Measurable z metodą double getMeasure(), która dostarcza jakąś
metrykę obiektu. Zaimplementuj interfejs Measurable w klasie Employee. Utwórz
metodę double average(Measurable[] objects), która oblicza średnią metryk.
Wykorzystaj ją do obliczenia średniego wynagrodzenia pracowników, których dane
są zapisane w tablicy.
*/

import java.util.Random;

public class Exercise1 {
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

        System.out.println();
        System.out.printf("Avg salary: %.2f\n", average(employees));
    }
}
