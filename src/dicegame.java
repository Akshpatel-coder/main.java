public class dicegame {
        public static void main(String[] args) {
            int dice1 = rollDice();
            int dice2 = rollDice();
            int sum = dice1 + dice2;

            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
            System.out.println("Sum: " + sum);

            if (sum == 7 || sum == 11) {
                System.out.println("Congratulations! You win!");
            } else if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Sorry, you lose!");
            } else {
                System.out.println("Roll again!");
            }
        }

        static int rollDice() {
            return (int) (Math.random() * 6) + 1;
        }
    }

