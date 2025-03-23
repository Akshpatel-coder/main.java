class Countdown {
    public static void main(String[] args) {
        System.out.println("Countdown begins!");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            waitOneSecond();
        }

        System.out.println(" (ROCKET)  Lift off!");
    }

    static void waitOneSecond() {
        try {
            Thread.sleep(1000); // Pause for 1 second
        } catch (InterruptedException e) {
            System.out.println("Error in sleep");
        }
    }
}
