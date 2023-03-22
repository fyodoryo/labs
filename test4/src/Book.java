public class Book {

        String name;
        String publishingHouse;
        int price;
        int year;
        int number_of_Pages;
        Author author;

        public Book(String name,String publishingHouse,int price, int year,int number_of_Pages, Author author){
            this.name=name;
            this.publishingHouse=publishingHouse;
            this.price=price;
            this.year=year;
            this.number_of_Pages=number_of_Pages;
            this.author=author;
        }
        public String toString(){
            return "название книги: "+name+", издание: "+publishingHouse+", цена: "+price+", год: "+year+", кол-во старниц: "+number_of_Pages+", автор: "+author;
        }
    }


