import java.util.Scanner;

public class Zadanie_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj ilość elementów tablicy: ");
        int n = input.nextInt();

        int[] tab = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Podaj " + (i+1) + " element: ");
            tab[i] = input.nextInt();
        }

        int max = tab[0];
        for(int i = 1; i < n; i++) {
            if(max < tab[i]) {
                max = tab[i];
            }
        }

        System.out.println("Największym elementem tablicy jest: " + max);
    }
}
