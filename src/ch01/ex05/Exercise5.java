package ch01.ex05;

/*
Co się stanie, jeśli wykonasz rzutowanie zmiennej typu double do typu int w sytuacji,
gdy ma ona większą wartość niż największa możliwa do zapisania w typie int?
Spróbuj
*/

public class Exercise5 {
    public static void main(String[] args){
        int maxInt = Integer.MAX_VALUE;
        double maxDouble = Double.MAX_VALUE;

        int doubleCasted = (int) maxDouble;

        System.out.printf("Największa wartość typu double: %f\n", maxDouble);
        System.out.printf("Największa wartość typu int: %d\n", maxInt);
        System.out.printf("Wartość double rzutowana do int: %d\n", doubleCasted);

        // Odpowiedź: wartość przyjmie największą możliwą dla typu int.
    }
}
