package com.jtorch.scratch;

public class Softmax {
    public Matrix forward(Matrix matrix)
    {
        Matrix expMatrix =  Matrix.pow(Math.E, matrix);

        int len = expMatrix.length();

        double expSum = 0;
        for (int i = 0 ; i < len ; i++) {
            expSum += expMatrix.get(0, i);
        }

        return expMatrix.div(expSum);
    }
}
