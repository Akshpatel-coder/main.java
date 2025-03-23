public class matrixoperations {

        public static void main(String[] args) {
            int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            int diagonalSum = 0;
            int secondaryDiagonalSum = 0;
            int rowSum = 0;

            for (int i = 0; i < matrix.length; i++) {
                diagonalSum += matrix[i][i];
                secondaryDiagonalSum += matrix[i][matrix.length - 1 - i];
                rowSum = 0;
                for(int j = 0; j< matrix[0].length; j++){
                    rowSum += matrix[i][j];
                }
                System.out.println("Row sum "+i+": " + rowSum);
            }

            System.out.println("Diagonal sum: " + diagonalSum);
            System.out.println("Secondary diagonal sum: " + secondaryDiagonalSum);

            int[][] transposed = new int[matrix[0].length][matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    transposed[j][i] = matrix[i][j];
                }
            }
        }
    }

