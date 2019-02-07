package ch01.ex02;

/*
Napisz program, który wczytuje l iczbę całkowitą opisującą kąt (która może mieć
wartość dodatnią lub ujemną) i normalizuje ją do wartości od O do 359 stopni.
Najpierw spróbuj zrobić to za pomocą operatora %, a następnie za pomocą metody
floorMod.
*/

import java.util.Scanner;

public class Exercise2 {
    private static int normalize1(int val){
        return (val % 360 + 360) % 360;
    }

    private static int normalize2(int val){
        return Math.floorMod(val, 360);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj kąt: ");

        int number = scanner.nextInt();

        System.out.printf("Podany kąt: %d\n", number);
        System.out.printf("Znormalizowany kąt metodą 1: %d\n", normalize1(number));
        System.out.printf("Znormalizowany kąt metodą 2: %d", normalize2(number));
    }
}
