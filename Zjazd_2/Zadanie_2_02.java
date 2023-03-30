import java.util.Scanner;

public class Zadanie_2_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // tworzenie obiektu Scanner do odczytu danych wprowadzonych przez użytkownika

        System.out.print("Podaj imię: ");
        String imie = scanner.nextLine(); // odczytanie imienia wprowadzonego przez użytkownika

        System.out.print("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine(); // odczytanie nazwiska wprowadzonego przez użytkownika

        System.out.print("Podaj grupę: ");
        String grupa = scanner.nextLine(); // odczytanie grupy wprowadzonej przez użytkownika

        System.out.print("Podaj kierunek: ");
        String kierunek = scanner.nextLine(); // odczytanie kierunku wprowadzonego przez użytkownika

        // wypisanie informacji o studencie na konsoli
        System.out.println("\nImię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Grupa: " + grupa);
        System.out.println("Kierunek: " + kierunek);
    }
}

