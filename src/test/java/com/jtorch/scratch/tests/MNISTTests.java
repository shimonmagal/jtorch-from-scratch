package com.jtorch.scratch.tests;

import com.jtorch.scratch.DanseLayer;
import com.jtorch.scratch.Matrix;
import org.junit.jupiter.api.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.File;
import java.io.IOException;

public class MNISTTests {

    @Test
    public void testOnePicture() throws IOException {
        File f = new File("./src/test/resources/MNIST/0/1.png");
        Matrix input = new Matrix(1, 28*28);

        BufferedImage bufferedImage = ImageIO.read(f);
        byte[] pixels = ((DataBufferByte) bufferedImage.getRaster().getDataBuffer()).getData();

    // we need to convert to grayscale - todo

        DanseLayer layer1 = new DanseLayer(28 * 28, 32);
        layer1.forward(input);
    }
}
