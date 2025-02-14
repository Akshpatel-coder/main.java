public class Book {

        private String title;
        private String author;
        private int quantity;

        public Book(String title, String author, int quantity) {
            this.title = title;
            this.author = author;
            this.quantity = quantity;
        }

        public void addQuantity(int amount) {
            if (amount > 0) {
                quantity += amount;
            }
        }

        public void removeQuantity(int amount) {
            if (amount > 0 && amount <= quantity) {
                quantity -= amount;
            }
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    class BookstoreInventory {
        public static void main(String[] args) {
            Book[] inventory = new Book[3];
            inventory[0] = new Book("1984", "George Orwell", 10);
            inventory[1] = new Book("To Kill a Mockingbird", "Harper Lee", 5);
            inventory[2] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 8);

            System.out.println("Initial Inventory:");
            displayInventory(inventory);

            // Add quantities
            inventory[0].addQuantity(5);
            inventory[1].addQuantity(3);
            inventory[2].addQuantity(7);

            System.out.println("Updated Inventory:");
            displayInventory(inventory);

            // Remove quantities
            inventory[0].removeQuantity(2);
            inventory[1].removeQuantity(1);
            inventory[2].removeQuantity(3);

            System.out.println("Final Inventory:");
            displayInventory(inventory);
        }

        public static void displayInventory(Book[] inventory) {
            for (Book book : inventory) {
                System.out.println(book.getTitle() + " by " + book.getAuthor() + ": " + book.getQuantity() + " copies");
            }
        }
    }



