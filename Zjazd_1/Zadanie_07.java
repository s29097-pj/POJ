import java.util.Scanner;

public class Zadanie_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m;

        System.out.print("Podaj liczbę elementów pierwszej tablicy: ");
        n = input.nextInt();
        System.out.print("Podaj liczbę elementów drugiej tablicy: ");
        m = input.nextInt();

        if (n <= 0 || m <= 0) {
            System.out.println("BŁĄD");
            return;
        }

        int[] A = new int[n];
        int[] B = new int[m];

        System.out.println("Podaj elementy pierwszej tablicy:");
        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }

        System.out.println("Podaj elementy drugiej tablicy:");
        for (int i = 0; i < m; i++) {
            B[i] = input.nextInt();
        }

        int iloczyn = 0;
        int min = Math.min(n, m);
        for (int i = 0; i < min; i++) {
            iloczyn += A[i] * B[i];
        }

        System.out.println("Iloczyn skalarny tych tablic to: " + iloczyn);
    }
}
