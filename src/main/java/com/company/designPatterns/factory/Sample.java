package com.company.designPatterns.factory;

import java.util.HashMap;
import java.util.Map;

public class Sample {
    public static void main(String[] args) {
        System.out.println(OperatorFactory.operator.get("Add").calculate(12.00, 4.00));
    }
}

class OperatorFactory {
    static Map<String, Operation> operator = new HashMap<>();

    static {
        operator.put("Add", new Addition());
        operator.put("Subtraction", new Subtraction());
        operator.put("Multiplication", new Multiplication());
        operator.put("Division", new Division());
    }

    Operation getOperation(String operation) {
        return operator.get(operation.toUpperCase());
    }
}

interface Operation {
    Double calculate(Double num1, Double num2);
}

class Addition implements Operation {
    @Override
    public Double calculate(Double num1, Double num2) {
        return num1 + num2;
    }
}

class Subtraction implements Operation {
    @Override
    public Double calculate(Double num1, Double num2) {
        return num1 - num2;
    }

}

class Multiplication implements Operation {
    @Override
    public Double calculate(Double num1, Double num2) {
        return num1 * num2;
    }

}

class Division implements Operation {
    @Override
    public Double calculate(Double num1, Double num2) {
        return num1 / num2;
    }

}
