package ch03.ex07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
Zaimplementuj metodę void luckySort (ArrayList<String> strings, Comparator<String> comp),
która wywołuje Collections.shuffle na tablicy typu ArrayList do chwili,
gdy elementy będą uporządkowane rosnąco w sposób określony przez komparator.
*/

public class Exercise7 {
    private static void luckySort(ArrayList<String> strings, Comparator<String> comp){
        boolean sorted;

        do {
            Collections.shuffle(strings);

            sorted = true;
            for(int i = 0; i < strings.size() - 1; i++){
                if(comp.compare(strings.get(i), strings.get(i + 1)) > 0){
                    sorted = false;
                    break;
                }
            }

        } while(!sorted);
    }

    public static void main(String[] args){
        Comparator<String> comp = (a, b) -> a.compareTo(b);
        ArrayList<String> list = new ArrayList<>(Arrays.asList(new String[]{
                "e", "a", "c", "b", "f", "d"
        }));

        System.out.print(list + " -> ");
        luckySort(list, comp);
        System.out.println(list);
    }
}
