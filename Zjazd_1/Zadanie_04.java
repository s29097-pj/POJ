import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie_04 {
    public static void main(String[] args) throws IOException {
        int a, b, c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Wpisz wartość boku a: ");
        a = Integer.parseInt(br.readLine());
        System.out.println("Wpisz wartość boku b: ");
        b = Integer.parseInt(br.readLine());
        System.out.println("Wpisz wartość boku c: ");
        c = Integer.parseInt(br.readLine());

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("BŁĄD - Boki muszą być dodatnie.");
        }
        else if (a + b > c && a + c > b && b + c > a) //twierdzenie Pitagorasa
        {
            System.out.println("Boki:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("tworzą trójkąt prostokątny.");
        }
        else
        {
            System.out.println("Boki:");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
            System.out.println("NIE TWORZĄ trójkąta prostokątnego.");
        }
    }
}
