import java.util.Scanner;

public class Zadanie_2_07 {
    public static void main(String[] args) {
        // Stworzenie obiektu Scanner do pobierania danych od użytkownika
        Scanner input = new Scanner(System.in);

        // Pobranie danych od użytkownika
        System.out.print("Podaj promień podstawy walca: ");
        double promien = input.nextDouble();

        System.out.print("Podaj wysokość walca: ");
        double wysokosc = input.nextDouble();

        // Obliczenie objętości walca
        double objetosc = Math.PI * Math.pow(promien, 2) * wysokosc;

        // Wyświetlenie wyniku
        System.out.println("Objętość walca wynosi: " + objetosc);
    }
}
