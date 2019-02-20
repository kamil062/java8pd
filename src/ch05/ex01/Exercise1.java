package ch05.ex01;

/*
Napisz metodę public Arraylist<Double>readValues(String filename) throws ...,
która odczyta plik zawierający liczby zmiennoprzecinkowe. Wyrzuć odpowiednie
wyjątki, jeśli nie będzie możliwe otwarcie pliku lub jeśli trafisz na dane niebędące
liczbami zmiennoprzecinkowymi.
*/

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static ArrayList<Double> readValues(String filename) throws IOException, InputMismatchException {
        ArrayList<Double> values = new ArrayList<>();

        Scanner in = new Scanner(Paths.get(filename));
        while (in.hasNext())
            values.add(in.nextDouble());

        return values;
    }

    public static void main(String[] args){
        try {
            ArrayList<Double> values = readValues("values.txt");
            System.out.println(Arrays.toString(values.toArray()));

            //throws IOException
            //ArrayList<Double> values2 = readValues("values2.txt");

            //throws InputMismatchException
            //ArrayList<Double> values2 = readValues("ascabh.txt");
        } catch (IOException e) {
            System.out.println("Nie udało się wczytać pliku");
        } catch (InputMismatchException e){
            System.out.println("Napotkano liczbę niezmiennoprzecinkową");
        }
    }
}
