// deklaracja klasy Circle
class Circle {
    // prywatne pola klasy Circle
    private double radius; // promień koła
    private String color; // kolor koła

    // konstruktor bezparametrowy klasy Circle
    public Circle() {
        radius = 1.0; // domyślna wartość promienia
        color = "blue"; // domyślny kolor
    }

    // konstruktor parametrowy klasy Circle
    public Circle(double radius) {
        this.radius = radius; // inicjalizacja promienia
        color = "blue"; // domyślny kolor
    }

    // metoda zwracająca promień koła
    public double getRadius() {
        return radius;
    }

    // metoda obliczająca i zwracająca pole powierzchni koła
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // metoda zwracająca informacje o kołach
    public String toString() {
        return "Circle: radius=" + radius + ", color=" + color;
    }
}

// deklaracja klasy Cylinder dziedziczącej po klasie Circle
class Cylinder extends Circle {
    // prywatne pole klasy Cylinder
    private double height; // wysokość walca

    // konstruktor bezparametrowy klasy Cylinder
    public Cylinder() {
        super(); // wywołanie konstruktora bezparametrowego klasy nadrzędnej Circle
        height = 4.0; // domyślna wartość wysokości
    }

    // konstruktor parametrowy klasy Cylinder
    public Cylinder(double radius) {
        super(radius); // wywołanie konstruktora parametrowego klasy nadrzędnej Circle
        height = 4.0; // domyślna wartość wysokości
    }

    // konstruktor parametrowy klasy Cylinder
    public Cylinder(double radius, double height) {
        super(radius); // wywołanie konstruktora parametrowego klasy nadrzędnej Circle
        this.height = height; // inicjalizacja wysokości
    }

    // metoda zwracająca wysokość walca
    public double getHeight() {
        return height;
    }

    // metoda obliczająca i zwracająca objętość walca
    public double getVolume() {
        return getArea() * height;
    }
}

// Klasa TestCircleAndCylinder służy do testowania metod i konstruktorów klasy Circle i Cylinder.
class TestCircleAndCylinder {

    // Metoda main służy do uruchomienia testów.
    public static void main(String[] args) {

        // Tworzenie nowego obiektu klasy Circle o promieniu 2.5 i domyślnym kolorze.
        Circle c1 = new Circle(2.5);
        // Wywołanie metody getRadius() i wyświetlenie wyniku.
        System.out.println("Circle radius: " + c1.getRadius());
        // Wywołanie metody getArea() i wyświetlenie wyniku.
        System.out.println("Circle area: " + c1.getArea());

        // Tworzenie nowego obiektu klasy Cylinder o promieniu 1.0, wysokości 1.0 i domyślnym kolorze.
        Cylinder cyl1 = new Cylinder();
        // Wywołanie metody getRadius() i wyświetlenie wyniku.
        System.out.println("Cylinder radius: " + cyl1.getRadius());
        // Wywołanie metody getHeight() i wyświetlenie wyniku.
        System.out.println("Cylinder height: " + cyl1.getHeight());
        // Wywołanie metody getVolume() i wyświetlenie wyniku.
        System.out.println("Cylinder volume: " + cyl1.getVolume());
        // Tworzenie nowego obiektu klasy Cylinder o promieniu 2.0, wysokości 3.0 i domyślnym kolorze.
        Cylinder cyl2 = new Cylinder(2.0, 3.0);
        // Wywołanie metody getRadius() i wyświetlenie wyniku.
        System.out.println("Cylinder radius: " + cyl2.getRadius());
        // Wywołanie metody getHeight() i wyświetlenie wyniku.
        System.out.println("Cylinder height: " + cyl2.getHeight());
        // Wywołanie metody getVolume() i wyświetlenie wyniku.
        System.out.println("Cylinder volume: " + cyl2.getVolume());
    }
}
