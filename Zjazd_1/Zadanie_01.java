import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie_01 {
public static void main(String[] args)
        throws IOException
{
    double a, b, pole;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Program obliczający pole prostokąta");
    System.out.println("Podaj bok a: ");
    a = Double.parseDouble(br.readLine());
    System.out.println("Podaj bok b: ");
    b = Double.parseDouble(br.readLine());

    pole = a*b; //Wzór na pole prostokąta

    System.out.print("Pole prostokąta o boku a = " + a + " i boku b = " + b);
    System.out.println(" wynosi: " + pole + "." );
}
}

