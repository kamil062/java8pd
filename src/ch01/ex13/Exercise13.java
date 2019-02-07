package ch01.ex13;

/*
Napisz program, który wyświetla zestawy liczb do Lotto, wybierając sześć różnych
liczb z zakresu od l do 49. Aby uzyskać sześć różnych liczb, zacznij od stworzenia
tablicy typu ArrayList, wypełnionej wartościami od l do 49. Losowo wybierz jedną
z liczb i usuń reprezentujący ją element z tablicy. Powtórz to sześć razy. Wyświetl
wylosowane liczby uporządkowane rosnąco.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exercise13 {
    public static void main(String[] args){
        ArrayList<Integer> possibleNumbers = new ArrayList<>();
        ArrayList<Integer> lottoNumbers = new ArrayList<>();

        for(int i = 1; i <= 49; i++)
            possibleNumbers.add(i);

        for(int i = 1; i <= 6; i++){
            int number = possibleNumbers.remove(new Random().nextInt(possibleNumbers.size()));
            lottoNumbers.add(number);
        }

        Collections.sort(lottoNumbers);

        System.out.println("Wylosowane liczby to: " + lottoNumbers.toString());
    }
}
