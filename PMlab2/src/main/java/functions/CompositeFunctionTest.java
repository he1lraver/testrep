package functions;
import org.junit.Test;
import junit.framework.Assert;
public class CompositeFunctionTest {

    MathFunction lnFunc = new LnFunction();
    MathFunction sqrFunc = new SqrFunction();
    MathFunction cos2Func = new Cos2xFunction();
    MathFunction test3 = new CompositeFunction(sqrFunc, cos2Func);
    MathFunction test4 = new CompositeFunction(sqrFunc, lnFunc);
    @Test
    public void TestEquals(){
        Assert.assertEquals(0.1, test3.apply(0));
        Assert.assertEquals(1.0, test4.apply(1));
    }

}