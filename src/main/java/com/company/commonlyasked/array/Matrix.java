package com.company.commonlyasked.array;

import org.testng.annotations.Test;

public class Matrix {

    @Test
    public void bruteForce() {
        // given matrix M whose transpose is to be found
        int[][] matrix = {{2, 5, 3, 8}, {12, 66, 6, 4}, {1, 16, 42, 9}};

        // find number of rows and columns in matrix M
        int n = matrix.length, m = matrix[0].length;

        System.out.println("original matrix");
        for (int[] ints : matrix) {
            for (int j = 0; j < m; j++) {
                System.out.print(ints[j] + "    ");
            }
            System.out.println();
        }

        // create empty transpose matrix of size m*n
        int[][] matrix_transpose = new int[m][n];

        // traverse matrix M
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //assign M_transpose[j][i] as M[i][j]
                matrix_transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("transposed matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix_transpose[i][j] + "    ");
            }
            System.out.println();
        }
    }


}
