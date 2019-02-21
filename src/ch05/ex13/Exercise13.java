package ch05.ex13;

/*
Zaimplementuj i przetestuj filtr rekordów rejestrowanych danych, który odrzuci
rekordy zawierające brzydkie słowa, takie jak seks, narkotyki i C++.
*/

import java.util.logging.Logger;

public class Exercise13 {
    public static void main(String[] args){
        Logger.getGlobal().setFilter((record) -> {
            String[] badWords = new String[] { "seks", "narkotyki", "C++" };

            for(String word : badWords)
                if(record.getMessage().toLowerCase().contains(word.toLowerCase()))
                    return false;

            return true;
        });

        Logger.getGlobal().info("Test1");
        Logger.getGlobal().info("Test2");
        Logger.getGlobal().info("seks");
        Logger.getGlobal().info("narkotyki");
        Logger.getGlobal().info("lubię C++");
        Logger.getGlobal().info("Test3");
        Logger.getGlobal().info("Test4");
    }
}
