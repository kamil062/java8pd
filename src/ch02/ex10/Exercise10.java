package ch02.ex10;

/*
W klasie RandomNumbers dostarcz dwie metody statyczne randomElement, które pobierają
losowy element z tablicy zawierającej liczby całkowite lub obiektu ArrayList.
(Zwracaj zero, jeśli tablica jest pusta). Dlaczego nie możesz zaimplementować
tych metod jako metod instancji int[] lub ArrayList<Integer>?
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise10 {
    public static void main(String[] args){
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(new Integer[] {
                1, 2, 3, 4, 5, 6, 7, 8, 9
        }));


        System.out.println(RandomNumbers.randomElement(array));
        System.out.println(RandomNumbers.randomElement(list));
    }
}
