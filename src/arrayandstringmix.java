public class arrayandstringmix {


        public static void main(String[] args) {
            String phrase = "Coding is amazing";
            int[] values = {2, 4, 6, 8, 10};

            // String manipulation
            System.out.println("Original phrase: " + phrase);
            System.out.println("Word count: " + phrase.split(" ").length);
            System.out.println("Last character: " + phrase.charAt(phrase.length() - 1));

            // Array operations
            int arraySum = 0;
            for (int value : values) {
                arraySum += value;
            }
            System.out.println("Array sum: " + arraySum);
            System.out.println("First array element: " + values[0]);
            System.out.println("Last array element: " + values[values.length - 1]);

            // Combining string and array logic
            if (phrase.contains("amazing") && arraySum > 20) {
                System.out.println("Condition met!");
            } else {
                System.out.println("Condition not met.");
            }

            //Simple array value printing
            for(int i = 0; i < values.length; i++){
                System.out.println("Value at index " + i + ": " + values[i]);
            }
            System.out.println("Phrase length: " + phrase.length());
        }
    }

