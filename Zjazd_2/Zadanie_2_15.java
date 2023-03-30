// Klasa reprezentująca pojazd
class Vehicle4 {
    private int passengers; // liczba pasażerów
    private int fuelcap; // pojemność zbiornika paliwa (w litrach)
    private double lkm; // zużycie paliwa w litrach na 100 km/h

    // Konstruktor
    public Vehicle4(int p, int f, double l) {
        passengers = p;
        fuelcap = f;
        lkm = l;
    }

    // Getter i Setter dla passengers
    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int p) {
        passengers = p;
    }

    // Getter i Setter dla fuelcap
    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int f) {
        fuelcap = f;
    }

    // Getter i Setter dla lkm
    public double getLkm() {
        return lkm;
    }

    public void setLkm(double l) {
        lkm = l;
    }

    // Metoda range()
    public double range() {
        return fuelcap / lkm * 100;
    }

    // Metoda obliczająca zużycie paliwa na przejechanie całej trasy
    public double fuelNeeded(double distance) {
        return (distance / 100) * lkm;
    }
}

class VehicleProg4 {
    public static void main(String[] args) {
        // Tworzenie obiektów typu Vehicle4
        Vehicle4 miniVan = new Vehicle4(7, 70, 9.5);
        Vehicle4 sportsCar = new Vehicle4(2, 50, 15.0);

        // Wywoływanie metod obiektów i wyświetlanie wyników na ekranie
        System.out.println("MiniVan:");
        System.out.println("Liczba pasażerów: " + miniVan.getPassengers());
        System.out.println("Pojemność zbiornika paliwa: " + miniVan.getFuelcap() + " litrów");
        System.out.println("Zużycie paliwa na 100 km: " + miniVan.getLkm() + " l/km");
        System.out.println("Zasięg przy pełnym zbiorniku: " + miniVan.range() + " km");
        System.out.println("Paliwo potrzebne do przejechania całej trasy: " + miniVan.fuelNeeded(2400) + " litrów\n");

        System.out.println("Sports Car:");
        System.out.println("Liczba pasażerów: " + sportsCar.getPassengers());
        System.out.println("Pojemność zbiornika paliwa: " + sportsCar.getFuelcap() + " litrów");
        System.out.println("Zużycie paliwa na 100 km: " + sportsCar.getLkm() + " l/km");
        System.out.println("Zasięg przy pełnym zbiorniku: " + sportsCar.range() + " km");
        System.out.println("Paliwo potrzebne do przejechania całej trasy: " + sportsCar.fuelNeeded(1500) + " litrów");
    }
}
