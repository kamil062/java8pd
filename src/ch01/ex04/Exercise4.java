package ch01.ex04;

/*
Napisz program wyświetlający najmniejszą i największą liczbę dodatnią typu double.
Podpowiedź : poszukaj Math.nextUp w Java API.
*/

public class Exercise4 {
    public static void main(String[] args){
        System.out.printf("Najmniejsza licba dodatnia typu double: %f\n", Double.MIN_VALUE);
        System.out.printf("Największa licba dodatnia typu double: %f", Math.nextUp(Double.MAX_VALUE));
    }
}
