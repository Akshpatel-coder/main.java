public class stringandmathop {


        public static void main(String[] args) {
            String phrase = "Coding is fun and challenging!";
            int num1 = 17;
            int num2 = 5;
            double pi = Math.PI;
            double sqrtNum1 = Math.sqrt(num1);
            int remainder = num1 % num2;
            String upperPhrase = phrase.toUpperCase();
            String replacedPhrase = phrase.replace("fun", "exciting");
            int phraseLength = phrase.length();

            System.out.println("Original Phrase: " + phrase);
            System.out.println("Uppercase Phrase: " + upperPhrase);
            System.out.println("Replaced Phrase: " + replacedPhrase);
            System.out.println("Phrase Length: " + phraseLength);

            System.out.println("Num1: " + num1);
            System.out.println("Num2: " + num2);
            System.out.println("Pi: " + pi);
            System.out.println("Square Root of Num1: " + sqrtNum1);
            System.out.println("Remainder (Num1 % Num2): " + remainder);

            double power = Math.pow(num1, num2);
            System.out.println("Num1 to the power of Num2: " + power);

            double randomNum = Math.random() * 100;
            System.out.println("Random Number (0-100): " + randomNum);

            int roundedRandom = (int) Math.round(randomNum);
            System.out.println("Rounded Random Number: " + roundedRandom);

            System.out.println("Absolute value of (num2 - num1) : " + Math.abs(num2-num1));

            String subString = phrase.substring(0,6);
            System.out.println("Substring : " + subString);
        }
    }

