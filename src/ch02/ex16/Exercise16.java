package ch02.ex16;

/*
Zaimplementuj klasę Queue, nieograniczoną kolejkę ciągów znaków. Dodaj metodę
add, która dodaje element na końcu, oraz metodę remove usuwającą element z początku
kolejki. Zaimplementuj elementy w postaci połączonej listy węzłów. Zaimplementuj
Node jako klasę zagnieżdżoną. Czy powinna ona być klasą statyczną?
*/

import java.util.Random;

public class Exercise16 {
    private static final Random random = new Random();

    public static void main(String[] args){
        Queue queue = new Queue();

        System.out.println(queue);

        for(int i = 0; i < 5; i++) {
            queue.add(Long.toString(Math.abs(random.nextLong()), 36));
            System.out.println(queue);
        }

        System.out.println();

        for(int i = 0; i < 5; i++) {
            queue.remove();
            System.out.println(queue);
        }
    }
}
