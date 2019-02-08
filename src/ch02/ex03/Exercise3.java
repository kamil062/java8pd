package ch02.ex03;

/*
Czy może istnieć metoda modyfikująca zwracająca coś innego niż void? Czy może
istnieć metoda dostępowa zwracająca void? Jeśli tak, podaj przykłady.
*/

public class Exercise3 {
    private static int param = 0;

    public static void main(String[] args){

    }

    public static int modyfyingMethod(){
        return ++param;
    }

    public static void accessMethod(){
        // ?????????
    }
}
