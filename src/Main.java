import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BooksList booksList = new BooksList();

        booksList.append("367338551", "Марк Мэнсон", "Тонкое искусство пофигизма", "2016 г.");
        booksList.append("367338552", "Марк Мэнсон", "Тонкое искусство пофигизма", "2016 г.");
        booksList.append("367500601", "Наполеон Хилл", "Думай и богатей!", "1937 г.");
        booksList.append("367500602", "Наполеон Хилл", "Думай и богатей!", "2008 г.");
        booksList.append("367500700", "Наполеон Хилл", "Сегодня и завтра", "2016 г.");
        booksList.append("367338600", "Марк Мэнсон", "Everything is F*cked: A Book About Hope", "2019 г.");
        booksList.append("367111100", "Юваль Ной Харари", "Sapiens. Краткая история человечества.", "2016 г.");
        booksList.append("367501001", "Джулия Эндерс", "Очароватльный кишечник. Как самый могущественный орган управляет нами", "2016 г.");
        booksList.append("367502001", "Джон Кэхо", "Подсознание может всё!", "2015 г.");
        booksList.append("367503001", "Генри Марш", "Не навреди", "2016 г.");
        booksList.append("367503002", "Генри Марш", "Не навреди", "2016 г.");
        booksList.push("367600321", "Лев Толстой", "Война и мир", "1865 г.");

        System.out.println("Общее количество книг в библиотеке: " + booksList.getCount());
        System.out.println("Введите 1 для вывода списка всех книг или 2 чтоб забрать книгу: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            booksList.printBooks();
        } else if (choice == 2) {
            System.out.println("Введите УДК книги: ");
            String udk = scanner.nextLine();
        }
			if (udk.equals(booksList.getUdk())) {
                booksList.deleteBook(udk);
            }
        }

    }
}
