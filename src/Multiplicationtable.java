public class Multiplicationtable {

        public static void main(String[] args) {
            // Create a StringBuilder to store the multiplication table
            StringBuilder table = new StringBuilder();

            // Generate the multiplication table
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    table.append(i).append(" x ").append(j).append(" = ").append(i * j).append("\n");
                }
                table.append("\n");
            }

            // Print the multiplication table
            System.out.println("Multiplication Table:");
            System.out.println(table.toString());
        }
    }