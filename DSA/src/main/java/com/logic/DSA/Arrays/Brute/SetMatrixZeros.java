package com.logic.DSA.Arrays.Brute;

public class SetMatrixZeros {
    private static void markColumn(int[][] matrix, int row) {
        for (int i = 0; i < matrix[row].length; i++) {
            matrix[row][i] = -1;
        }
    }

    private static void markRow(int[][] matrix, int column) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[i][column] = -1;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    markRow(matrix, i);
                    markColumn(matrix, j);
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
