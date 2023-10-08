package functions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ArrayTabulatedFunctionTest {
    @Test
    public void testGetY() {
        double[] xValue = {1, 1.5, 2, 2.5, 3};
        double[] yValue = {2, 3, 4, 5, 6};
        ArrayTabulatedFunction arrayTabulatedFunction = new ArrayTabulatedFunction(xValue, yValue);

        assertEquals(2, arrayTabulatedFunction.getY((int) 1));
        assertEquals(4, arrayTabulatedFunction.getY((int) 2));
        assertEquals(6, arrayTabulatedFunction.getY(3));
    }
    @Test
    public void testGetX() {
        double[] xValue = {1, 1.5, 2, 2.5, 3};
        double[] yValue = {2, 3, 4, 5, 6};
        ArrayTabulatedFunction arrayTabulatedFunction = new ArrayTabulatedFunction(xValue, yValue);

        assertEquals(1.0, arrayTabulatedFunction.getX(0));
        assertEquals(2.5, arrayTabulatedFunction.getX(3));
        assertEquals(3.0, arrayTabulatedFunction.getX(4));
    }
    @Test
    public void testIndexOfX() {
        double[] xValue = {1, 1.5, 2, 2.5, 3};
        double[] yValue = {2, 3, 4, 5, 6};
        ArrayTabulatedFunction arrayTabulatedFunction = new ArrayTabulatedFunction(xValue, yValue);

        assertEquals(2, arrayTabulatedFunction.indexOfX(2.0));
        assertEquals(4, arrayTabulatedFunction.indexOfX(3.0));
        assertEquals(-1, arrayTabulatedFunction.indexOfX(4.5));
    }
}
