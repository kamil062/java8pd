package ch04.ex11;

/*
Napisz program "Witaj, świecie", wykorzystując mechanizm refleksji do odnalezienia
pola out w java.lang.System i korzystając z invoke do wywołania metody
println.
*/

import java.lang.reflect.*;

public class Exercise11 {
    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Class<?> cl = Class.forName("java.lang.System");

        Field f = cl.getField("out");
        Method m = f.get(cl).getClass().getMethod("println", String.class);
        m.invoke(f.get(null), "Hello world!");

    }
}
