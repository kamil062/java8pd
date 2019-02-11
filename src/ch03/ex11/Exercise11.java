package ch03.ex11;

/*
Korzystając z metody list(FilenameFilter) klasy java.io.File, napisz metodę
zwracającą wszystkie pliki ze wskazanego katalogu ze wskazanym rozszerzeniem.
Użyj wyrażenia lambda, a nie FilenameFilter. Jakie zmienne zewnętrzne
wykorzystasz?
*/

import java.io.File;

public class Exercise11 {
    private static void listFilesExtension(String ext){
        File f = new File("/");
        File[] paths = f.listFiles(((dir, name) -> name.endsWith(ext)));

        for(File file : paths)
            System.out.println(file.getName());
    }

    public static void main(String[] args){
        listFilesExtension(".exe");
    }
}
