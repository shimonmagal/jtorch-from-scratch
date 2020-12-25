package com.jtorch.scratch;

public class MatrixMultiplication {
    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        int matrix1Cols = matrix1.length;
        int matrix2Rows = matrix2[0].length;
        int matrix1Rows = matrix1[0].length;

        double[][] matrixResult = new double[matrix1Cols][matrix2Rows];
        for(int i = 0; i < matrix1Cols; i++) {

            for (int j = 0; j < matrix2Rows; j++) {
                for (int k = 0; k < matrix1Rows; k++) {

                    matrixResult[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return matrixResult;
    }
}
