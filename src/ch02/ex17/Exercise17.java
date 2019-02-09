package ch02.ex17;

/*
Dla kolejki z poprzedniego ćwiczenia utwórz iterator - obiekt, który zwraca
po kolei elementy z kolejki. Zaimplementuj Iterator jako klasę zagnieżdżoną
z metodarni next i hasNext. Dodaj metodę iterator() w klasie Queue, która zwróci
obiekt Queue.Iterator. Czy iterator powinien być statyczny?
*/

import java.util.Random;

public class Exercise17 {
    private static final Random random = new Random();

    public static void main(String[] args){
        Queue queue = new Queue();

        for(int i = 0; i < 5; i++)
            queue.add(Long.toString(Math.abs(random.nextLong()), 36));

        Queue.Iterator it = queue.iterator();
        while(it.hasNext())
            System.out.print("[" + it.next().getValue() + "] ");
    }
}
