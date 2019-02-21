package ch05.ex12;

/*
Napisz metodę int min(int[] values), która przed zwróceniem najmniejszej
wartości sprawdza dodatkowo za pomocą asercji, czy rzeczywiście ta wartość jest
mniejsza albo równa wszystkim wartościom w tablicy. Użyj metody pomocniczej
lub, jeśli zajrzałeś już do rozdziału 8., metody Stream.allMatch. Wywołuj metodę
w pętli dla dużej tablicy i zmierz czas wykonania kodu z asercją włączoną,
wyłączoną i usuniętą.
*/

import java.util.Random;

public class Exercise12 {
    private static boolean isMin(int value, int[] values){
        for(int v : values)
            if(v < value)
                return false;

        return true;
    }

    private static int min(int[] values){
        int min = values[0];

        for(int value : values)
            min = Math.min(min, value);

        assert isMin(min, values);

        return min;
    }

    public static void main(String[] args){
        int[] values = new int[10000000];
        for (int i = 0; i < values.length; i++)
            values[i] = new Random().nextInt();

        for(int j = 0; j < 5; j++) {
            long t0 = System.currentTimeMillis();

            System.out.println(min(values));
            System.out.println(System.currentTimeMillis() - t0 + "ms.");
        }

        // czasy w milisekundach
        // asercja włączona - 45, 33, 38, 24, 23
        // asercja wyłączona - 25, 16, 21, 16, 17
        // brak asercji - 25, 18, 23, 19, 19
    }
}
