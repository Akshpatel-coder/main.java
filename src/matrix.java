public class matrix {


        // Method to multiply two matrices
        public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
            int rows1 = firstMatrix.length;
            int columns1 = firstMatrix[0].length;
            int columns2 = secondMatrix[0].length;
            int[][] result = new int[rows1][columns2];

            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns2; j++) {
                    for (int k = 0; k < columns1; k++) {
                        result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                    }
                }
            }
            return result;
        }

        // Method to print a matrix
        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int column : row) {
                    System.out.print(column + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            // Define two matrices
            int[][] firstMatrix = {{1, 2, 3}, {4, 5, 6}};
            int[][] secondMatrix = {{7, 8}, {9, 10}, {11, 12}};

            // Multiply the matrices
            int[][] resultMatrix = multiplyMatrices(firstMatrix, secondMatrix);

            // Print the result
            System.out.println("Product of the matrices:");
            printMatrix(resultMatrix);
        }
    }


