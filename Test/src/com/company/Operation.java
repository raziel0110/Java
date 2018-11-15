package com.company;

import java.util.Scanner;

public class Operation {
    private int result;
    public static void main(String[] args) {
        int c;
        System.out.println("Enter number one:");
        int numberOne = new Scanner(System.in).nextInt();
        System.out.println("Enter number two");
        int numberTwo = new Scanner(System.in).nextInt();

        Scanner read = new Scanner(System.in);
        char operator = read.next().trim().charAt(0);

        System.out.println(numberTwo);System.out.println(numberOne);System.out.println(operator);

        Operation calculator = new Operation();

        c = calculator.compute(numberOne,numberTwo,operator);

        c = calculator.getResult();
    }

    public void compute(int a,int b,char operator ){
        int c = 0;
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

    }

    public int getResult(){
        return result;
    }

}
