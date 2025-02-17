public class currenttouppercase {


        // Method to convert an array of strings to uppercase
        public static String[] toUppercase(String[] strings) {
            String[] result = new String[strings.length];
            for (int i = 0; i < strings.length; i++) {
                result[i] = strings[i].toUpperCase();
            }
            return result;
        }

        // Method to print an array of strings
        public static void printArray(String[] array) {
            for (String str : array) {
                System.out.print(str + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            // Define an array of strings
            String[] strings = {"hello", "world", "java", "programming"};

            // Convert the array to uppercase
            String[] uppercaseStrings = toUppercase(strings);

            // Print the original and converted arrays
            System.out.println("Original array:");
            printArray(strings);

            System.out.println("Uppercase array:");
            printArray(uppercaseStrings);
        }
    }


