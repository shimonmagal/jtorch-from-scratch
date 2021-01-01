package com.jtorch.scratch.tests;

import com.jtorch.scratch.Matrix;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixMulTests {
    @Test
    public void testMatrixMul()
    {
        double[][] m1 = { {1, 2, 3}, {1, 2, 3} };
        double[][] m2 = { { 1, 4}, {-3, 5}, {6,7}};
        Matrix res = new Matrix(m1).multiply(new Matrix(m2));

        Assertions.assertEquals(res.get(0,0), 13.0);
        Assertions.assertEquals(res.get(0,1), 35.0);
        Assertions.assertEquals(res.get(1,0), 13.0);
        Assertions.assertEquals(res.get(1,1), 35.0);
    }
}
