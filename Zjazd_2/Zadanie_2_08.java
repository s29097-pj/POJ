public class Zadanie_2_08 {
    public static void main(String[] args) {

        // nagłówki tabeli
        System.out.printf("%-5s %-5s %-5s %-5s %-5s %-5s\n", "P", "Q", "AND", "OR", "XOR", "NOT");

        // rzędy tabeli
        boolean p = true;
        boolean q = true;
        System.out.printf("%-5s %-5s %-5s %-5s %-5s %-5s\n", p, q, p && q, p || q, p ^ q, !p);

        p = true;
        q = false;
        System.out.printf("%-5s %-5s %-5s %-5s %-5s %-5s\n", p, q, p && q, p || q, p ^ q, !p);

        p = false;
        q = true;
        System.out.printf("%-5s %-5s %-5s %-5s %-5s %-5s\n", p, q, p && q, p || q, p ^ q, !p);

        p = false;
        q = false;
        System.out.printf("%-5s %-5s %-5s %-5s %-5s %-5s\n", p, q, p && q, p || q, p ^ q, !p);
    }
}
