import java.util.Scanner;

public class Zadanie_09 {

    public static boolean czyPalindrom(char[] slowo) {
        int i = 0, j = slowo.length - 1;
        while (i < j) {
            if (slowo[i] != slowo[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj slowo:");
        String slowo = odczyt.nextLine();
        char[] tabSlowo = slowo.toCharArray();
        if (czyPalindrom(tabSlowo)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }
}
