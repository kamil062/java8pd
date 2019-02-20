package ch05.ex02;

/*
Napisz metodę public double sumOfValues(String filename) throws...
wywołującą poprzednią metodę i zwracającą sumę wartości w pliku. Przekazuj
wszystkie wyjątki do kodu wywołującego tworzoną metodę.
*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;

import static ch05.ex01.Exercise1.readValues;

public class Exercise2 {
    public static double sumOfValues(String filename) throws IOException, InputMismatchException {
        ArrayList<Double> values = readValues(filename);

        double sum = 0;
        for(double val : values)
            sum += val;

        return sum;
    }

    public static void main(String args[]){
        try {
            double sum = sumOfValues("values.txt");
            System.out.println("sum" + Arrays.toString(readValues("values.txt").toArray()) + " = " + sum);
        } catch (IOException e) {
            System.out.println("Nie udało się wczytać pliku");
        } catch (InputMismatchException e){
            System.out.println("Napotkano liczbę niezmiennoprzecinkową");
        }
    }
}
