package ch02.ex09;

/*
Zaimplementuj klasę Car, która modeluje samochód poruszający się wzdłuż osi x
i zużywający w czasie jazdy benzynę. Dołącz metody pozwalające na przejechanie
podanej odległości w kilometrach, zatankowanie określonej ilości benzyny w litrach
oraz pobranie przejechanej odległości od początku podróży i poziomu benzyny.
Określ spalanie (w litrach na l00 km) w konstruktorze. Czy ta klasa powinna być
niemodyfikowalna? Dlaczego?
*/

import java.util.Random;

public class Exercise9 {
    private static final Random generator = new Random();

    public static void main(String[] args){
        Car car = new Car(7);
        car.refuel(100);

        boolean result;
        do {
            double distanceToDrive = generator.nextDouble() * 100;
            result = car.drive(distanceToDrive);

            if(result)
                System.out.printf("Przejechano %.2f kilometrów, pozostało %.2fl. paliwa\n", distanceToDrive, car.getGasTankLevel());
        } while(result);
    }
}
