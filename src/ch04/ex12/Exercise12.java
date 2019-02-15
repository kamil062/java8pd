package ch04.ex12;

/*
Zmierz różnicę wydajności pomiędzy zwykłym wywołaniem metody a wywołaniem
metody za pomocą refleksji.
*/

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Exercise12 {
    public static void executeUsingReflection()
            throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Class<?> cl = Class.forName("java.lang.System");

        Field f = cl.getField("out");
        Method m = f.get(cl).getClass().getMethod("print", String.class);
        m.invoke(f.get(null), "");
    }

    public static void executeClassic(){
        System.out.print("");
    }

    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, NoSuchMethodException{
        long time0 = System.currentTimeMillis();
        for(int i = 0; i <= 100000; i++)
            executeUsingReflection();
        long time1 = System.currentTimeMillis();
        for(int i = 0; i <= 100000; i++)
            executeClassic();
        long time2 = System.currentTimeMillis();

        System.out.printf("reflection: %dms.\tclassic: %dms.", (time1 - time0), (time2 - time1));
    }
}
