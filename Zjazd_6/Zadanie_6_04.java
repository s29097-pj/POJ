import java.util.HashMap;
import java.util.Scanner;

class Zadanie_6_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("\n\u001B[4m" + "MIESIĄCE" + "\u001B[0m");

        // Tworzenie mapy miesięcy
        HashMap<Integer, String> miesiace = new HashMap<>();
        miesiace.put(1, "Styczeń");
        miesiace.put(2, "Luty");
        miesiace.put(3, "Marzec");
        miesiace.put(4, "Kwiecień");
        miesiace.put(5, "Maj");
        miesiace.put(6, "Czerwiec");
        miesiace.put(7, "Lipiec");
        miesiace.put(8, "Sierpień");
        miesiace.put(9, "Wrzesień");
        miesiace.put(10, "Październik");
        miesiace.put(11, "Listopad");
        miesiace.put(12, "Grudzień");

        String wybor = "tak";

        while (wybor.equalsIgnoreCase("tak")) {
            // Pobieranie od użytkownika liczby (numer miesiąca)
            System.out.print("\nWpisz numer od 1 do 12 (0 aby zakończyć): ");
            int numerMiesiaca = input.nextInt();

            if (numerMiesiaca == 0) {
                System.out.println("Koniec programu.");
                break;
            } else if (numerMiesiaca < 1 || numerMiesiaca > 12) {
                System.out.println("\nBŁĄD - podałeś niewłaściwą liczbę");
                continue;
            }

            // Określenie nazwy miesiąca i ilość dni za pomocą mapy
            String nazwaMiesiaca = miesiace.get(numerMiesiaca);
            int iloscDni;

            switch (numerMiesiaca) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    iloscDni = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    iloscDni = 30;
                    break;
                case 2:
                    iloscDni = 28;
                    break;
                default:
                    System.out.println("BŁĄD");
                    return;
            }

            // Numer Miesiąca
            System.out.println("\nWybrałeś liczbę " + numerMiesiaca + ".");

            // Wyświetlanie informacji
            System.out.println("Miesiącem, który ma numer " + numerMiesiaca
                    + " jest " + nazwaMiesiaca + " z ilością " + iloscDni + " dni w roku.");

            System.out.println("\nWszystkie miesiące: " + miesiace);

            System.out.print("\n\u001B[1m" + "Czy chcesz wpisać kolejny numer? " +
                    "\u001B[0m\n" + "Wpisz: tak lub nie: ");
            input.nextLine(); // Pobranie pozostałego znaku nowej linii po wczytaniu liczby
            wybor = input.nextLine();
        }
    }
}
