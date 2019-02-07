package ch01.ex09;

/*
Podrozdział 1.5.3, "Porównywanie ciągów znaków", zawiera przykład dwóch ciągów
znaków s i t takich, że s.equals(t), ale s != t . Podaj inny przykład bez korzystania
z metody substring.
*/

public class Exercise9 {
    public static void main(String[] args){
        String string1 = "Java";
        String string2 = new String("Java");

        System.out.println(string1.equals(string2));    // true
        System.out.println(string1 == string2);         // false
    }
}
