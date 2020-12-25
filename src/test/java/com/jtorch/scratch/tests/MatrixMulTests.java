package com.jtorch.scratch.tests;

import com.jtorch.scratch.MatrixMultiplication;
import org.junit.jupiter.api.Test;

public class MatrixMulTests {
    @Test
    public void aTest()
    {
        double[][] m1 = { {1, 2, 3}, {1, 2, 3} };
        double[][] m2 = { { 4, 4}, {5, 5}, {6,6}};
        double[][] res = MatrixMultiplication.multiply(m1, m2);

        System.out.println(res[0][0]);
        System.out.println(res.length);
        System.out.println(res[0].length);

    }
}
