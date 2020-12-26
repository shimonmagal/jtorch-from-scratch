package com.jtorch.scratch;

public class Matrix {
    private final double[][] matrixArray;

    public Matrix(double[][] matrix)
    {
        this.matrixArray = matrix;
    }


    public Matrix multiply(Matrix matrix2) {
        int matrix1Cols = this.matrixArray.length;
        int matrix2Rows = matrix2.matrixArray[0].length;
        int matrix1Rows = this.matrixArray[0].length;

        double[][] matrixResult = new double[matrix1Cols][matrix2Rows];
        for(int i = 0; i < matrix1Cols; i++) {

            for (int j = 0; j < matrix2Rows; j++) {
                for (int k = 0; k < matrix1Rows; k++) {

                    matrixResult[i][j] += this.matrixArray[i][k] * matrix2.matrixArray[k][j];
                }
            }
        }

        return new Matrix(matrixResult);
    }
}
