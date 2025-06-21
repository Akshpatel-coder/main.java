package intererface;
class Library {
    String[] books;
    int no_of_books;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }

    void showAvailableBooks() {
        System.out.println("Available Books are:");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }

    void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] != null && this.books[i].equalsIgnoreCase(book)) {
                System.out.println("The book \"" + this.books[i] + "\" has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist.");
    }

    void returnBook(String book) {
        addBook(book);
    }
}

public class solution {
    public static void main(String[] args) {
        Library centralLibrary = new Library();

        // Adding books
        centralLibrary.addBook("Think and Grow Rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("C++");

        // Issuing a book (case-insensitive)
        centralLibrary.issueBook("c++");  // works even if lowercase

        // Showing books after issuing
        centralLibrary.showAvailableBooks();

        // Returning the book
        centralLibrary.returnBook("C++");

        // Showing books after return
        centralLibrary.showAvailableBooks();
    }
}
