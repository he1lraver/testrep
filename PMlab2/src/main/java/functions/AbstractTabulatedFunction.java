package functions;

public abstract class AbstractTabulatedFunction implements TabulatedFunction {
    protected abstract int floorIndexOfX(double x);
    protected abstract double extrapolateLeft(double x);
    protected abstract double extrapolateRight(double x);
    protected abstract double interpolate(double x, int floorIndex);
    protected int count;
    protected double interpolate(double x, double leftX, double rightX, double leftY, double rightY)
    {
        return leftY + (rightY - leftY) / (rightX - leftX) * (x - leftX);
    }

    @Override
    public double apply(double x) {
        int index = indexOfX(x);
        if (index != -1) {
            return getY(index);
        } else if (x < getX(0)) {
            return extrapolateLeft(x);
        } else if (x > getX(getCount() - 1)) {
            return extrapolateRight(x);
        } else {
            int floorIndex = floorIndexOfX(x);
            return interpolate(x, floorIndex);
        }
    }
}
