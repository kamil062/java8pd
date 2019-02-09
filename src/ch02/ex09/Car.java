package ch02.ex09;

/**
 * Klasa modeluje samochód poruszający się wzdłuż osi x
 */
public class Car {
    private double position = 0.0;
    private double gasTankLevel = 0.0;
    private double fuelConsumption = 0.0;

    /**
     * Konstruktor
     * @param fuelConsumption Spalanie paliwa w litrach na 100km
     */
    public Car(double fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }

    /**
     * Uzupełnia poziom paliwa w baku samochodu
     * @param gasAmount Ilość paliwa w litrach
     */
    public void refuel(double gasAmount){
        this.gasTankLevel += gasAmount;
    }

    /**
     * Przejeżdża określoną ilość kilometrów zużywając paliwo
     * @param km Ilość kilometrów do przejechania
     * @return true jeśli udało się przejechać zadaną odległość, false jeśli w baku nie ma wystarczająco paliwa do
     * przejechania zadanej odległości
     */
    public boolean drive(double km){
        double gasUsed = km * (this.fuelConsumption / 100.0);

        if(gasUsed <= this.gasTankLevel){
            this.gasTankLevel -= gasUsed;
            this.position += km;

            return true;
        } else {
            return false;
        }
    }

    /**
     * Zwraca poziom paliwa w baku samochodu
     * @return Poziom paliwa w litrach
     */
    public double getGasTankLevel() {
        return gasTankLevel;
    }

    /**
     * Zwraca pozycję samochodu na osi
     * @return Pozycja samochodu na osi
     */
    public double getPosition() {
        return position;
    }
}
