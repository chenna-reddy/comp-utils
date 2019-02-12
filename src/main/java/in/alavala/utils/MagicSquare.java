package in.alavala.utils;

public class MagicSquare {

    public static int[][] construct(int n) {
        if (n % 2 == 0) {
            throw new IllegalArgumentException("Only Odd sizes for now");
        }
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i] = new int[n];
        }
        int r = n * n, c = n / 2;
        for (int i = 1; i <= n * n; i++) {
            matrix[r % n][c % n] = i;
            if (i % n == 0) {
                r++;
            } else {
                r--;
                c++;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = construct(5);
        MatrixUtils.print(matrix);
    }
}
