package functions;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IdentityFunctionTest {
    MathFunction test1 = new IdentityFunction();
    @Test
    public void testEquals(){
        Assert.assertEquals(15, test1.apply(15));
    }
}