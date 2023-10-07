package functions;
import org.junit.Test;
import junit.framework.Assert;
public class CompositeFunctionTest {

    MathFunction cos2xFunc = new Cos2xFunction();
    MathFunction sqrFunc = new SqrFunction();
    MathFunction unitFunc = new UnitFunction();
    MathFunction test3 = new CompositeFunction(sqrFunc, cos2xFunc);
    MathFunction test4 = new CompositeFunction(cos2xFunc, unitFunc);
    @Test
    public void TestEquals(){
        Assert.assertEquals(0.1, test3.apply(0));
        Assert.assertEquals(1.1, test4.apply(0));
    }

}
