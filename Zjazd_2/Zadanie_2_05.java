public class Zadanie_2_05 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int result;

        // Operator inkrementacji i dekrementacji
        System.out.println("Przykład operatora inkrementacji i dekrementacji:");
        System.out.println("a = " + a); // wyświetli 5
        System.out.println("b = " + b); // wyświetli 3
        a++; // inkrementacja
        System.out.println("a++ = " + a); // wyświetli 6
        a--; // dekrementacja
        System.out.println("a-- = " + a); // wyświetli 5

        // Operatory arytmetyczne
        System.out.println("\nPrzykład operatorów arytmetycznych:");
        result = a + b; // dodawanie
        System.out.println("a + b = " + result); // wyświetli 8
        result = a - b; // odejmowanie
        System.out.println("a - b = " + result); // wyświetli 2
        result = a * b; // mnożenie
        System.out.println("a * b = " + result); // wyświetli 15
        result = a / b; // dzielenie całkowitoliczbowe
        System.out.println("a / b = " + result); // wyświetli 1
        double c = 5.0;
        double d = 3.0;
        double result2 = c / d; // dzielenie zmiennoprzecinkowe
        System.out.println("c / d = " + result2); // wyświetli 1.6666666666666667
        result = a % b; // reszta z dzielenia
        System.out.println("a % b = " + result); // wyświetli 2

        // Operatory relacyjne
        System.out.println("\nPrzykład operatorów relacyjnych:");
        System.out.println("a > b = " + (a > b)); // wyświetli true
        System.out.println("a < b = " + (a < b)); // wyświetli false
        System.out.println("a >= b = " + (a >= b)); // wyświetli true
        System.out.println("a <= b = " + (a <= b)); // wyświetli false
        System.out.println("a == b = " + (a == b)); // wyświetli false
        System.out.println("a != b = " + (a != b)); // wyświetli true
    }
}

