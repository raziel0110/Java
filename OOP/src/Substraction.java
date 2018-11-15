public class Substraction extends Operator {
    @Override
    public double compute(double operand1, double operand2) {
        return operand1 - operand2;
    }

    @Override
    public boolean supportSymbol(char symbol) {
        return '-' == symbol;
    }
}
