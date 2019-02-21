package ch05.ex11;

/*
Porównaj wykorzystanie Objects.requireNonNull(obj) i assert obj ! = null.
Podaj przykład odpowiedniego wykorzystania obu tych wyrażeń.
*/

import java.util.Objects;

public class Exercise11 {
    private static void test(String val){
        Objects.requireNonNull(val);
    }

    private static void test2(String val){
        assert val != null;
    }

    public static void main(String[] args){
        try {
            test(null);
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        try {
            test2(null);
        } catch (AssertionError e){
            System.out.println(e.getMessage());
        }
    }
}

