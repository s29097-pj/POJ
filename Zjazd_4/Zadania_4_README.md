### ZADANIA ZJAZD 4

## Zadanie 4.1

Klasy `Circle` i `Cylinder` zaprojektowano tak, jak przedstawiono na diagramie.
- Klasa Cylinder dziedziczy po klasie Circle (na diagramie klas zależność między nimi pokazuje strzałka -> grot strzałki wskazuje na klasę nadrzędną Circle, a klasa Cylinder jest klasą podrzędną).
- Zaimplementuj te klasy zgodnie z diagramem.
- Następnie zaimplementuj klasę `TestCircleAndCylinder`, w której przetestujesz konstruktory i metody z klas Circle i Cylinder.

|**Circle**            |
|----------------------|
|-radius:double = 1.0  |
|-color:String = "blue"|
|----------------------|
|+Circle()             |
|+Circle(radius:double)|
|+getRadius():double   |
|+getArea():double     |
|+toStrig():String     |
|----------------------|
*superclass*

^

*subclass*

|**Cylinder**        |
|--------------------|
|-height:double = 4.0|
|--------------------|
|+Cylinder()         |
|+Cylinder(radius:double)|
|+Cylinder(radius:double, height:double)|
|+getHeight():double|
|+getVolume():double|
|-------------------|


## Zadanie 4.2

**[A]**
 Utwórz klasę nadrzędną o nazwie `Car`. Klasa ta posiada następujące pola i metody:
- int speed;
- double regularPrice;
- String color;
- double getSalePrice() zwracającą regularPrice.

**[B]**
 Utwórz podrzędną klasę `Sedan`. Klasa ta posiada własne pole i własną metodę:
- int length;
- double getSalePrice(), zwracającą wartość w zależności od length: length > 20 daje 5% zniżki, w innych sytuacjach klient otrzyma 10% zniżki.

**[C]**
 Utwórz podrzędną klasę `Ford`, posiadającą pola i metody:
- int year;
- int manufacturerDiscount;
- double getSalePrice() zwracającą wartość x, wyliczaną wg wzoru: x = (cena auta z klasy Car – manufacturerDiscount).

**[D]**
 Utwórz podrzędną klasę `Truck`, posiadającą pole i metodę:
- int weight;
- double getSalePrice() zwracającą wartość w zależności od length: weight > 2000 daje 10% zniżki, w innych sytuacjach klient zniżki nie otrzyma.

**[E]**
Zaimplementuj interfejs `Purchase`, który:
- zawiera metodę String getPurchaseInfo();
- jest implementowany przez klasy: Sedan, Ford i Truck. W każdej z tych klas metoda getPurchaseInfo() ma zwracać nazwę danej klasy (odpowiednio „SEDAN: ”, „FORD: ”,
„TRUCK: ”)

**[F]**

Utwórz klasę `AutoShop`, która zawiera metodę main(). W ramach tej metody main():
- utwórz jedną instancję klasy Sedan i zainicjuj wszystkie pola odpowiednimi wartościami;
- utwórz dwie instancje klasy Ford i zainicjuj ich wszystkie pola odpowiednimi wartościami;
- utwórz jedną instancję klasy Truck i zainicjuj wszystkie pola odpowiednimi wartościami;
- dla każdej z powyższych instancji wypisz na konsolę informację o nazwie obiektu oraz o wartości zwracanej przez getSalePrice();
- pamiętaj o użyciu super(...) w konstruktorach klas!


> mój przykładowy output:

```kolor czerwony "\u001B[31m"
SEDAN
- speed = 160 km/h;
- regularPrice = 20000,00 PLN;
- color = Red;
- length = 10 m;

- sale price = 18000,00 PLN
---- // podkreślenie "\u001B[4m"
```

```kolor niebieski "\u001B[34m"
FORD:
- speed = 156 km/h;
- regularPrice = 4452,00 PLN;
- color = Blue;
- year 2005;
- manufacturerDiscount = 10 %;

- sale price = 4442,00 PLN
---- // podkreślenie "\u001B[4m"
```

```kolor żółty "\u001B[33m"
FORD
- speed = 155 km/h;
- regularPrice = 5000,00 PLN;
- color = Yellow;
- year = 1998;
- manufacturerDiscount = 5 %;

- sale price = 4995,00 PLN
---- // podkreślenie "\u001B[4m"
```

```kolor zielony "\u001B[32m"
TRUCK:
- speed = 200 km/h;
- regularPrice = 500000,00 PLN;
- color = Green;
- weight = 5000 kg;

- sale price = 450000,00 PLN
---- // podkreślenie "\u001B[4m"
```

