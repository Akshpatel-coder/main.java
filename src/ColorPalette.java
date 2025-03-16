
    import java.util.HashSet;
import java.util.Set;

    public class ColorPalette {
        public static void main(String[] args) {
            // Create a HashSet to store unique colors
            Set<String> colors = new HashSet<>();

            // Add colors
            colors.add("Red");
            colors.add("Green");
            colors.add("Blue");
            colors.add("Red"); // Duplicate color
            colors.add("Yellow");

            // Print the unique colors
            System.out.println("Unique Colors:");
            for (String color : colors) {
                System.out.println(color);
            }

            // Check if a color exists
            System.out.println("\nDoes the color 'Green' exist? " + colors.contains("Green"));

            // Remove a color
            colors.remove("Blue");

            // Print the updated unique colors
            System.out.println("\nUpdated Unique Colors:");
            for (String color : colors) {
                System.out.println(color);
            }
        }
    }

