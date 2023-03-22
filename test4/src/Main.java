public class Main {
    public static void main(String[] args) {

            Author firstAuthor = new Author("Клайв Стейплз Льюис", 1898 ,60 );
            Book firstBook = new Book("Лев, колдунья и платяной шкаф", "Джон Толкин",564,1950,464,firstAuthor );
            Book secondBook=new Book("Племянник чародея.","Махаон",1490,1955,480,firstAuthor);
            Book thirdBook=new Book("Конь и его мальчик ","Джордж Мартин",770,1954,704,firstAuthor);
            Book fourthBook=new Book("Принц Каспиан :Возвращение в Нарнию","Джордж Оруэлл",736,1951,320,firstAuthor);
            User firstUser=new User("Федор","Бабаев","babau4ik@mail.ru");
            User secondUser=new User("Кирилл","Корягин","kirill@mail.ru");
            User thirdUser=new User("Иван","Самойлов","ivan@mail.ru");
            System.out.println("Кол-во пользователей в сети: " +User.totalonLine);
            System.out.println(fourthBook);
            System.out.println(firstAuthor);



        }
}
