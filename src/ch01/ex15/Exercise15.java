package ch01.ex15;

/*
Napisz program, który zapisuje trójkąt Pascala do stopnia n w ArrayList<ArrayList<Integer>>.
*/

import java.util.ArrayList;

public class Exercise15 {
    private static Integer factorial(int n){
        if(n <= 1)      return 1;
        else if(n == 2) return 2;
        else            return n * factorial(n - 1);
    }

    private static Integer binomialCoefficient(int n, int k){
        if(n == 0 || k == 0)    return 1;
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    private static ArrayList<ArrayList<Integer>> makePascalTriangle(int n){
        ArrayList<ArrayList<Integer>> pascalTriangle = new ArrayList<>();

        for(int i = 0; i < n; i++){
            ArrayList<Integer> level = new ArrayList<>();

            for(int j = 0; j < i + 1; j++)  level.add(binomialCoefficient(i, j));

            pascalTriangle.add(level);
        }

        return pascalTriangle;
    }

    private static void printPascalTriangle(ArrayList<ArrayList<Integer>> pascalTriangle){
        int levels = pascalTriangle.size();

        for(int i = 0; i < levels; i++){
            for(int k = levels - 1; k > i; k-=1)
                System.out.print("\t");

            for(int j : pascalTriangle.get(i)) {
                System.out.print(j);
                for(int k = levels - 4; k < levels; k+=2)
                    System.out.print("\t");
            }

            System.out.println();
        }
    }

    public static void main(String[] args){
        printPascalTriangle(makePascalTriangle(10));
    }
}
