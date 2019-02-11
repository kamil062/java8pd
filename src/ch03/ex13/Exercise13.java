package ch03.ex13;

/*
Napisz metodę, która pobiera tablicę instancji klas implementujących interfejs
Runnable i zwraca instancję Runnable, której metoda run wykonuje kolejno kod
instancji obiektów zapisanych w tablicy. Zwróć wyrażenie lambda.
*/

import java.util.Arrays;
import java.util.Random;

public class Exercise13 {
    private static Runnable multipleToOne(Runnable... tasks){
        return () -> {
            for(Runnable task : tasks)
                task.run();
        };
    }

    public static void main(String[] args){
        Runnable[] tasks = new Runnable[5];
        Arrays.fill(tasks, (Runnable) () -> System.out.println(Long.toString(new Random().nextLong(), 36)));

        new Thread(multipleToOne(tasks)).start();
    }
}
