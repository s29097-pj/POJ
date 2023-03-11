import java.util.HashMap;
import java.util.Scanner;

public class Zadanie_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> ruchObrotowyPlanety = new HashMap<>();
        ruchObrotowyPlanety.put("Merkury", 0.2408467);
        ruchObrotowyPlanety.put("Wenus", 0.61519726);
        ruchObrotowyPlanety.put("Mars", 1.8808158);
        ruchObrotowyPlanety.put("Jowisz", 11.862615);
        ruchObrotowyPlanety.put("Saturn", 29.447498);
        ruchObrotowyPlanety.put("Uran", 84.016846);
        ruchObrotowyPlanety.put("Neptun", 164.79132);

        System.out.print("Nazwa planety: ");
        String nazwaPlanety = scanner.nextLine();
        System.out.print("Liczba sekund: ");
        long seconds = scanner.nextLong();

        double ziemskiRokWSekundach = 31557600;
        double planetyRokWSekundach = ruchObrotowyPlanety.getOrDefault(nazwaPlanety, 1.0) * ziemskiRokWSekundach;
        double wiek = seconds / planetyRokWSekundach;

        System.out.printf("Wiek: %.2f", wiek);
    }
}
