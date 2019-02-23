package ch06.ex05;

/*
Rozważ taki wariant metody swap, w którym tablica może być uzupełniana
za pomocą tablicy ze zmienną liczbą parametrów (vararg):
private static <T> T[] swap(int i, int j, T... values) {
    T temp = values[i];
    values[i] = values[j];
    values[j] = temp;
    return values;
}
Następnie popatrz na wywołanie
Double[] values = Arrays.swap(0, 1, 1.5, 2, 3);
Jaki komunikat o błędzie otrzymałeś? Następnie wywołaj:
Double[] values = Arrays.<Double>swap(0, 1, 1.5, 2, 3);
Czy komunikat o błędzie wygląda lepiej? Co zrobisz, by naprawić ten problem?
*/

import java.util.Arrays;

public class Exercise5 {
    private static <T> T[] swap(int i, int j, T... values) {
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }

    public static void main(String[] args){
        Double[] values = swap(0, 1, 1.5, 2.0, 3.0);
        System.out.println(Arrays.toString(values));
        Double[] values2 = Exercise5.<Double>swap(0, 1, 1.5, 2.0, 3.0);
        System.out.println(Arrays.toString(values2));
    }
}
