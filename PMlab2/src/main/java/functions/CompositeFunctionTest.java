package functions;
import org.junit.Test;
import junit.framework.Assert;
public class CompositeFunctionTest {

    MathFunction lnFunc = new LnFunction();
    MathFunction sqrFunc = new SqrFunction();
    MathFunction test3 = new CompositeFunction(sqrFunc, lnFunc);
    @Test
    public void TestEquals(){
        Assert.assertEquals(1.0, test3.apply(1));
    }

}