// Interfejs Purchase definiuje metodę getPurchaseInfo() zwracającej informacje o zakupie
interface Purchase {
    String getPurchaseInfo();
}

// Klasa Car jest podstawową klasą dla pojazdów i definiuje ich atrybuty i metodę getSalePrice()
class Car {
    int speed; // Prędkość samochodu
    double regularPrice; // Cena regularna samochodu
    String color; // Kolor samochodu

    public Car(int speed, double regularPrice, String color) { // Konstruktor klasy Car
        this.speed = speed; // Przypisanie prędkości
        this.regularPrice = regularPrice; // Przypisanie ceny regularnej
        this.color = color; // Przypisanie koloru
    }

    public double getSalePrice() { // Metoda zwracająca cenę sprzedaży samochodu
        return regularPrice; // Zwrócenie ceny regularnej
    }
}

class Sedan extends Car implements Purchase { //Klasa Sedan dziedziczy po klasie Car i implementuje interfejs Purchase
    int length; // Długość samochodu

    public Sedan(int speed, double regularPrice, String color, int length) { // Konstruktor klasy Sedan
        super(speed, regularPrice, color); // Wywołanie konstruktora klasy Car za pomocą super()
        this.length = length; // Przypisanie długości
    }

    public double getSalePrice() { // Nadpisanie metody getSalePrice z klasy Car
        double salePrice; // Cena sprzedaży
        if (length > 20) { // Jeśli długość jest większa niż 20
            salePrice = super.getSalePrice() * 0.95; // Zniżka 5%
        } else { // W przeciwnym wypadku
            salePrice = super.getSalePrice() * 0.90; // Zniżka 10%
        }
        return salePrice; // Zwrócenie ceny sprzedaży
    }

    public String getPurchaseInfo() { // Implementacja metody z interfejsu Purchase
        return "\nSEDAN: \n" + // Zwrócenie informacji o zakupie
                "- speed = " + speed + " km/h" + ";\n" +
                "- regularPrice = " + String.format("%.2f", regularPrice) + " PLN" + ";\n" +
                "- color = " + color + ";\n" +
                "- length = " + length + " m" + ";\n" ;
    }
}

class Ford extends Car implements Purchase { // Klasa Ford dziedziczy po klasie Car i implementuje interfejs Purchase
    int year; // Rok produkcji samochodu
    int manufacturerDiscount; // Zniżka producenta

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) { // Konstruktor klasy Ford
        super(speed, regularPrice, color); // Wywołanie konstruktora klasy nadrzędnej Car
        this.year = year; // Przypisanie roku produkcji
        this.manufacturerDiscount = manufacturerDiscount; // Przypisanie zniżki producenta
    }

    public double getSalePrice() { // Nadpisanie metody getSalePrice z klasy Car
        return super.getSalePrice() - manufacturerDiscount; // Zwrócenie ceny sprzedaży po odjęciu zniżki producenta
    }

    public String getPurchaseInfo() { // Metoda z interfejsu Purchase zwracająca informacje o zakupie
        return "\nFORD: \n" +
                "- speed = " + speed + " km/h" + ";\n" +
                "- regularPrice = " + String.format("%.2f", regularPrice) + " PLN" + ";\n" +
                "- color = " + color + ";\n" +
                "- year = " + year + ";\n" +
                "- manufacturerDiscount = " + manufacturerDiscount + " %" + ";\n";
    }
}

class Truck extends Car implements Purchase { // klasa Car implementuje interfejs Purchase
    int weight; // waga samochodu

    public Truck(int speed, double regularPrice, String color, int weight) { // Konstruktor klasy Truck
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    // Metoda obliczająca cenę samochodu po uwzględnieniu zniżki
    public double getSalePrice() {
        double salePrice;
        if (weight > 2000) {
            salePrice = super.getSalePrice() * 0.90;
        } else {
            salePrice = super.getSalePrice();
        }
        return salePrice;
    }

    // Metoda z interfejsu Purchase zwracająca informacje o zakupie
    public String getPurchaseInfo() {
        return "\nTRUCK: \n" +
                "- speed = " + speed + " km/h" + ";\n" +
                "- regularPrice = " + String.format("%.2f", regularPrice) + " PLN" + ";\n" +
                "- color = " + color + ";\n" +
                "- weight = " + weight + " kg" + ";\n";
    }
}

// Przykładowe użycie klas Car, Ford i Truck
class AutoShop {
    public static void main(String[] args) {

        // Tworzenie instancji obiektów dla każdej z klas
        Sedan sedan = new Sedan(160, 20000, "Red", 10);
        Ford ford1 = new Ford(156, 4452, "Blue", 2005, 10);
        Ford ford2 = new Ford(155, 5000, "Yellow", 1998, 5);
        Truck truck = new Truck(200, 500000, "Green", 5000);

        // Wyświetlanie informacji o każdym z obiektów, wraz z obliczeniem ceny sprzedaży
        // Metoda String.format() służy do sformatowania wartości salePrice do dwóch miejsc po przecinku
        // podkreślenie (\u001B[4m)
        System.out.println("\u001B[31m" + sedan.getPurchaseInfo() +
                "\n\u001B[4m- sale price = " + String.format("%.2f", sedan.getSalePrice()) + " PLN" + "\u001B[0m");
        System.out.println("\u001B[34m" + ford1.getPurchaseInfo() +
                "\n\u001B[4m- sale price = " + String.format("%.2f", ford1.getSalePrice()) + " PLN" + "\u001B[0m");
        System.out.println("\u001B[33m" + ford2.getPurchaseInfo() +
                "\n\u001B[4m- sale price = " + String.format("%.2f", ford2.getSalePrice()) + " PLN" + "\u001B[0m");
        System.out.println("\u001B[32m" + truck.getPurchaseInfo() +
                "\n\u001B[4m- sale price = " + String.format("%.2f", truck.getSalePrice()) + " PLN" + "\u001B[0m");
    }
}
