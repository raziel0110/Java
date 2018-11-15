public class Calculator {
    private double result;

    public static void main(String... args){


        double a, b, c = 0;
        char operator;
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[2]);
        operator = args[1].charAt(0);

        Calculator calculator = new Calculator();

        calculator.compute(a, b, operator);
        c = calculator.getResult();
        System.out.println(args[0] + " " + args[1] + " " + args[2]);
        System.out.println(c);

    }

    public void compute(double a, double b, char operator){
        double c = 0;
        switch (operator){
            case '+':
                result = a + b;
                break;

            case '-':
                result = a - b;
                break;

            case '*':
                result = a * b;
                break;

            case '/':
                if(b != 0){
                    result = a / b;
                }else {
                    System.out.println("Exceptie");
                }
                break;

        }
        //return c;
    }
    public double getResult() {
        return result;
    }
}
