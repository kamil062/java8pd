package ch04.ex10;

/*
Wykorzystaj program MethodPrinter z podrozdziału 4.5.1, "Wyliczanie elementów
klasy", do wyliczenia wszystkich metod klasy int[]. Dostaniesz dodatkowe punkty,
jeśli potrafisz zidentyfikować źle opisaną metodę (omówioną w tym rozdziale).
*/

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Exercise10 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cl = new int[] {1, 2, 3}.getClass();

        while (cl != null) {
            for (Method m : cl.getDeclaredMethods()) {
                System.out.println(
                        Modifier.toString(m.getModifiers()) + " " +
                                m.getReturnType().getCanonicalName() + " " +
                                m.getName() +
                                Arrays.toString(m.getParameters()));
            }
            cl = cl.getSuperclass();
        }
    }
}
