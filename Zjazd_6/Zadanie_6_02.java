import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Zadanie_6_02 {
    public static void main(String[] args) {

        // Mapowanie nazwy koloru na kod ANSI
        final Map<String, String> COLORS = new HashMap<>();
        COLORS.put("czarny", "\u001B[30m");
        COLORS.put("czerwony", "\u001B[31m");
        COLORS.put("zielony", "\u001B[32m");
        COLORS.put("żółty", "\u001B[33m");
        COLORS.put("niebieski", "\u001B[34m");
        COLORS.put("purpurowy", "\u001B[35m");
        COLORS.put("turkusowy", "\u001B[36m");

        // Tworzenie zbioru HashSet i wypełnienie go wartościami
        HashSet<String> zbior = new HashSet<>();
        zbior.add("czarny");
        zbior.add("czerwony");
        zbior.add("zielony");
        zbior.add("żółty");
        zbior.add("niebieski");
        zbior.add("purpurowy");
        zbior.add("turkusowy");

        System.out.println("\u001B[4m" + "\nOryginalny zbiór:" + "\u001B[0m");
        for (String kolor : zbior) {
            System.out.print(COLORS.get(kolor) + kolor + "\u001B[0m, ");
        }
        System.out.println();

        // Konwersja na tablicę
        String[] tablica = zbior.toArray(new String[0]);

        System.out.println("\u001B[4m" + "\nTablica:" + "\u001B[0m");
        for (String kolor : tablica) {
            System.out.print(COLORS.get(kolor) + kolor + "\u001B[0m, ");
        }
        System.out.println();
    }
}
