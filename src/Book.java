
class BooksList {
    Book head;
    int size;

    public class Book {
        String udk;
        String author;
        String title;
        String pubYear;
        int amount;
        Book next;
    
        Book(String udk, String author, String title, String pubYear, int amount) {
            this.udk = udk;
            this.author = author;
            this.title = title;
            this.pubYear = pubYear;
            this.amount = amount;
            next = null;
        }
    }

    BooksList() {
        this.head = null;
        this.size = 0;
    }

    // Insert a new Node at front of the list
    public void insertFirst(String udk, String author, String title, String pubYear, int amount) {
        Book newBook = new Book(udk, author, title, pubYear, amount); // New object of class
        newBook.next = head; // Make next of new Node as head
        this.head = newBook; // Move the head to point to new Node
        this.size++;
    }

    // Insert a new Node at the end of the list
    public void insertLast(String udk, String author, String title, String pubYear, int amount) {
        Book newBook = new Book(udk, author, title, pubYear, amount); // New object of class
        Book currentBook;

        // If empty, make head
        if(this.head == null) {
            this.head = newBook;
        } else {
            currentBook = this.head;

            while (currentBook.next != null) {
                currentBook = currentBook.next;
            }

            currentBook.next = newBook;
        }

        this.size++;
    }

    // Insert Node after a certain Node
    public void insertAt(String udk, String author, String title, String pubYear, int amount, int index) {
        // If index is out of range
        if (index > 0 && index > this.size) {
            return;
        }

        // If index is 0
        if(index == 0) {
            this.insertFirst(udk, author, title, pubYear, amount);
            return;
        }

        Book newBook = new Book(udk, author, title, pubYear, amount);
        Book currentBook;
        Book prevBook;

        // Set current to first
        currentBook = this.head;
        prevBook = currentBook;
        int count = 0;
        
        while (count < index) {
            prevBook = currentBook; // Node before index
            count++;
            currentBook = currentBook.next; // Node after index
        }

        newBook.next = currentBook;
        prevBook.next = newBook;

        this.size++;
        
    }

    // Take book from the library
    public void takeBook(String udk) {
        Book currentBook = this.head;
        Boolean found = false;

        while (currentBook != null) {
            if (udk.equals(currentBook.udk)) {
                currentBook.amount--;
                found = true;

                System.out.println("Вы взяли книгу: ");
                System.out.println("УДК: " + currentBook.udk);
                System.out.println("Автор: " + currentBook.author);
                System.out.println("Название: " + currentBook.title);
                System.out.println("Год публикации: " + currentBook.pubYear);
                System.out.println("Количество экземпляров: " + currentBook.amount);
                System.out.println();    
            } 
            currentBook = currentBook.next;
        }

        if (!found) {
            System.out.println("Данной книги нет в библиотеке.");
        }

        this.size--;
        return;
    }

    public void printList() {
        Book currentBook = head;
        while (currentBook != null) {
            System.out.println("УДК: " + currentBook.udk);
            System.out.println("Автор: " + currentBook.author);
            System.out.println("Название: " + currentBook.title);
            System.out.println("Год публикации: " + currentBook.pubYear);
            System.out.println("Количество экземпляров: " + currentBook.amount);
            System.out.println();
            currentBook = currentBook.next;
        }
    }
}