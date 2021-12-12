public class Main {

    public static void main(String[] args) {

        Writer writer1 = new Writer("Aldous Huxley");
        Book book1 = new Book(writer1, "Brave New World", 259);

        Writer writer2 = new Writer("Charles Bukowski");
        Book book2 = new Book(writer2,"Post Office", 160);

        Writer writer3 = new Writer("Jim Morrison");
        Book book3 = new Book(writer3,"Wilderness", 214);

        Book book4 = new Book(writer1,"The Doors of Perception", 123);

        Book book5 = new Book(writer2,"Ham on Rye", 318);

        System.out.println("Library");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book4.toString());
        System.out.println(book5.toString());
        System.out.println();
        System.out.println(Book.toPages()); // to print out a book with most pages

        new User("Anna", "Morozova", "anna@mail.ru");
        new User("Maxim", "Komarov", "max@mail.ru");
        new User("Olga", "Shpents", "nadya@mail.ru");
        new User("Denis", "Ivanov", "denya@mail.ru");

        System.out.println(User.toCounter()); // to print out how many users visiting library
    }
}