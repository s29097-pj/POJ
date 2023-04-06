### ZADANIA ZJAZD 3

## Zadanie 3.1

a) Zaprojektuj klasę `Circle` składającą się z:

- dwóch prywatnych zmiennych:
> double radius
> String color

- dwóch przeciążonych konstruktorów:
> pierwszy konstruktor, który ustawia domyślnie zarówno promień, jak i kolor;
> drugi konstruktor z podanym promieniem, ale domyślnym kolorem.

- dwóch publicznych metod:
> getRadius () zwracającą wartość promienia
> getArea () zwracającą pole koła `wzór na pole koła P P=𝜋𝑟2`

b) W projekcie z poprzedniego punktu zaimplementuj klasę `TestCircle`, zawierającą metodę main (). 
Utwórz dwa obiekty typu Circle, każdy na podstawie innego konstruktora, a następnie wypisz na konsolę pole i promień każdego z nich.

c) Zmodyfikuj klasę `Circle`, dodając do niej trzeci konstruktor, służący do tworzenia nowej instancji Circle o podanym promieniu i kolorze.
Zmodyfikuj klasę `TestCircle`, aby skonstruować trzecią instancję Circle za pomocą tego konstruktora, a następnie wypisz na konsolę jego pole i promień.

d) Do klasy `Circle` dodaj dwa publiczne settery, które będą ustawiały promień i kolor koła. 
Następnie w klasie TestCircle dodaj czwartą instancję klasy Circle i przy pomocy setterów ustaw wartości pola i promienia. Wypisz je na konsolę.

e) W getterach i setterach klasy `Circle` użyj słowa kluczowego `this`. 
Zaimplementuj także metodę toString (), która będzie wypisywać wartość promienia i kolor każdego z obiektów klasy Circle. 
Użyj jej w klasie TestCircle.

## Zadanie 3.2
Klasa Author jest zaprojektowana tak, jak przedstawiono na diagramie:

Author
-name: String
-surname: String
-age: int

+Author(name:String, email:String, age:int)
+getName():String
+getSurname():String
+setAge(age:int):void
+toString():String

Zaimplementuj klasę Author, w której zawrzesz:
- trzy prywatne instancje zmiennych: 'name (String)', 'surname (String)', 'age(int)` i jeden konstruktor, 
pozwalający na ustawienie imienia, nazwiska i wieku obiektu typu Author

- gettery i settery : `getName()`, `getSurname()`, `setSurname()`, `getAge`;
uwaga: nie ma setterów dla imienia i wieku tych wartości nie można zmieniać

- metodę toString (), wypisującą na konsolę informacje o autorze: jego imię, nazwisko i wiek.
Następnie zaimplementuj klasę `TestAuthor` , w której przetestujesz konstruktor i publiczne metody z klasy `Author`


