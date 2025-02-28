public class StringManipulation {
    public static void main(String[] args) {
        String original = "Java Programming is fun!";
        String upperCase = original.toUpperCase();
        String lowerCase = original.toLowerCase();
        String substring = original.substring(5, 16);
        String replaced = original.replace("fun", "powerful");
        int length = original.length();
        boolean contains = original.contains("Program");
        String[] words = original.split(" ");

        System.out.println("Original: " + original);
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);
        System.out.println("Substring: " + substring);
        System.out.println("Replaced: " + replaced);
        System.out.println("Length: " + length);
        System.out.println("Contains 'Program': " + contains);

        System.out.print("Words: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}
