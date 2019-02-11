package ch03.ex12;

/*
Mając tablicę obiektów File, posortuj je w taki sposób, by katalogi znalazły się
przed plikami, a w każdej grupie elementy zostały posortowane według nazwy.
Użyj wyrażenia lambda przy implementowaniu interfejsu Comparator.
*/

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

import static java.util.Comparator.reverseOrder;

public class Exercise12 {
    public static void main(String[] args) {
        File f = new File("/test");
        File[] paths = f.listFiles();

        for (File file : paths)
            System.out.println(file.getName());
        System.out.println();

        Arrays.sort(paths, Comparator.comparing(File::isDirectory, reverseOrder()).thenComparing(File::getName));

        for (File file : paths)
            System.out.println(file.getName());
    }
}
