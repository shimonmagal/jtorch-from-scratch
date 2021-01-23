package com.jtorch.scratch;

public class DanseLayer {
    private final Matrix weights;
    private final Matrix biases;
    private Matrix output;

    public DanseLayer(int inputSize, int neuronSize) {
        weights = new Matrix(inputSize, neuronSize);
        weights.randomize();

        biases = new Matrix(1, neuronSize);
    }

    public void forward(Matrix inputs)
    {
        output = inputs.multiply(weights).add(biases);
    }
}
