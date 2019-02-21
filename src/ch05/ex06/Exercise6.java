package ch05.ex06;

/*
Podrozdział 5.1.6, "Klauzula finally", zawiera przykład błędnego wyrażenia try
z klauzulami catch i finally. Popraw ten kod poprzez: a) przechwytywanie wyjątku
w klauzuli finally, b) wyrażenie try/catch zawierające zagnieżdżone wyrażenie
try/catch oraz c) wyrażenie try z zadeklarowanymi zasobami oraz klauzulę catch.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exercise6 {
    private static void optionA(){
        BufferedReader in = null;

        try {
            in = Files.newBufferedReader(Paths.get("alice.txt"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if(in != null)
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
        }
    }

    private static void optionB(){
        BufferedReader in = null;

        try {
            in = Files.newBufferedReader(Paths.get("alice.txt"), StandardCharsets.UTF_8);

            try {
                in.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void optionC(){
        try(BufferedReader in = Files.newBufferedReader(Paths.get("alice.txt"), StandardCharsets.UTF_8)){

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        optionA();
        optionB();
        optionC();
    }
}
