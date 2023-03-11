import java.util.Scanner;

public class Zadanie_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        while (true) {
            try {
                System.out.print("Podaj liczbę naturalną większą od zera: ");
                n = input.nextInt();
                if (n <= 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Niepoprawne dane.");
                input.nextLine(); // czyści bufor wejścia
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
