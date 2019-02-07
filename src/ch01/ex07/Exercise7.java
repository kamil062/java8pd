package ch01.ex07;

/*!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/

/*
Napisz program, który wczytuje dwie liczby z zakresu od O do 65 535, zapisuje je
w zmiennych typu short, a następnie oblicza bez znaku ich sumę, różnicę, iloczyn,
iloraz i resztę z dzielenia bez konwertowania ich do typu int.
*/

import java.util.Scanner;

public class Exercise7 {
    private static short[] readNumbers(){
        Scanner in = new Scanner(System.in);

        short[] numbers = new short[2];

        for(int i = 0; i < 2; i++){
            System.out.print("Podaj liczbę numer " + i + ": ");

            int number = in.nextInt();

            if(number < 0) number = 0;
            if(number > 65535) number = 65535;

            numbers[i] = (short) (number - 32768);
        }

        return numbers;
    }

    public static void main(String[] args){

        short[] numbers = readNumbers();

        System.out.printf("%d + %d = %d\n", numbers[0] + 32768, numbers[1] + 32768,
                Short.toUnsignedInt((short)(numbers[0] + numbers[1])));
        System.out.printf("%d - %d = %d\n", numbers[0] + 32768, numbers[1] + 32768,
                Short.toUnsignedInt((short)(numbers[0] - numbers[1])));
        System.out.printf("%d * %d = %d\n", numbers[0] + 32768, numbers[1] + 32768,
                Short.toUnsignedInt((short)(numbers[0] * numbers[1])));
        System.out.printf("%d / %d = %d\n", numbers[0] + 32768, numbers[1] + 32768,
                Short.toUnsignedInt((short)(numbers[0] / numbers[1])));
    }
}
