package ch01.ex08;

/*
Napisz program, który wczytuje ciąg znaków i wyświetla wszystkie zawarte w nim
niepuste ciągi znaków.
*/

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ciąg znaków: ");

        String string = scanner.nextLine();

        System.out.println("Lista niepustych ciągów znaków: ");
        for(String substring : string.split(" ")){
            if(substring.length() > 0){
                System.out.println(substring);
            }
        }
    }
}
