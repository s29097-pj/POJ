import java.util.Scanner;

public class Zadanie_10 {

    public static void main(String[] args) {
        // Pobieranie wymiarów macierzy od użytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę wierszy: ");
        int a = scanner.nextInt();
        System.out.print("Podaj liczbę kolumn: ");
        int b = scanner.nextInt();

        // Sprawdzenie poprawności wymiarów macierzy
        if (a <= 0 || b <= 0) {
            System.out.println("BŁĄD");
            return;
        }

        // Tworzenie macierzy o podanych wymiarach
        int[][] matrix = new int[a][b];

        // Wypełnianie macierzy danymi wejściowymi
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("Podaj element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Wyświetlenie macierzy przed transpozycją
        System.out.println("Macierz przed transpozycją:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Wywołanie funkcji transponującej macierz
        int[][] transposedMatrix = transposeMatrix(matrix);

        // Wyświetlenie macierzy po transpozycji
        System.out.println("Macierz po transpozycji:");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int a = matrix.length;
        int b = matrix[0].length;

        // Tworzenie macierzy transponowanej
        int[][] transposedMatrix = new int[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        return transposedMatrix;
    }
}
