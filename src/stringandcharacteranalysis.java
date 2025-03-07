public class stringandcharacteranalysis {


        public static void main(String[] args) {
            String input = "This is a Test String with 123 numbers and !@# symbols.";
            int vowelCount = 0;
            int consonantCount = 0;
            int symbolCount = 0;

            // Character analysis
            for (char c : input.toLowerCase().toCharArray()) {
                if (Character.isLetter(c)) {
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        vowelCount++;
                    } else {
                        consonantCount++;
                    }
                } else if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                    symbolCount++;
                }
            }

            System.out.println("Input string: " + input);
            System.out.println("Vowel count: " + vowelCount);
            System.out.println("Consonant count: " + consonantCount);
            System.out.println("Symbol count: " + symbolCount);

            // Simple string manipulation
            String reversed = new StringBuilder(input).reverse().toString();
            System.out.println("Reversed string: " + reversed);

            //Simple character check.
            char firstChar = input.charAt(0);
            System.out.println("First char is whitespace: " + Character.isWhitespace(firstChar));

            //Simple string replacement.
            String replaced = input.replace("Test", "Sample");
            System.out.println("Replaced String: " + replaced);
        }
    }

