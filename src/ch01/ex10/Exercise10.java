package ch01.ex10;

/*
Napisz program, który tworzy losowy ciąg liter i cyfr, generując losową wartość
typu long i wyświetlając ją w systemie o podstawie 36.
*/

import java.util.Random;

public class Exercise10 {
    public static void main(String[] args){
        System.out.println(Long.toString(new Random().nextLong(), 36));
    }
}
