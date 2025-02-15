public class addition {


        // Method to add two matrices
        public static int[][] addMatrices(int[][] firstMatrix, int[][] secondMatrix) {
            int rows = firstMatrix.length;
            int columns = firstMatrix[0].length;
            int[][] result = new int[rows][columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
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
            int[][] secondMatrix = {{7, 8, 9}, {10, 11, 12}};

            // Add the matrices
            int[][] resultMatrix = addMatrices(firstMatrix, secondMatrix);

            // Print the result
            System.out.println("Sum of the matrices:");
            printMatrix(resultMatrix);
        }
    }


