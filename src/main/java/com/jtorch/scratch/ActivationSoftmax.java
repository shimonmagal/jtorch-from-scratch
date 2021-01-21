package com.jtorch.scratch;

public class ActivationSoftmax {
    public Matrix forward(Matrix matrix)
    {
        Matrix newMatrix = matrix.substractMax();

        Matrix expMatrix =  Matrix.pow(Math.E, newMatrix);

        int len = expMatrix.length();

        double expSum = 0;

        for (int i = 0 ; i < len ; i++) {
            expSum += expMatrix.get(0, i);
        }

        return expMatrix.div(expSum);
    }
}
