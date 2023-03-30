// Importujemy klasę Random z pakietu java.util, aby móc generować liczby losowe.
import java.util.Random;

public class Zadanie_2_06 {

    public static void main(String[] args) {

        // Tworzymy tablicę o wymiarach 3x3.
        int[][] tablica = new int[3][3];

        // Tworzymy obiekt klasy Random do generowania liczb losowych.
        Random random = new Random();

        // Wypełniamy tablicę wartościami losowymi z przedziału od 1 do 10.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablica[i][j] = random.nextInt(10) + 1;
            }
        }

        // Wyświetlamy tablicę na ekranie.
        System.out.println("Tablica przed zamianą:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }

        // Zamieniamy pierwszy wiersz z trzecim.
        int[] temp = tablica[0];
        tablica[0] = tablica[2];
        tablica[2] = temp;

        // Wyświetlamy zmienioną tablicę na ekranie.
        System.out.println("Tablica po zamianie:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
    }
}
