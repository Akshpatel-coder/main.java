public class stringandbitwise {


        public static void main(String[] args) {
            String data = "Hello, Java!";
            int value = 10; // Binary: 1010

            // String manipulation
            System.out.println("Original data: " + data);
            System.out.println("Character at index 7: " + data.charAt(7));
            System.out.println("Ends with '!': " + data.endsWith("!"));

            // Bitwise operations
            System.out.println("Value (decimal): " + value);
            System.out.println("Value (binary): " + Integer.toBinaryString(value));

            int shiftedLeft = value << 2; // Shift left by 2 bits
            System.out.println("Shifted left (<< 2): " + shiftedLeft + " (binary: " + Integer.toBinaryString(shiftedLeft) + ")");

            int shiftedRight = value >> 1; // Shift right by 1 bit
            System.out.println("Shifted right (>> 1): " + shiftedRight + " (binary: " + Integer.toBinaryString(shiftedRight) + ")");

            int bitwiseAnd = value & 5; // Bitwise AND with 5 (binary: 0101)
            System.out.println("Bitwise AND (& 5): " + bitwiseAnd + " (binary: " + Integer.toBinaryString(bitwiseAnd) + ")");

            int bitwiseOr = value | 3; // Bitwise OR with 3 (binary: 0011)
            System.out.println("Bitwise OR (| 3): " + bitwiseOr + " (binary: " + Integer.toBinaryString(bitwiseOr) + ")");

            int bitwiseXor = value ^ 7; // Bitwise XOR with 7 (binary: 0111)
            System.out.println("Bitwise XOR (^ 7): " + bitwiseXor + " (binary: " + Integer.toBinaryString(bitwiseXor) + ")");

            int bitwiseNot = ~value; //Bitwise NOT
            System.out.println("Bitwise NOT (~): " + bitwiseNot + " (binary: " + Integer.toBinaryString(bitwiseNot) + ")");
        }
    }

