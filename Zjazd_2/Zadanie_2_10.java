public class Zadanie_2_10 {
    public static void main(String[] args) {
        int podstawa = 2; // podstawa potęgi
        int wykladnik = 0; // wykładnik potęgi

        // pętla while, która wypisuje kolejne potęgi
        while (wykladnik <= 14) {

            // metoda Math.pow() przyjmuje dwie wartości - podstawę potęgi i jej wykładnik - i zwraca wynik potęgowania.
            //System.out.println(podstawa + "^" + wykladnik + " = " + Math.pow(podstawa, wykladnik));

            // metoda Math.round() zaokrągla liczbę do najbliższej liczby całkowitej
            System.out.println(podstawa + "^" + wykladnik + " = " + Math.round(Math.pow(podstawa, wykladnik)));

            // zwiększenie wykładnika o 1
            wykladnik++;
        }
    }
}
