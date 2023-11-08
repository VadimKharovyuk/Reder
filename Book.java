package Test.Reder;
//- takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги).
// Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
// Аналогичным образом перегрузить метод returnBook().
// Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".
public class Book {
    private String name ;
    private String author;
    static int  bookCount = 0;

    public Book(String name, String author) {
        bookCount++;
        this.name = name;
        this.author = author;
    }
    public void takeBook (String name){
        System.out.println("Петров В. В. взял книги: " +name);
    }


    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
