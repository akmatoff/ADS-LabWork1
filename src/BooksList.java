import java.awt.print.Book;

class BooksList {
    private BookListElement head;
    private BookListElement tail;

    void addFront(String udk) {
        BookListElement a = new BookListElement();
        a.udk = udk;

        if(head == null) {
            head = a;
            tail = a;
        } else {
            a.next = head;
            head = a;
        }
    }

    void addBack(String udk) {
        BookListElement a = new BookListElement();
        a.udk = udk;
        if(tail == null) {
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
    }

    void printBookList() {
        BookListElement t = head;
        while (t != null) {
            System.out.println(t.udk + " ");
            t = t.next;
        }
    }
}
