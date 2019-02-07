package ch01.ex12;

/*
W Java Development Kit jest plik src.zip zawierający kod źródłowy biblioteki Java.
Rozpakuj go i za pomocą swojego ulubionego narzędzia do przeszukiwania tekstu
odszukaj przykłady zastosowania nazwanych instrukcji break i continue. Wybierz
jeden fragment z takim kodem i przepisz go bez wykorzystania takiej instrukcji.
*/

public class Exercise12 {
    /*void removeLessSpecifics() {
        if (!hasDefaults())
            return;

        for (int i = 0; i < length; i++) {
            Method m = get(i);
            if  (m == null || !m.isDefault())
                continue;

            for (int j  = 0; j < length; j++) {
                if (i == j)
                    continue;

                Method candidate = get(j);
                if (candidate == null)
                    continue;

                if (!matchesNameAndDescriptor(m, candidate))
                    continue;

                if (hasMoreSpecificClass(m, candidate))
                    remove(j);
            }
        }
    }*/
}
