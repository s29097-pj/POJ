// Klasa reprezentująca pojazd
class Vehicle3 {
    private int passengers; // liczba pasażerów
    private int fuelcap; // pojemność zbiornika paliwa (w litrach)
    private double lkm; // zużycie paliwa w litrach na 100 km/h

    // Konstruktor
    public Vehicle3(int p, int f, double l) {
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
}

class VehicleProg3 {
    public static void main(String[] args) {
        // Tworzenie obiektów typu Vehicle2
        Vehicle3 miniVan = new Vehicle3(7, 70, 9.5);
        Vehicle3 sportsCar = new Vehicle3(2, 50, 15.0);

        // Wywoływanie metod obiektów i wyświetlanie wyników na ekranie
        System.out.println("Minivan przewozi " + miniVan.getPassengers() + " osób na odległość do " + (int)miniVan.range() + " kilometrów");
        System.out.println("Auto sportowe przewozi " + sportsCar.getPassengers() + " osób na odległość do " + (int)sportsCar.range() + " kilometrów");
    }
}
