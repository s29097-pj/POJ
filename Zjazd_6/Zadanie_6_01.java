import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Zadanie_06_01 {
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

        // Tworzenie listy LinkedList i wypełnienie jej wartościami
        LinkedList<String> lista = new LinkedList<>();
        lista.add("czarny");
        lista.add("czerwony");
        lista.add("zielony");
        lista.add("żółty");
        lista.add("niebieski");
        lista.add("purpurowy");
        lista.add("turkusowy");

        System.out.print("\n\u001B[4m" + "Oryginalna lista: " + "\u001B[0m\n");
        for (String kolor : lista) {
            System.out.print(COLORS.get(kolor) + kolor + "\u001B[0m, ");
        }
        System.out.println();

        // Usuwanie pierwszego i ostatniego elementu
        String pierwszy = lista.removeFirst();
        String ostatni = lista.removeLast();

        System.out.println("\n\u001B[4m" + "Usunięte elementy:\n"  + "\u001B[0m"
                + COLORS.get(pierwszy) + pierwszy + "\u001B[0m, " + COLORS.get(ostatni) + ostatni + "\u001B[0m");
        System.out.print("\n\u001B[4m" + "Lista po usunięciu elementów:\n" + "\u001B[0m");
        for (String kolor : lista) {
            System.out.print(COLORS.get(kolor) + kolor + "\u001B[0m, ");
        }
        System.out.println();
    }
}
