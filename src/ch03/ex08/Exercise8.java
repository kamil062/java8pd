package ch03.ex08;

/*
Zaimplementuj klasę Greeter, która implementuje interfejs Runnable i w której metoda
run wyświetla n kopii tekstu "Witaj, " + target, gdzie n i target są ustawiane
w konstruktorze. Stwórz dwie instancje z różnymi komunikatami i wykonaj je
równolegle w dwóch wątkach.
*/

public class Exercise8 {
    public static void main(String[] args){
        new Thread(new Greeter(5, "Jaś")).start();
        new Thread(new Greeter(3, "Małgosia")).start();
    }
}
