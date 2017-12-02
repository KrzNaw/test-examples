package Calculator;


import com.google.common.base.Preconditions;

public class CalculatorImpl implements Calculator {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    @Override
    public int multi(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        Preconditions.checkArgument(b != 0, "ZERO w działaniu!!!");
        return a / b;
    }

    @Override
    public Double div(Double a, Double b) {
        Preconditions.checkArgument(a!= null, "a jest nullem");
        Preconditions.checkArgument(b!= null, "b jest nullem");
        Preconditions.checkArgument(b != 0, "ZERO w działaniu!!!");
        return a / b;
    }
}
