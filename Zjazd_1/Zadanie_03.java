import java.util.Scanner;
public class Zadanie_03 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Program pobiera dwa ciągi tekstowe i zamienia je miejscem.\n ");

        System.out.println("Podaj wyraz 1: ");
        String napis1 = scanner.nextLine();

        System.out.println("Podaj wyraz 2: ");
        String napis2 = scanner.nextLine();

        System.out.println("Ciągi tekstowe w odwrotnej kolejności");
        System.out.println(napis2 + " " + napis1 );

    }
}