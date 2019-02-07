package ch01.ex16;

/*
Popraw metodę average w taki sposób, by przy jej wywoływaniu konieczne było
podanie przynajmniej jednego parametru.
*/

public class Exercise16 {
    public static double average(double first, double... rest) {
        double sum = first;
        for (double v : rest) sum += v;
        return sum / (1 + rest.length);
    }

    public static void main(String[] args){
        System.out.println(average(1));
        System.out.println(average(1, 2, 3));
        System.out.println(average(1, 2));
    }
}
