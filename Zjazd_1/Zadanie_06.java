import java.util.Scanner;

public class Zadanie_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // pobierz trzy liczby rzeczywiste od użytkownika
        System.out.print("Podaj pierwszą liczbę rzeczywistą: ");
        double a = scanner.nextDouble();
        System.out.print("Podaj drugą liczbę rzeczywistą: ");
        double b = scanner.nextDouble();
        System.out.print("Podaj trzecią liczbę rzeczywistą: ");
        double c = scanner.nextDouble();

        // wyznacz kolejność liczb od najmniejszej do największej
        double min = Math.min(a, Math.min(b, c));
        double max = Math.max(a, Math.max(b, c));
        double mid = a + b + c - min - max;

        // wyświetl liczby w kolejności od najmniejszej do największej
        System.out.printf("%.6f %.6f %.6f\n", min, mid, max);

        // wyświetl liczby w kolejności od największej do najmniejszej
        System.out.printf("%.6f %.6f %.6f\n", max, mid, min);

        scanner.close();
    }
}
