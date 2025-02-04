public class strings7 {



                public static void main(String[] args) {
                    // Creating a string
                    String greeting = "Hello, World!";

                    // Printing the original string
                    System.out.println("Original String: " + greeting);

                    // Finding the length of the string
                    int length = greeting.length();
                    System.out.println("Length of the string: " + length);

                    // Accessing characters in the string
                    char firstChar = greeting.charAt(0);
                    char fifthChar = greeting.charAt(4);
                    System.out.println("First character: " + firstChar);
                    System.out.println("Fifth character: " + fifthChar);

                    // Converting to uppercase
                    String upperCaseGreeting = greeting.toUpperCase();
                    System.out.println("Uppercase String: " + upperCaseGreeting);

                    // Replacing a substring
                    String replacedGreeting = greeting.replace("World", "Java");
                    System.out.println("Replaced String: " + replacedGreeting);

                    // Checking if the string contains a substring
                    boolean contains = greeting.contains("Hello");
                    System.out.println("Contains 'Hello'? " + contains);

                    // Extracting a substring
                    String substring = greeting.substring(7, 12); // "World"
                    System.out.println("Substring (index 7 to 12): " + substring);
                }
            }