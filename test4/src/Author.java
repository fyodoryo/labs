public class Author {
    String FIO;
    int Date_of_Birth;
    int number_of_Books;

    public Author(String FIO, int Date_of_Birth, int number_of_Books) {
        this.FIO = FIO;
        this.Date_of_Birth = Date_of_Birth;
        this.number_of_Books = number_of_Books;
    }

    public String toString() {
        return FIO + ", дата рождения: " + Date_of_Birth + ", кол-во книг: " + number_of_Books;
    }
}
