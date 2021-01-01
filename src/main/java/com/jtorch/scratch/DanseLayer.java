package com.jtorch.scratch;

public class DanseLayer {
    private final Matrix weights;
    private final Matrix biases;

    public DanseLayer(int inputSize, int neuronSize) {
        weights = new Matrix(inputSize, neuronSize);
        biases = new Matrix(1, neuronSize);
    }
}
