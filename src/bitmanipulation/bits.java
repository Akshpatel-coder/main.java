package bitmanipulation;

public class bits {

    private static int bitMask;

    public static void main(String args) {
        int n = 5;  //0101
        int pos = 2;
        int bitmask = 1<<pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}
