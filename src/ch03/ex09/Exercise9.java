package ch03.ex09;

/*
Zaimplementuj metody:
public static void runTogether(Runnable... tasks)
public static void runlnOrder(Runnable... tasks)
Pierwsza metoda powinna uruchomić każde zadanie w oddzielnym wątku i zakończyć
działanie. Druga metoda powinna uruchomić wszystkie zadania w bieżącym wątku
i zakończyć działanie po zakończeniu ostatniego z nich.
*/

import java.util.Arrays;
import java.util.Random;

public class Exercise9 {
    public static void runTogether(Runnable... tasks){
        for(Runnable task : tasks)
            new Thread(task).start();
    }

    public static void runInOrder(Runnable... tasks){
        for(Runnable task : tasks)
            task.run();
    }

    public static void main(String[] args){
        Runnable[] tasks = new Runnable[5];
        Arrays.fill(tasks, (Runnable) () -> {
            try {
                System.out.println(Long.toString(new Random().nextLong(), 36));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        runTogether(tasks);
        runInOrder(tasks);
    }
}
