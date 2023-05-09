import java.util.ArrayList;
import java.util.Iterator;

public class Zadanie_5_03 {
    public static void main(String[] args) {
        // [a] Utwórz listę stringów
        ArrayList<String> listaKaw = new ArrayList<>();

        // [b] Dodaj 6 nazw kaw do listy i wypisz je na konsolę
        listaKaw.add("espresso");
        listaKaw.add("latte");
        listaKaw.add("cappuccino");
        listaKaw.add("mocha");
        listaKaw.add("auLait");
        listaKaw.add("macchiato");

        System.out.println("\n\u001B[4m" + "Lista kaw:" + "\u001B[0m");
        // [d] Użyj pętli foreach, aby przejść przez wszystkie elementy listy i wypisz je na konsolę
        for (String kawa : listaKaw) {
            System.out.println(kawa);
        }

        // [c] Użyj Iterator<String> do przejścia przez wszystkie elementy listy i wypisz je na konsolę
        System.out.println("\n\u001B[4m" + "Lista kaw używając Iteratora:" + "\u001B[0m");
        Iterator<String> iterator = listaKaw.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // [d] Użyj pętli foreach, aby przejść przez wszystkie elementy listy i wypisz je dużymi literami na konsolę
        System.out.println("\n\u001B[4m" + "Lista kaw w dużych literach:" + "\u001B[0m");
        for (String kawa : listaKaw) {
            System.out.println(kawa.toUpperCase());
        }

        // [e] Korzystając z pętli for, wypisz na konsolę po 4 pierwsze litery z każdego wyrazu przechowywanego w liście
        System.out.println("\n\u001B[4m" + "4 pierwsze litery każdej kawy:" + "\u001B[0m");
        for (String kawa : listaKaw) {
            // Iteruj przez każde słowo kawy
            for (int i = 0; i < 4; i++) {
                // Sprawdź, czy indeks jest mniejszy niż długość słowa
                if (i < kawa.length()) {
                    // Wypisz literę o danym indeksie w słowie
                    System.out.print(kawa.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
