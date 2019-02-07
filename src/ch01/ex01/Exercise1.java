package ch01.ex01;

import java.util.Scanner;

/*
Napisz program, który wczytuje zmienną całkowitą i wyświetla ją w postaci liczby
binarnej, ósemkowej i szesnastkowej. Wyświetl jej odwrotność w postaci
szesnastkowej liczby zmiennoprzecinkowej.
*/

public class Exercise1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");

        int number = scanner.nextInt();
        float inv = (float) (1.0 / number);
        String binaryString = Integer.toBinaryString(number);

        System.out.printf("\t %1$d DEC \n=\t %2$s BIN \n=\t %1$o OCT \n=\t %1$X HEX\n", number, binaryString);
        System.out.println();
        System.out.printf("%1$f DEC = %1$a HEX", inv);
    }
}
