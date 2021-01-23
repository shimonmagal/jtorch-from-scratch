package com.jtorch.scratch.tests;

import com.jtorch.scratch.DanseLayer;
import com.jtorch.scratch.Matrix;
import org.junit.jupiter.api.Test;

import java.io.File;

public class MNISTTests {

    @Test
    public void testOnePicture()
    {
        File f = new File("./resources/MNIST/0/1.png");
        Matrix input = new Matrix(1, 28*28);

        DanseLayer layer1 = new DanseLayer(28 * 28, 32);
        layer1.forward(input);
    }
}
