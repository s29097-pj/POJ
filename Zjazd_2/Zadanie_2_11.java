// Klasa reprezentująca pojazd
class Vehicle1 {
    int passengers; // Liczba pasażerów
    int fuelcap;    // Pojemność zbiornika paliwa w litrach
    int lkm;        // Zużycie paliwa w litrach na 100 km/h

    // Metoda obliczająca zasięg pojazdu
    double range() {
        return fuelcap * 100 / lkm;
    }
}

// Klasa testująca
class VehicleProg1 {
    public static void main(String[] args) {
        // Tworzenie obiektu typu Vehicle dla minivana
        Vehicle1 miniVan = new Vehicle1();
        miniVan.passengers = 7;     // Ustawienie liczby pasażerów
        miniVan.fuelcap = 60;       // Ustawienie pojemności zbiornika paliwa
        miniVan.lkm = 10;           // Ustawienie zużycia paliwa na 100 km/h

        // Tworzenie obiektu typu Vehicle dla samochodu sportowego
        Vehicle1 sportsCar = new Vehicle1();
        sportsCar.passengers = 2;   // Ustawienie liczby pasażerów
        sportsCar.fuelcap = 40;     // Ustawienie pojemności zbiornika paliwa
        sportsCar.lkm = 15;         // Ustawienie zużycia paliwa na 100 km/h

        // Wypisanie informacji o minivanie
        System.out.println("Dla minivana:");
        System.out.println("- liczba pasażerów: " + miniVan.passengers);       // Wypisanie liczby pasażerów
        System.out.println("- pojemność zbiornika paliwa: " + miniVan.fuelcap + " litrów");    // Wypisanie pojemności zbiornika paliwa
        System.out.println("- zużycie paliwa na 100 km: " + miniVan.lkm + " l/km");    // Wypisanie zużycia paliwa na 100 km/h
        System.out.println("- zasięg: " + miniVan.range() + " km\n");      // Wypisanie zasięgu pojazdu i znaku nowej linii (\n) dla lepszej czytelności

        // Wypisanie informacji o samochodzie sportowym
        System.out.println("Dla samochodu sportowego:");
        System.out.println("- liczba pasażerów: " + sportsCar.passengers);     // Wypisanie liczby pasażerów
        System.out.println("- pojemność zbiornika paliwa: " + sportsCar.fuelcap + " litrów");  // Wypisanie pojemności zbiornika paliwa
        System.out.println("- zużycie paliwa na 100 km: " + sportsCar.lkm + " l/km");  // Wypisanie zużycia paliwa na 100 km/h
        System.out.println("- zasięg: " + sportsCar.range() + " km");      // Wypisanie zasięgu pojazdu
    }
}
