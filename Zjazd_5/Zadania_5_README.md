### ZADANIA ZJAZD 5

## Zadanie 5.1

Utwórz prosty program, w którym utworzysz obiekt typu `ArrayList`, przechowujący liczby całkowite, który wypełniony jest 50 pierwszymi liczbami parzystymi w najbardziej efektywny sposób.

Wypisz na konsolę liczbę oraz numer indeksu, pod którym dana liczba się znajduje oraz oblicz i wypisz czas całej operacji.

> output:
```
Liczba 2 znajduje się pod indeksem 0
...
Liczba 100 znajduje się pod indeksem 49

Czas całej operacji: 30 ms
```

## Zadanie 5.2

Na diagramie przedstawiono interfejs `Movable` i klasę `MovablePoint`. Zaimplementuj je zgodnie z diagramem. Następnie zaimplementuj klasę `TestMovable`, w której przetestujesz zaimplementowane konstruktory i metody.


|<<interface>>         |
|**Movable**           |
|----------------------|
|+moveUp():void        |
|+moveDown():void      |
|+moveLeft():void      |
|+moveRight():void     |


&#x2191;

*implements*

|**MovablePoint**          |
|--------------------------|
|-x:int                    |
|-y:int                    |
|--------------------------|
|+MovablePoint(x:int,y:int)|
|+toString():String        |
|+moveUp():void            |
|+moveDown():void          |
|+moveLeft():void          |
|+moveRight():void         |

> output:
```
MovablePoint at (0, 0)
MovablePoint at (1, -1)
```

## Zadanie 5.3

Napisz program Coffee, w którym:
- [a] utworzysz listę stringów;
- [b] do listy dodasz 6 nazw kaw: espresso, latte, cappuccino, mocha, auLait, macchiato i wypiszesz je na konsolę;
- [c] użyjesz `Iterator<String>` do przejścia przez wszystkie elementy listy i wypiszesz je na konsolę;
- [d] użyjesz pętli `foreach`, aby przejść przez wszystkie elementy listy i wypiszesz je dużymi literami na konsolę;
- [e] korzystając z pętli `for`, wypisz na konsolę po 4 pierwsze litery z każdego wyrazu, przechowywanego zaimplementowanej liście.

> output:
```
Lista kaw:
espresso
latte
cappuccino
mocha
auLait
macchiato

Lista kaw używając Iteratora:
espresso
latte
cappuccino
mocha
auLait
macchiato

Lista kaw w dużych literach:
ESPRESSO
LATTE
CAPPUCCINO
MOCHA
AULAIT
MACCHIATO

4 pierwsze litery każdej kawy:
espr
latt
capp
moch
auLa
macc
```

## Zadanie 5.4

Stwórz program dla książek, który będzie zawierał:
- Klasę `Ksiazka` (pola `String tytul`, `String autor`, `int liczbaStron`);
- Klasy `Ebook` (pola `int rozmiar`, `String format`) i `KsiazkaPapierowa` (pole `int rokWydania`) dziedziczące po klasie Ksiazka;
- Klasę testową, w niej użyte wyrażenie `lambda` do sortowania listy książek po tytule oraz wypisanie posortowanej listy na ekranie.
- Uwaga! Pamiętaj o zaimplementowaniu konstruktorów oraz getterów i setterów.


> mój przykładowy output:
```
Lista książek posortowana po tytule:
Czy androidy marzą o elektrycznych owcach - Philip K. Dick
Mistrz i Małgorzata - Michaił Bułhakow

Lista ebooków posortowana po tytule:
Mały Książę - Antoine de Saint-Exupéry
Podróże Guliwera - Jonathan Swift

Lista książek papierowych posortowana po tytule:
Solaris - Stanisław Lem
Władca pierścieni - J.R.R. Tolkien

Lista książek papierowych posortowana po roku wydania:
Władca pierścieni - J.R.R. Tolkien, rok wydania: 1954
Solaris - Stanisław Lem, rok wydania: 1961

Lista książek papierowych posortowana wegług liczby stron:
Solaris - Stanisław Lem, liczba stron: 320
Władca pierścieni - J.R.R. Tolkien, liczba stron: 1000
```
