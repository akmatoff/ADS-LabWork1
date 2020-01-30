import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BooksList booksList = new BooksList();

        booksList.append("367338551", "Марк Мэнсон", "Искусство пофигизма", "2016 г.");
        booksList.append("367338552", "Марк Мэнсон", "Искусство пофигизма", "2016 г.");
        booksList.append("367500601", "Наполеон Хилл", "Думай и богатей!", "1937 г.");
        booksList.append("367500602", "Наполеон Хилл", "Думай и богатей!", "2008 г.");
        booksList.push("367600321", "Лев Толстой", "Война и мир", "1865 г.");
        booksList.printBooks();


    }
}
