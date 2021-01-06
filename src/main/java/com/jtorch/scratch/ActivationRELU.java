package com.jtorch.scratch;

public class ActivationRELU {
    public Matrix forward(Matrix matrix)
    {
        return matrix.max(0);
    }
}
