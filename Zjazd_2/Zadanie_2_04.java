import java.util.Scanner;

public class Zadanie_2_04 {
    public static void main(String[] args) {
        // utworzenie obiektu klasy Scanner do pobierania danych od użytkownika
        Scanner scanner = new Scanner(System.in);

        // pobranie dwóch stringów od użytkownika
        System.out.print("Wprowadź pierwszy napis: ");
        String str1 = scanner.nextLine();

        System.out.print("Wprowadź drugi napis: ");
        String str2 = scanner.nextLine();

        // porównanie dwóch stringów za pomocą metody equals()
        boolean areEqual = str1.equals(str2);

        // wyświetlenie wyniku porównania na ekranie
        System.out.println("\nstr1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("\nstr1 = str2: " + areEqual);
        System.out.println("str1.equals(str2): " + areEqual);

        // zamknięcie obiektu klasy Scanner
        scanner.close();
    }
}