package in.alavala.utils;

import java.util.Scanner;

public class MatrixUtils {

    public static void print(int[][] matrix) {
        for (int[] row: matrix) {
            for (int col: row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println("-----");
    }

    public static int absDiff(int[][] matrixA, int[][] matrixB) {
        if (matrixA.length != matrixB.length) {
            throw new IllegalArgumentException("len[A]: " + matrixA.length + " != len[B]: " + matrixB.length);
        }
        int sum = 0;
        for (int i=0; i<matrixA.length; i++) {
            for (int j=0; j<matrixA[i].length; j++) {
                sum += Math.abs(matrixA[i][j] - matrixB[i][j]);
            }
        }
        return sum;
    }

    public static void rotate(int[][] matrix, int sr, int sc, int l) {
        if (l <= 1) {
            return;
        }
        int l1 = l-1;
        for (int i=0; i<l-1; i++) {
            int t = matrix[sr][sc+i];
            matrix[sr][sc+i] = matrix[sr+i][sc+l1];
            matrix[sr+i][sc+l1] = matrix[sr+l1][sc+l1-i];
            matrix[sr+l1][sc+l1-i] = matrix[sr+l1-i][sc];
            matrix[sr+l1-i][sc] = t;
        }
        rotate(matrix, sr+1, sc+1, l-2);
    }

    public static void rotate(int[][] matrix) {
        rotate(matrix, 0, 0, matrix.length);
    }

    public static void transpose(int[][] matrix) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<i; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int ts = scanner.nextInt();
        while (ts-- > 0) {
            int n = scanner.nextInt();
            int[][] matrix = new int[n][n];
            for (int i=0; i<n; i++) {
                int[] row = new int[n];
                for (int j=0; j<n; j++) {
                    row[j] = scanner.nextInt();
                }
                matrix[i] = row;
            }
            rotate(matrix);
            print(matrix);
        }
    }
}
