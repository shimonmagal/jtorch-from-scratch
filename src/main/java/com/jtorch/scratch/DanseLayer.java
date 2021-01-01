package com.jtorch.scratch;

public class DanseLayer {
    private final Matrix weights;

    public DanseLayer(int inputSize, int neuronSize) {
        weights = new Matrix(inputSize, neuronSize);
    }
}
