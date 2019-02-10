package ch03.ex05;

/*
Zaimplementuj metodę statyczną constant w klasie IntSequence, która zwraca
nieskończony ciąg stałych. Na przykład IntSequence.constant(l) zwraca wartości
l l l ... , w nieskończoność. Dodatkowe punkty za wykonanie tego za pomocą
wyrażenia lambda.
*/

public class Exercise5 {
    public static void main(String[] args){
        IntSequence constSequence = IntSequence.constant(1);

        for(int i = 0; i < 5; i++)
            System.out.println(constSequence.next());
    }
}
