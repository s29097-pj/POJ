import java.util.Scanner;

public class Zadanie_2_09 {
    public static void main(String[] args) {
        // wylosuj poprawną literę
        char poprawnaLitera = (char)('A' + (int)(Math.random() * 26));
        // utwórz obiekt Scanner do odczytu danych od użytkownika
        Scanner scanner = new Scanner(System.in);
        // wyświetl instrukcję gry
        System.out.println("Pomyślałem literę z przedziału od A do Z. Odgadnij ją i wpisz: ");

        // inicjalizuj licznik prób
        int licznikProb = 1;
        // pętla gry
        while (true) {
            // odczytaj wprowadzoną przez gracza literę jako String
            String podanaLiteraRaw = scanner.nextLine();
            // zamień wprowadzoną literę na wielkie litery i odczytaj pierwszy znak
            char podanaLitera = podanaLiteraRaw.toUpperCase().charAt(0);

            // sprawdź, czy podana litera jest poprawna
            if (podanaLitera == poprawnaLitera) {
                // jeśli tak, wyświetl komunikat o wygranej i przerwij pętlę
                System.out.println("Dobrze! Odgadłeś literę " + poprawnaLitera + " w " + licznikProb + " próbach.");
                break;
            } else {
                // jeśli nie, wyświetl komunikat o błędzie i podpowiedź
                System.out.println("Źle!");
                if (podanaLitera < poprawnaLitera) {
                    System.out.println("Liczba jest za niska.");
                } else {
                    System.out.println("Liczba jest za wysoka.");
                }
                // zwiększ licznik prób i wyświetl instrukcję gry
                System.out.println("Spróbuj jeszcze raz: ");
                licznikProb++;
            }
        }
    }
}
