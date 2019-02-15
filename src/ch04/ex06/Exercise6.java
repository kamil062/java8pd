package ch04.ex06;

/*
Załóżmy, że w podrozdziale 4.2.2, "Metoda equals", metoda Item.equals korzysta
z testu instanceof. Zaimplementuj DiscountedItem.equals w taki sposób,
by porównywała tylko klasę nadrzędną, jeśli otherObject jest klasy Item, ale również
brała pod uwagę zniżkę, jeśli jest ona klasy DiscountedItem. Pokaż, że ta metoda
zachowuje symetrię, ale nie jest przechodnia - czyli znajdź takie instancje obu klas,
by prawdziwe było x.equals(y) i y.equals(z), ale nie x.equals(z).
*/

public class Exercise6 {
    public static void main(String[] args){
        DiscountedItem x = new DiscountedItem("item", 29.99, 3.99);
        Item y = new Item("item", 29.99);
        Item z = new DiscountedItem("item", 29.99, 4.99);

        System.out.println(x.equals(y));
        System.out.println(y.equals(z));
        System.out.println(x.equals(z));

    }
}
