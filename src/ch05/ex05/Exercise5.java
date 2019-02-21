package ch05.ex05;

/*
Zaimplementuj metodę zawierającą kod klas Scanner i PrintWriter z podrozdziału
5.1.5, "Wyrażenie try z zadeklarowanymi zasobami". Nie używaj jednak wyrażenia
try z zadeklarowanymi zasobami. Zamiast tego użyj zwykłych klauzul catch. Upewnij
się, że zamykasz oba obiekty, jeśli zostały poprawnie utworzone. Musisz wziąć
pod uwagę następujące sytuacje:
• konstruktor klasy Scanner wyrzuca wyjątek;
• konstruktor klasy PrintWriter wyrzuca wyjątek;
• metoda hasNext, next lub println wyrzuca wyjątek;
• out.close() wyrzuca wyjątek;
• in.close() wyrzuca wyjątek.
*/

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = null;
        PrintWriter out = null;

        try {
            in = new Scanner(Paths.get("alice.txt"));
            out = new PrintWriter("output.txt");

            while(in.hasNext())
                out.println(in.next().toLowerCase());

            System.out.println("Sukces");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException");
        } finally {
            try {
                if (in != null)
                    in.close();
                if (out != null)
                    out.close();
            } catch(IllegalStateException e){
                System.out.println("IllegalStateException");
            }
        }
    }
}
