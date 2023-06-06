### ZADANIA ZJAZD 6

## Zadanie 6.1

Napisz program w języku Java, który usunie pierwszy i ostatni element z listy LinkedList. 
Wypisz na konsolę:
- oryginalną listę;
- usunięte elementy;
- listę po usunięciu elementów.
Listę możesz wypełnić wybranymi przez siebie wartościami.

> output:
```
Oryginalna lista:
czarny, czerwony, zielony, żółty, niebieski, purpurowy, turkusowy,

Usunięte elementy:
czarny, turkusowy

Lista po usunięciu elementów:
czerwony, zielony, żółty, niebieski, purpurowy,
```

## Zadanie 6.2

Napisz program, w którym utworzysz zbiór `HashSet<String>`, wypełnisz go dowolnymi wartościami, wypiszesz na konsolę, a następnie przekonwertujesz na zwykłą tablicę i wypiszesz jej zawartość na konsolę.

> output
```
Oryginalny zbiór:
czerwony, zielony, purpurowy, turkusowy, czarny, niebieski, żółty,

Tablica:
czerwony, zielony, purpurowy, turkusowy, czarny, niebieski, żółty,
```

## Zadanie 6.3

Napisz program w Javie, w którym zaimplementujesz obiekt typu `TreeSet` – posortowane drzewo binarne `tree1`:
 - [a] dodaj do niego pięć nazw kolorów i wypisz na ekran;
 - [b] poiteruj po wszystkich elementach drzewa i wypisz je na ekran;
 - [c] utwórz kolejne drzewo binarne tree2, zawierające trzy nazwy kolorów,wypisz je na ekran a następnie dodaj wszystkie jego elementy do drzewa z początku zadania tree1; wynik operacji wypisz na ekran;
 - [d] wypisz na ekran w odwrotnej kolejności elementy z drzewa tree1;
 - [e] wypisz pierwszy i ostatni element przechowywany w drzewie tree1;
 - [f] sklonuj tree1 do innego drzewa binarnego – tree3;
 - [g] wypisz na ekran liczbę elementów, przechowywanych w drzewie;
 - [h] porównaj ze sobą elementy przechowywane w dwóch drzewach binarnych tree1 i tree2.

> output:
```
Posortowane drzewo binarne:

a) Drzewo zawierające pięć nazw kolorów:
tree1: [czarny, czerwony, niebieski, zielony, żółty]

b) Iterowanie po wszystkich elementach drzewa:
czarny
czerwony
niebieski
zielony
żółty

c) Dodawanie do istniejącego drzewa nowego drzewa binarnego:
tree1: [czarny, czerwony, niebieski, zielony, żółty]
tree2: [czarny, purpurowy, żółty]
tree1 po zsumowaniu z tree2: [czarny, czerwony, niebieski, purpurowy, zielony, żółty]

d) Wypisanie elementów drzewa w odwrotnej kolejności:
Oryginalne drzewo tree1: [czarny, czerwony, niebieski, purpurowy, zielony, żółty]
Odwrotna kolejność:
żółty
zielony
purpurowy
niebieski
czerwony
czarny

e) Wypisanie pierwszego i ostatniego elementu przechowywanego w drzewie:
tree1: [czarny, czerwony, niebieski, purpurowy, zielony, żółty]
Pierwszy element drzewa: czarny
Ostatni element drzewa: żółty

f) Sklonowanie drzewa binarnego do innego drzewa binarnego i wypisanie nowego drzewa na ekran:
tree1: [czarny, czerwony, niebieski, purpurowy, zielony, żółty]
Nowe drzewo tree3: [czarny, czerwony, niebieski, purpurowy, zielony, żółty]

g) Liczba elementów, przechowywanych w drzewie:
tree1: [czarny, czerwony, niebieski, purpurowy, zielony, żółty]
Rozmiar tree1: 6

h) Porównanie elementów przechowywanych w dwóch drzewach binarnych:
- Czy element <<czarny>> znajduje się zarówno w drzewie tree1, jak i w tree2?
Tak
- Czy element <<zielony>> znajduje się zarówno w drzewie tree1, jak i w tree2?
Nie
- Czy element <<niebieski>> znajduje się zarówno w drzewie tree1, jak i w tree2?
Nie
- Czy element <<purpurowy>> znajduje się zarówno w drzewie tree1, jak i w tree2?
Tak
- Czy element <<czerwony>> znajduje się zarówno w drzewie tree1, jak i w tree2?
Nie
- Czy element <<żółty>> znajduje się zarówno w drzewie tree1, jak i w tree2?
Tak
```

## Zadanie 6.4

Napisz program, który pobiera od użytkownika liczbę z zakresu od 1 do 12 i w odpowiedzi wypisuje informację, który z miesięcy w roku ma ten numer.
- W swoim rozwiązaniu skorzystaj z klasy `HashMap`.
- Pamiętaj, by zaprojektować program tak, by informował użytkownika, jeśli wskaże zły numer.

> output:
```
MIESIĄCE
Wpisz numer od 1 do 12 (0 aby zakończyć): 5

Wybrałeś liczbę 5.
Miesiącem, który ma numer 5 jest Maj z ilością 31 dni w roku.

Wszystkie miesiące: {1=Styczeń, 2=Luty, 3=Marzec, 4=Kwiecień, 5=Maj, 6=Czerwiec, 7=Lipiec, 8=Sierpień, 9=Wrzesień, 10=Październik, 11=Listopad, 12=Grudzień}

Czy chcesz wpisać kolejny numer?
Wpisz: tak lub nie: tak

Wpisz numer od 1 do 12 (0 aby zakończyć): 13

BŁĄD - podałeś niewłaściwą liczbę

Wpisz numer od 1 do 12 (0 aby zakończyć): 0
Koniec programu.
```
