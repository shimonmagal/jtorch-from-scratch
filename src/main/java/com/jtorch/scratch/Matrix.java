package com.jtorch.scratch;

public class Matrix {
    private final double[][] matrixArray;

    public Matrix(double[][] matrix)
    {
        this.matrixArray = matrix;
    }

    public Matrix(int inputSize, int neuronSize) {
        this(new double[inputSize][neuronSize]);
    }

    public void randomize()
    {
        int cols = matrixArray.length;
        int rows = matrixArray[0].length;

        for (int i = 0 ; i < rows; i++) {
            for (int j = 0 ; j < cols; j++) {
                matrixArray[j][i] = Math.random();
            }
        }
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

    public Matrix add(Matrix matrix) {
        int cols = matrixArray.length;
        int rows = matrixArray[0].length;

        double[][] res = new double[cols][rows];

        for (int i = 0 ; i < rows; i++) {
            for (int j = 0 ; j < cols; j++) {
                res[j][i] = this.matrixArray[j][i] + matrix.matrixArray[j][i];
            }
        }

        return new Matrix(res);
    }

    public Matrix max(double val) {
        int cols = matrixArray.length;
        int rows = matrixArray[0].length;

        double[][] res = new double[cols][rows];

        for (int i = 0 ; i < rows; i++) {
            for (int j = 0 ; j < cols; j++) {
                res[j][i] = Math.max(this.matrixArray[j][i], val);
            }
        }

        return new Matrix(res);
    }

    public Matrix div(double constant) {
        int cols = matrixArray.length;
        int rows = matrixArray[0].length;

        double[][] res = new double[cols][rows];

        for (int i = 0 ; i < rows; i++) {
            for (int j = 0 ; j < cols; j++) {
                res[j][i] = this.matrixArray[j][i] / constant;
            }
        }

        return new Matrix(res);
    }

    public static Matrix pow(double constant, Matrix matrix) {
        int cols = matrix.matrixArray.length;
        int rows = matrix.matrixArray[0].length;

        double[][] res = new double[cols][rows];

        for (int i = 0 ; i < rows; i++) {
            for (int j = 0 ; j < cols; j++) {
                res[j][i] = Math.pow(constant, matrix.matrixArray[j][i]);
            }
        }

        return new Matrix(res);
    }

    public Matrix substractMax() {
        int cols = this.matrixArray.length;
        int rows = this.matrixArray[0].length;

        double maxValue = 0;

        for (int i = 0 ; i < rows; i++) {
            for (int j = 0 ; j < cols; j++) {
                if (matrixArray[j][i] > maxValue)
                {
                    maxValue = matrixArray[j][i];
                }
            }
        }

        double[][] res = new double[cols][rows];

        for (int i = 0 ; i < rows; i++) {
            for (int j = 0 ; j < cols; j++) {
                res[j][i] = matrixArray[j][i] - maxValue;
            }
        }

        return new Matrix(res);
    }

    public double get(int x, int y) {
        return matrixArray[x][y];
    }

    public int length() {
        return matrixArray[0].length;
    }
}
