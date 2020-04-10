import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BooksList booksList = new BooksList();

        booksList.insertFirst("367338551", "Марк Мэнсон", "Тонкое искусство пофигизма", "2016 г.", 5);
        booksList.insertFirst("367500601", "Наполеон Хилл", "Думай и богатей!", "1937 г.", 12);
        booksList.insertFirst("367338600", "Марк Мэнсон", "Everything is F*cked: A Book About Hope", "2019 г.", 1);
        booksList.insertFirst("367111100", "Юваль Ной Харари", "Sapiens. Краткая история человечества.", "2016 г.", 4);
        booksList.insertFirst("367501001", "Джулия Эндерс", "Очароватльный кишечник. Как самый могущественный орган управляет нами", "2016 г.", 20);
        booksList.insertFirst("367502001", "Джон Кэхо", "Подсознание может всё!", "2015 г.", 35);
        booksList.insertFirst("367503001", "Генри Марш", "Не навреди", "2016 г.", 8);
        booksList.insertLast("367600321", "Лев Толстой", "Война и мир", "1865 г.", 39);
        booksList.insertAt("3635656302", "Кто-то", "Кто Я?", "2020 г.", 1, 5);

        System.out.println("Введите 1 для вывода списка книг, 2 если хотите взять книгу, 3 для завершения программы:");
        int choice = scanner.nextInt();
        System.out.println();

        while (choice != 3) {
            if (choice == 1) {
                System.out.println("Список книг в библиотеке: ");
                System.out.println();
                booksList.printList();
            } else if (choice == 2) {
                System.out.println("Введите УДК книги: ");
                String udk = scanner.next();
                booksList.takeBook(udk);
            }
        }

    }

}
