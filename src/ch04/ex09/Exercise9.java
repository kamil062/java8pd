package ch04.ex09;

/*
Napisz "uniwersalną" metodę toString wykorzystującą refleksje do zwrócenia ciągu
znaków ze wszystkimi zmiennymi instancji obiektu. Dostaniesz dodatkowe punkty,
jeśli potrafisz obsłużyć odwołania cykliczne.
*/

import ch04.ex05.Point;
import ch04.ex05.Rectangle;

import java.lang.reflect.Field;

public class Exercise9 {
    private static String universalToString(Object o) throws IllegalAccessException {
        String ret = o.getClass().getSimpleName() + "{";

        for(Field f : o.getClass().getDeclaredFields()){
            f.setAccessible(true);
            ret += f.getName() + "=" + f.get(o) + ", ";
        }

        if(o.getClass().getDeclaredFields().length > 0)
            ret = ret.substring(0, ret.length() - 2);

        return ret + '}';
    }

    public static void main(String[] args) throws IllegalAccessException {
        Point p = new Point(1, 1);
        Rectangle rect = new Rectangle(p, 10, 10);

        System.out.println(universalToString(p));
        System.out.println(universalToString(rect));
        System.out.println(universalToString(new Exercise9()));
    }
}
