public class Calculator {
    private double result;
    private Operator[] operators = new Operator[]{
            new Additions(),
            new Substraction(),
            new Multiply(),
            new Divide(),
            new Modulo()
    };


    public double calculate(double operand1, char symbol, double operand2){

        Operator operator = getOperatorForSymbol(symbol);
        result = operator.compute(operand1,operand2);
        return result;
    }

    private Operator getOperatorForSymbol(char symbol){
//        Operator operator = null;
//        switch(symbol){
//            case '+':
//                operator = additions;
//                break;
//            case '-':
//                operator = substraction;
//        }
        for(Operator operator : operators){
            if(operator.supportSymbol(symbol)){
                return operator;
            }
        }
        return null;
    }

    public static void main(String... args){
        Calculator calculator = new Calculator();
        double result = calculator.calculate(1, '+', 1);
        System.out.println(result);

    }
}
