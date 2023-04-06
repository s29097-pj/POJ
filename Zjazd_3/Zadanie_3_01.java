// Importowanie klas
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// deklaracja klasy Circle
class Circle {
    // prywatne pole typu double przechowujące promień koła
    private double radius;
    // prywatne pole typu String przechowujące kolor koła
    private final String color;

    // Mapowanie koloru na kod ASCII
    private static final Map<String, String> COLORS = new HashMap<>();

    // Static initializer - inicjalizacja stałych kolorów
    static {
        COLORS.put("czarny", "\u001B[30m");
        COLORS.put("czerwony", "\u001B[31m");
        COLORS.put("zielony", "\u001B[32m");
        COLORS.put("żółty", "\u001B[33m");
        COLORS.put("niebieski", "\u001B[34m");
        COLORS.put("purpurowy", "\u001B[35m");
        COLORS.put("turkusowy", "\u001B[36m");
        COLORS.put("biały", "\u001B[37m");
    }

    // Konstruktor klasy Circle - ustawienie promienia i koloru koła
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Metoda ustawiająca promień koła
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Metoda zwracająca promień koła
    public double getRadius() {
        return radius;
    }

    // Metoda zwracająca pole powierzchni koła
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Metoda zwracająca kolor koła
    public String getColor() {
        return COLORS.getOrDefault(color.toLowerCase(), "\u001B[31m");
    }

    // Metoda main - wywołuje pobieranie danych o kołach od użytkownika i wyświetla informacje o kołach
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Tworzenie tablicy obiektów klasy Circle
        // Pętla wykona się 4 razy, pobierając wartości dla każdego koła osobno
        Circle[] circles = new Circle[4];
        for (int i = 0; i < circles.length; i++) {
            double radius = 0;
            String color = "";
            boolean isValid = false;

            // Pobieranie wartości odbywa się w dwóch pętlach while:
            // - w pierwszej pobierany jest promień koła i sprawdzane, czy podana wartość jest liczbą rzeczywistą
            while (!isValid) {
                System.out.print("\nPodaj promień koła nr " + (i + 1) + ": ");
                if (input.hasNextDouble()) {
                    radius = input.nextDouble();
                    isValid = true;
                } else {
                    System.out.println("Nieprawidłowe dane! Podaj liczbę rzeczywistą.");
                    input.next();
                }
            }
            isValid = false;

            // - w drugiej pobierany jest kolor koła i sprawdzane, czy jest on poprawnie zdefiniowany w mapie COLORS
            while (!isValid) {
                System.out.print("Podaj kolor koła nr " + (i + 1) + ": ");
                color = input.next().toLowerCase();
                if (COLORS.containsKey(color)) {
                    isValid = true;
                }
                // Jeśli wartości są nieprawidłowe, pętla while pobiera wartość ponownie.
                else {
                    System.out.println("Nieprawidłowy kolor! " +
                            "Podaj kolor z listy: czarny, czerwony, zielony, żółty, niebieski, purpurowy, turkusowy, biały\n");
                }
            }
            // Po pobraniu poprawnych wartości tworzony jest nowy obiekt klasy Circle z tymi wartościami
            // i przypisywany do odpowiedniego elementu tablicy.
            circles[i] = new Circle(radius, color);
        }

        // Ustawienie promienia koła
        circles[0].setRadius(1.0);
        circles[1].setRadius(2.0);
        circles[2].setRadius(4.0);

        // Wyświetlenie informacji o kołach
        for (int i = 0; i < circles.length; i++) {
            Circle circle = circles[i];
            String colorName = circle.color;
            String colorCode = circle.getColor();

            // wyświetlanie na ekranie wartości kół
            // podkreślenie (\u001B[4m)
            System.out.println(colorCode + "\n\u001B[4mKoło nr " + (i + 1) + " przyjmuje wartości: " + Circle.ConsoleColors.RESET);
            System.out.println(colorCode + "Promień: " + circle.getRadius() + Circle.ConsoleColors.RESET);
            System.out.println(colorCode + "Powierzchnia: " + circle.getArea() + Circle.ConsoleColors.RESET);
            System.out.print(colorCode + "Kolor: " + Circle.ConsoleColors.RESET);
            System.out.print(colorCode + colorName + "\n" + Circle.ConsoleColors.RESET);

        }
    }

    // Klasa zagnieżdżona ConsoleColors zawiera stałe kody ANSI dla kolorów
    private static class ConsoleColors {
        public static final String RESET = "\u001B[0m";
    }
}
