// Klasa Author reprezentuje autora, posiada trzy prywatne pola: name (String), surname (String), age (int)
class Author {
    private String name; // pole name reprezentujące imię autora
    private String surname; // pole surname reprezentujące nazwisko autora
    private int age; // pole age reprezentujące wiek autora

    // Konstruktor klasy Author, pozwalający na ustawienie imienia, nazwiska i wieku autora
    public Author(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Getter dla pola name
    public String getName() {
        return name;
    }

    // Setter dla pola name
    public void setName(String name) {
        this.name = name;
    }

    // Getter dla pola surname
    public String getSurname() {
        return surname;
    }

    // Setter dla pola surname
    public void setSurname(String surname) {
        this.surname = surname;
    }

    // Getter dla pola age
    public int getAge() {
        return age;
    }

    // Setter dla pola age
    public void setAge(int age) {
        this.age = age;
    }

    // Metoda toString(), zwracająca informację o autorze: jego imię, nazwisko i wiek
    @Override
    public String toString() {
        return "Author {" +
                "name ='" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", age = " + age +
                '}';
    }
}

// Klasa TestAuthor służy do przetestowania klasy Author
class TestAuthor {
    public static void main(String[] args) {
        // Tworzymy obiekty Author dla trzech autorów o różnych danych
        Author author1 = new Author("Stanisław", "Lem", 55);
        Author author2 = new Author("Philip", "K. Dick", 38);
        Author author3 = new Author("Frank", "Herbert", 42);

        // Wyświetlamy informacje na temat każdego autora za pomocą metody toString()
        System.out.println("Autor 1: " + author1.toString());
        System.out.println("Autor 2: " + author2.toString());
        System.out.println("Autor 3: " + author3.toString());

        // Zmieniamy wiek drugiego autora i wyświetlamy zaktualizowaną informację na jego temat
        author2.setAge(30);
        System.out.println("Aktualizacja wieku Autora 2: " + author2.toString());
    }
}
