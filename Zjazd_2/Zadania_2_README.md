### ZADANIA ZJAZD 2

## Zadanie 2.1

Napisz program, który wyświetli na konsoli w osobnych liniach Twoje imię, nazwisko, grupę i kierunek studiów.

## Zadanie 2.2

Napisz program, który wyświetli na konsoli w osobnych liniach imię, nazwisko, grupę i kierunek studiów dowolnego studenta,
którego dane zostaną pobrane od użytkownika.

## Zadanie 2.3

Napisz program w Javie, wyświetlający domyślną wartość typów prostych danych w Javie.

>Primitive types in Java:
>short s = 0
>int i = 0
>long l = 0
>float f = 0.0
>double d = 0.0
>char c = ?
>String str = null
>boolean b = false

## Zadanie 2.4

Napisz program, który porówna dwa stringi.

>str1:napis
>str2:napis

>str1 = str2: true

>str1.equals(str2): true

## Zadanie 2.5

Napisz program, wypisujący przykłady operatorów:
a) inkrementacji i dekrementacji;
b) arytmetycznych;
c) relacyjnych.

Przykładowy output:
>x = 5
>y = 10
>++x = 6
>y++ = 10
>x = 6
>y = 11
>
>w = 33.5
>z = 17.3
>w + z = 50.8
>w - z = 16.2
>w * z = 579.55
>w / z = 1.9364163
>w % z = 16.2
>
>m = 3
>n = 17
>o = 10
>m < n = true
>m > o = false
>n ≤ o = false
>m ≥ n = false
>n == o = false
>m ≠ = true

## Zadanie 2.6

Napisz program, który utworzy tablicę 3x3, wypełni ją wartościami (losowymi), wypisze na ekran, a następnie zamieni w niej wiersze miejscami i znowu wypisze.

## Zadanie 2.7

Napisz program, który oblicza pojemność walca w oparciu o jego wysokość i promień podstawy.

>Wzór na objętość walca: V = Pi*r2*h

## Zadanie 2.8

Napisz program, który wyświetla "tabelę prawdy: true false dla P Q AND OR XOR NOT" dla operatorów logicznych Javy.
Uwaga! Zadbaj o odpowiednie wyrównanie kolumn tabeli.

## Zadanie 2.9

Napisz prostą grę, która:
- będzie prosić o wciśnięcie klawisza z zakresu od A do Z;
- jeśli gracz wciśnie właściwy klawisz, program wyświetli komunikat: "Dobrze!";
- jeśli gracz wciśnie niewłaściwy klawisz, program wypisze komunikat: "Źle!" i program wyświetli podpowiedź;
- ze względu na konieczność użycie wywołania System.in.read(),
Program musi zawierać klauzulę throws java.io.IOException (przez wzgląd na obsługę błędów w Javie).

## Zadanie 2.10

Napisz program, wypisujący potęgi od 0 do 14 liczby 2.

## Zadanie 2.11

Zaimplementuj program, wykorzystujący klasę Vehicle, która ma przechowywać informacje o:
- liczbie pasażerów passengers,
- pojemności zbiornika paliwa (w litrach) fuelcap,
- zużycia paliwa w litrach na 100 km/h.
W klasie VehicleProg należy utworzyć dwa obiekty typu Vehicle:
miniVan i sportsCar (wartośći dla liczby pasażerów, pojemności zbiornika i zużycia paliwa dla obydwu aut można sobie wymyślić).
Program powinien obliczać zasięg pojazdów przy pełnym zbiorniku i na konsoli wyświetlać to, co zawiera przykładowy Output.

## Zadanie 2.12

Dodaj gettery i settery w klasie Vehicle z zadania 2.11 oraz wprowadź metodę range().
Metoda ma obliczać zasięg pojazdu przy pełnym zbiorniku paliwa i wypisywać wynik na ekran.
Dokonaj niezbędnej refaktoryzacji klasy VehicleProg.

## Zadanie 2.13

Przekształć metodę range() z poprzedniego zadania tak, by zwracała wartość.
Output: "Minivan przewozi 7 osób na odległość do 714 kilometrów, Auto sportowe przewozi 2 osób na odległość do 440 kilometrów"

## Zadanie 2.15

Do programu z zadania 2.13 dodaj sparametryzowaną metodę, która obliczy, ile paliwa do przejechania potrzebuje miniVan i sportsCar.
Odpowiedź powinna zostać wypisana na ekran.
>Output: "Minivan potrzebuje 22.932 litrów paliwa. Auto sportowe potrzebuje 31.5 litrów paliwa." 
