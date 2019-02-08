package ch02.ex04;

/*
Dlaczego nie można zaimplementować w Javie metody zamieniającej zawartość
dwóch zmiennych typu int? Zamiast tego napisz metodę zamieniającą zawartość
dwóch obiektów IntHolder. (Dokumentację tej dość prostej klasy znajdziesz
w dokumentacji API). Czy możesz zamienić zawartość dwóch obiektów typu Integer?
*/

import org.omg.CORBA.IntHolder;

public class Exercise4 {
    private static void swap(int i, int j){
        int tmp = i;
        i = j;
        j = tmp;
    }

    private static void swapIntHolder(IntHolder i, IntHolder j){
        IntHolder tmp = new IntHolder(i.value);
        i.value = j.value;
        j.value = tmp.value;
    }

    private static void swapInteger(Integer i, Integer j){
        Integer tmp = i;
        i = j;
        j = tmp;
    }


    public static void main(String[] args){
        // Nie zadziała, ponieważ w Javie parametry przekazywane są przez wartość a nie przez referencję
        int i = 1;
        int j = 2;
        System.out.println(i + " " + j);
        swap(i, j);
        System.out.println(i + " " + j);

        // Zadziała, ponieważ modyfikujemy wnętrze obiektu a nie jego przekazaną kopię referencji
        IntHolder i1 = new IntHolder(1);
        IntHolder j1 = new IntHolder(2);
        System.out.println(i1.value + " " + j1.value);
        swapIntHolder(i1, j1);
        System.out.println(i1.value + " " + j1.value);

        // Nie zadziała z tego samego powodu co pierwszy przypadek
        Integer i2 = 1;
        Integer j2 = 2;
        System.out.println(i2 + " " + j2);
        swapInteger(i2, j2);
        System.out.println(i2 + " " + j2);
    }
}
