package ch02.ex15;

/*
Zaimplementuj całą klasę Invoice z podrozdziału 2.6.1 , "Zagnieżdżone klasy
statyczne". Dodaj metodę wyświetlającą fakturę, oraz program demonstracyjny,
który tworzy i wyświetla przykładową fakturę.
*/

import java.util.Random;

public class Exercise15 {
    private static final Random random = new Random();

    public static void main(String[] args){
        Invoice invoice = new Invoice();

        for(int i = 0; i < 6; i++){
            String description = Long.toString(Math.abs(random.nextLong()), 36);
            int quantity = random.nextInt(10) + 1;
            double unitPrice = Math.round(random.nextDouble() * 100.0) / 100.0 + random.nextInt(10);

            invoice.add(new Invoice.Item(description, quantity, unitPrice));
        }

        System.out.println(invoice);
    }
}
