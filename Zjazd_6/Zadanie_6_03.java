import java.util.TreeSet;

class Zadanie_06_03 {
    public static void main(String[] args) {
        // Tworzenie TreeSet
        TreeSet<String> tree1 = new TreeSet<>();

        // a) Dodawanie pięciu nazw kolorów do tree1
        tree1.add("czarny");
        tree1.add("zielony");
        tree1.add("niebieski");
        tree1.add("czerwony");
        tree1.add("żółty");

        System.out.println("\u001B[1m" + "\u001B[4m" + "\nPosortowane drzewo binarne:" + "\u001B[0m\n");

        // a) Wypisanie zawartości tree1
        System.out.println("\u001B[1m" + "a) Drzewo zawierające pięć nazw kolorów:" + "\u001B[0m");
        System.out.println("tree1: " + tree1);

        // b) Iterowanie po wszystkich elementach drzewa i wypisanie ich
        System.out.println("\u001B[1m" + "\nb) Iterowanie po wszystkich elementach drzewa:" + "\u001B[0m");
        for (String color : tree1) {
            System.out.println(color);
        }

        // c) Tworzenie kolejnego drzewa binarnego tree2
        TreeSet<String> tree2 = new TreeSet<>();
        tree2.add("czarny");
        tree2.add("purpurowy");
        tree2.add("żółty");

        // c) Wypisanie zawartości tree2
        System.out.println("\u001B[1m" + "\nc) Dodawanie do istniejącego drzewa nowego drzewa binarnego:" + "\u001B[0m");
        System.out.println("tree1: " + tree1);

        // c) Dodawanie wszystkich elementów z tree2 do tree1
        System.out.println("tree2: " + tree2);
        tree1.addAll(tree2);

        // c) Wypisanie wyniku połączenia tree1 i tree2
        System.out.println("tree1 po zsumowaniu z tree2: " + tree1);

        // d) Wypisanie elementów tree1 w odwrotnej kolejności
        System.out.println("\u001B[1m" + "\nd) Wypisanie elementów drzewa w odwrotnej kolejności:" + "\u001B[0m");
        System.out.println("Oryginalne drzewo tree1: " + tree1);
        System.out.println("Odwrotna kolejność:");
        Object[] reverseArray = tree1.descendingSet().toArray();
        for (Object color : reverseArray) {
            System.out.println(color);
        }

        // e) Wypisanie pierwszego i ostatniego elementu w tree1
        System.out.println("\u001B[1m" + "\ne) Wypisanie pierwszego i ostatniego elementu przechowywanego w drzewie:" + "\u001B[0m");
        System.out.println("tree1: " + tree1);
        System.out.println("Pierwszy element drzewa: " + tree1.first());
        System.out.println("Ostatni element drzewa: " + tree1.last());

        // f) Sklonowanie tree1 do tree3
        TreeSet<String> tree3 = new TreeSet<>(tree1);

        // f) Wypisanie tree3
        System.out.println("\u001B[1m" + "\nf) Sklonowanie drzewa binarnego do innego drzewa binarnego i wypisanie nowego drzewa na ekran:" + "\u001B[0m");
        System.out.println("tree1: " + tree1);
        System.out.println("Nowe drzewo tree3: " + tree3);

        // g) Wypisanie liczby elementów w tree1
        System.out.println("\u001B[1m" + "\ng) Liczba elementów, przechowywanych w drzewie:" + "\u001B[0m");
        System.out.println("tree1: " + tree1);
        System.out.println("Rozmiar tree1: " + tree1.size());

        // h) Porównanie elementów w tree1 i tree2
        System.out.println("\u001B[1m" + "\nh) Porównanie elementów przechowywanych w dwóch drzewach binarnych" + "\u001B[0m");
        String[] colorsToCompare = {"czarny", "zielony", "niebieski", "purpurowy", "czerwony", "żółty"};
        for (String color : colorsToCompare) {
            System.out.println("- Czy element <<" + color + ">> znajduje się zarówno w drzewie tree1, jak i w tree2?");
            if (tree1.contains(color) && tree2.contains(color)) {
                System.out.println("Tak");
            } else {
                System.out.println("Nie");
            }
        }
    }
}
