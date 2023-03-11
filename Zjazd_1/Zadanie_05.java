
import java.util.Scanner;

public class Zadanie_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // pobieramy od użytkownika liczbę (numer miesiąca)
        System.out.print("Podaj numer miesiąca (1-12): ");
        int numerMiesiaca = input.nextInt();

        // sprawdzamy, czy numer miesiąca jest poprawny
        if (numerMiesiaca < 1 || numerMiesiaca > 12) {
            System.out.println("BŁĄD");
        } else {
            // określamy nazwę miesiąca i ilość dni za pomocą instrukcji switch
            String nazwaMiesiaca = "";
            int iloscDni = 0;
            switch (numerMiesiaca) {
                case 1:
                    nazwaMiesiaca = "Styczeń";
                    iloscDni = 31;
                    break;
                case 2:
                    nazwaMiesiaca = "Luty";
                    iloscDni = 28;
                    break;
                case 3:
                    nazwaMiesiaca = "Marzec";
                    iloscDni = 31;
                    break;
                case 4:
                    nazwaMiesiaca = "Kwiecień";
                    iloscDni = 30;
                    break;
                case 5:
                    nazwaMiesiaca = "Maj";
                    iloscDni = 31;
                    break;
                case 6:
                    nazwaMiesiaca = "Czerwiec";
                    iloscDni = 30;
                    break;
                case 7:
                    nazwaMiesiaca = "Lipiec";
                    iloscDni = 31;
                    break;
                case 8:
                    nazwaMiesiaca = "Sierpień";
                    iloscDni = 31;
                    break;
                case 9:
                    nazwaMiesiaca = "Wrzesień";
                    iloscDni = 30;
                    break;
                case 10:
                    nazwaMiesiaca = "Październik";
                    iloscDni = 31;
                    break;
                case 11:
                    nazwaMiesiaca = "Listopad";
                    iloscDni = 30;
                    break;
                case 12:
                    nazwaMiesiaca = "Grudzień";
                    iloscDni = 31;
                    break;
                default:
                    System.out.println("BŁĄD");
                    System.exit(0);
            }

            // wyświetlamy nazwę miesiąca i ilość dni
            System.out.println(nazwaMiesiaca + ": " + iloscDni + " dni");
        }
    }
}
