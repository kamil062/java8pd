package ch01.ex14;

/*
Napisz program, który wczytuje dwuwymiarową tablicę liczb całkowitych i ustala,
czy jest ona kwadratem magicznym (takim, w którym sumy wartości we wszystkich
wierszach, wszystkich kolumnach i na przekątnych są równe). Wczytuj wiersze
zawierające liczby, które można odczytać jako liczby całkowite, i przerwij
wczytywanie po napotkaniu pustego wiersza. Na przykład dla danych

16 3 2 13
5 lO ll 8
9 6 7 12
4 15 14 l
(Pusty wiersz)

Twój program powinien rozpoznać kwadrat magiczny.
 */

import java.util.Scanner;

public class Exercise14 {
    private static int[][] readMatrix(){
        Scanner scanner = new Scanner(System.in);

        int[][] matrix;

        String firstLine = scanner.nextLine();

        int len = firstLine.split(" ").length;
        matrix = new int[len][len];
        for(int i = 0; i < len; i++)
            matrix[0][i] = Integer.parseInt(firstLine.split(" ")[i]);

        for(int i = 1; i < len; i++){
            String nextLine = scanner.nextLine();
            for(int j = 0; j < len; j++)
                matrix[i][j] = Integer.parseInt(nextLine.split(" ")[j]);
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix){
        for(int[] i : matrix){
            for(int j : i){
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    private static boolean isMagic(int[][] matrix){
        Integer sumToCheck = null;
        int len = matrix.length;

        // first dimension
        for(int i = 0; i < len; i++){
            int sum = 0;
            for(int j = 0; j < len; j++){
                sum += matrix[i][j];
            }
            if(sumToCheck == null) sumToCheck = sum;
            else if(!sumToCheck.equals(sum)) return false;
        }

        // second dimention
        for(int i = 0; i < len; i++){
            int sum = 0;
            for(int j = 0; j < len; j++){
                sum += matrix[j][i];
            }
            if(!sumToCheck.equals(sum)) return false;
        }

        // diagonals
        int sum = 0;
        for(int i = 0; i < len; i++)
            sum += matrix[i][i];
        if(!sumToCheck.equals(sum)) return false;

        sum = 0;
        for(int i = 0; i < len; i++)
            sum += matrix[i][len - 1 - i];
        if(!sumToCheck.equals(sum)) return false;

        return true;
    }

    public static void main(String[] args){
        int[][] matrix = readMatrix();

        printMatrix(matrix);
        System.out.println("Ta macierz" + (isMagic(matrix) ? "" : " nie") + " jest magicznym kwadratem");
    }
}
