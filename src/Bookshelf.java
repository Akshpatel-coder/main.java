
    import java.util.ArrayList;

    public class Bookshelf {
        public static void main(String[] args) {
            // Create an ArrayList to store book titles
            ArrayList<String> bookTitles = new ArrayList<>();

            // Add book titles
            bookTitles.add("To Kill a Mockingbird");
            bookTitles.add("1984");
            bookTitles.add("Pride and Prejudice");
            bookTitles.add("The Great Gatsby");
            bookTitles.add("Jane Eyre");

            // Print the book titles
            System.out.println("Book Titles:");
            for (String title : bookTitles) {
                System.out.println(title);
            }
        }
    }