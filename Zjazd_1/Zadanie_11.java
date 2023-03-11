
import java.util.Scanner;

public class Zadanie_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String text = scanner.nextLine();
        scanner.close();
        text = text.toLowerCase(); // zamiana wszystkich liter na małe litery
        boolean[] alphabet = new boolean[26]; // tabela boolowska o rozmiarze 26 (liczba liter w alfabecie)
        int index;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') { // tylko litery alfabetu są brane pod uwagę
                index = c - 'a'; // indeks litery w tabeli
                alphabet[index] = true;
            }
        }
        for (boolean b : alphabet) { // sprawdzenie, czy wszystkie litery alfabetu występują w tekście
            if (!b) {
                System.out.println("Podany tekst nie jest pangramem.");
                return;
            }
        }
        System.out.println("Podany tekst jest pangramem.");
    }
}
