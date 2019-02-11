package ch03.ex10;

/*
Korzystając z metod listFiles(FileFilter) i isDirectory z klasy java.io.File,
napisz metodę zwracającą wszystkie podkatalogi wskazanego katalogu. Wykorzystaj
wyrażenie lambda zamiast obiektu FileFilter. Wykonaj to samo za pomocą
wyrażenia z metodą i anonimowej klasy wewnętrznej.
*/

import java.io.File;
import java.io.FileFilter;

public class Exercise10 {
    private static void listDirectoriesLambda(){
        File f = new File("/");
        File[] paths = f.listFiles(pathname -> pathname.getName().startsWith("a"));

        for(File file : paths)
            if(file.isDirectory())
                System.out.println(file.getName());
    }

    private static void listDirectoriesAnonymousClass(){
        File f = new File("/");
        File[] paths = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().startsWith("a");
            }
        });

        for(File file : paths)
            if(file.isDirectory())
                System.out.println(file.getName());
    }

    public static void main(String[] args){
        listDirectoriesLambda();
        listDirectoriesAnonymousClass();
    }
}
