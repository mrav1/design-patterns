package interpreter;

import java.util.Map;

public class Expression implements Operand {

    private char operation;

    public  Operand left, right;

    public Expression(char operation){
        this.operation = operation;
    }

    @Override
    public double evaluate(Map<String, Integer> context) {
        double result = 0;
        double a = left.evaluate(context);
        double b = right.evaluate(context);
        if (operation == '+') {
            result = a + b;
        }
        if (operation == '-') {
            result = a - b;
        }
        if (operation == '*') {
            result = a * b;
        }
        if (operation == '/') {
            result = a / b;
        }
        return result;
    }

    @Override
    public void traverse(int level) {
        left.traverse(level +1);
        System.out.print("Expression: level=" + level +", operation="+ operation + " ");
        right.traverse(level+1);
    }

}
