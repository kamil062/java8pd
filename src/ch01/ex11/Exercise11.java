package ch01.ex11;

/*
Napisz program, który wczytuje wiersz tekstu i wyświetla wszystkie litery, które
nie należą do zbioru ASCII wraz z ich wartościami Unicode.
*/

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wiersz tekstu: ");

        String text = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int codePoint : text.codePoints().toArray()){
            if(codePoint > 127){
                sb.appendCodePoint(codePoint);
            }
        }

        System.out.println("Znaki nie należące do zbioru ASCII: " + sb.toString());
    }
}
