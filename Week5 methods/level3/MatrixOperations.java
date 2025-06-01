import java.util.Random;

public class MatrixOperations {
    public static void main(String[] args) {
        int rows = 3, cols = 3;
        int[][] matrix1 = generateRandomMatrix(rows, cols);
        int[][] matrix2 = generateRandomMatrix(rows, cols);

        displayMatrix(matrix1);
        displayMatrix(matrix2);

        int[][] addedMatrix = addMatrices(matrix1, matrix2);
        System.out.println("Matrix Addition:");
        displayMatrix(addedMatrix);

        int[][] multipliedMatrix = multiplyMatrices(matrix1, matrix2);
        System.out.println("Matrix Multiplication:");
        displayMatrix(multipliedMatrix);

        int[][] transposedMatrix = transposeMatrix(matrix1);
        System.out.println("Matrix Transpose:");
        displayMatrix(transposedMatrix);

        // Determinants
        System.out.println("Determinant of 2x2 Matrix: " + determinant2x2(matrix1));
        System.out.println("Determinant of 3x3 Matrix: " + determinant3x3(matrix1));
    }

    public static int[][] generateRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10) + 1; // Random numbers 1-10
            }
        }
        return matrix;
    }

    public static int[][] addMatrices(int[][] m1, int[][] m2) {
        int rows = m1.length;
        int cols = m1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return result;
    }

    public static int[][] multiplyMatrices(int[][] m1, int[][] m2) {
        int rows = m1.length;
        int cols = m2[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < m1[0].length; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
               matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
               matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
