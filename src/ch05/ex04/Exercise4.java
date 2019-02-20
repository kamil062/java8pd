package ch05.ex04;

/*
Powtórz poprzednie ćwiczenie, ale bez użycia wyjątków. Zamiast tego niech
readValues i sumOfValues zwracają jakieś kody błędów.
*/

import javafx.util.Pair;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import static ch05.ex01.Exercise1.readValues;

public class Exercise4 {
    public static Pair<Integer, ArrayList<Double>> readValues(String filename) {
        ArrayList<Double> values = new ArrayList<>();

        Scanner in = null;
        try {
            in = new Scanner(Paths.get(filename));
        } catch (IOException e) {
            return new Pair<>(-1, null);
        }
        while (in.hasNext()) {
            if(in.hasNextDouble())
                values.add(in.nextDouble());
            else
                return new Pair<>(-2, null);
        }

        return new Pair<>(0, values);
    }

    public static Pair<Integer, Double> sumOfValues(String filename) {
        Pair<Integer, ArrayList<Double>> values = readValues(filename);

        if(values.getKey() == 0){
            double sum = 0;
            for(double val : values.getValue())
                sum += val;

            return new Pair<>(0, sum);
        }

        return new Pair<>(values.getKey(), 0.0);
    }

    public static void main(String[] args){
        Pair<Integer, Double> sum = sumOfValues("values.txt");

        if(sum.getKey() == 0)
            System.out.println("sum" + Arrays.toString(readValues("values.txt").getValue().toArray()) + " = " + sum.getValue());
        else if(sum.getKey() == -1)
            System.out.println("Nie udało się wczytać pliku");
        else if(sum.getKey() == -2)
            System.out.println("Napotkano liczbę niezmiennoprzecinkową");
    }
}
