public class BooksList {
    Book head;

    class Book {
        String udk;
        String author;
        String title;
        String pubYear;

        Book next;

        Book(String udk, String author, String title, String pubYear) {
            this.udk = udk;
            this.author = author;
            this.title = title;
            this.pubYear = pubYear;
    }

}

    public void push(String udk, String author, String title, String pubYear) {
        Book newBook = new Book(udk, author, title, pubYear);
        
        newBook.next = head;
        head = newBook;
    }

    public void append(String udk, String author, String title, String pubYear) {
        Book newBook = new Book(udk, author, title, pubYear);

        if (head == null) {
            head = new Book(udk, author, title, pubYear);
            return;
        }

        newBook.next = null;

        Book last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newBook;
        return;
    }

    public void printBooks() {

        Book book = head;
        while (book != null) {
            System.out.println("УДК: " + book.udk + "\n" + "Автор: " + book.author + "\n" + "Название: " + book.title + "\n" + "Год издания: " + book.pubYear + "\n\n");
            book = book.next;
        }
    }

    void deleteBook(String udkKey) {
        Book temp = head, prev = null;

        if (temp != null && temp.udk == udkKey) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.udk == udkKey) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        prev.next = temp.next;
    }

    public int getCount() {
        Book temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public String getUdk() {
        return udk;
    }   

}