package com.company.lambda;

/**
 * Created by user on 18-Apr-17.
 */
public class LambdaExpression_01 {
    public static void main(String args[]){
        LambdaExpression_01 tester = new LambdaExpression_01();

        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        //with parenthesis
        GreetingService greetService1 = message -> System.out.println("Demo " + message);

        //without parenthesis
        GreetingService greetService2 = (message) -> System.out.println("Demo " + message);

        greetService1.sayMessage("Mahesh");
        greetService2.sayMessage("Suresh");
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }


}

/**
 * Lambda expressions are used primarily to define inline implementation of a functional interface, i.e.,
 * an interface with a single method only. In the above example, we've used various types of lambda
 * expressions to define the operation method of MathOperation interface. Then we have defined the
 * implementation of sayMessage of GreetingService.
 *
 *
 * Lambda expression eliminates the need of anonymous class and gives a very simple yet powerful functional
 * programming capability to Java.
 *
 * https://www.tutorialspoint.com/java8/java8_lambda_expressions.htm
 * */