package ch01.ex03;

/*
Korzystając z operatora warunkowego, napisz program, który wczytuje trzy liczby
całkowite i wyświetla największą z nich. Powtórz to samo z użyciem Math. max.
*/

import java.util.Scanner;

public class Exercise3 {
    private static int myMax(int numbers[]){
        int biggest = numbers[0];

        for(int n : numbers){
            if(n > biggest){
                biggest = n;
            }
        }

        return biggest;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numbers[] = new int[3];

        for(int i = 0; i < 3; i++) {
            System.out.print("Podaj liczbę numer " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.printf("Największa liczba (metoda 1): %d\n", myMax(numbers));
        System.out.printf("Największa liczba (metoda 2): %d", Math.max(Math.max(numbers[0], numbers[1]), numbers[2]));
    }
}
