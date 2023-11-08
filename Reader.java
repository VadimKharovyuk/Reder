package Test.Reder;
////ФИО,
////номер читательского билета,
////факультет,
////дата рождения,
////телефон.
////Методы takeBook(), returnBook().
//- takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
//- takeBook, который будет принимать переменное количество названий книг.
// Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
//- takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги).
// Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
// Аналогичным образом перегрузить метод returnBook().
// Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".

public class Reader {
     private String name ;
     private int numberBook;
     private String nameBirthday;
     private long numberPhone;
     private Facultet facultet;

    public Reader(String name, int numberBook, String nameBirthday, long numberPhone, Facultet facultet) {
        this.name = name;
        this.numberBook = numberBook;
        this.nameBirthday = nameBirthday;
        this.numberPhone = numberPhone;
        this.facultet = facultet;
    }

    public void takeBook ( Integer countBook){
        System.out.println(name +" взял " +countBook +" книги");
    }
    public void  takeBook( ){
        System.out.println("Было взято "+ Book.bookCount + " книг из библиотеки студентом  " +this.name );

    }

    public void returnBook (String name){
        System.out.println("Петров В. В. вернул книги: " +name);

    }
    //пример аргументов  переменны  ддинны
    public void bookArray(int ...array){
        for (int a :array){
            System.out.println("Количество книг  в  библиотеке равно " +a);
        }

    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", numberBook=" + numberBook +
                ", nameBirthday='" + nameBirthday + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", facultet=" + facultet +
                '}';
    }
}
