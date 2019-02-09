package ch02.ex10;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    private static final Random generator = new Random();

    public static int randomElement(int[] array){
        int len = array.length;
        if(len == 0) return 0;

        int element = array[generator.nextInt(len)];
        return element;
    }

    public static int randomElement(ArrayList<Integer> list){
        int len = list.size();
        if(len == 0) return 0;

        int element = list.get(generator.nextInt(len));
        return element;
    }
}
