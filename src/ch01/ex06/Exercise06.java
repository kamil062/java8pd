package ch01.ex06;

/*
Napisz program, który oblicza silnię n!= 1 *2* ... *n, wykorzystując Biginteger .
Oblicz silnię l 000.
*/

import java.math.BigInteger;

public class Exercise06 {
    private static BigInteger factorial(int n){
        if(n <= 1) {
            return BigInteger.valueOf(1);
        } else if(n == 2){
            return BigInteger.valueOf(2);
        } else {
            return BigInteger.valueOf(n).multiply(factorial(n - 1));
        }
    }

    public static void main(String[] args){
        System.out.printf("1000! = %s", factorial(1000));
    }
}
