package ch04.ex07;

/*
Zdefiniuj typ wyliczeniowy dla ośmiu kombinacji kolorów podstawowych: BLACK,
RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE z metodami: getRed, getGreen i getBlue.
*/

public class Exercise7 {
    public static void main(String[] args){
        for(Color color : Color.values())
            System.out.print(color + ", ");

        System.out.println();
        System.out.println();

        System.out.println(Color.getRed());
        System.out.println(Color.getGreen());
        System.out.println(Color.getBlue());
    }
}
