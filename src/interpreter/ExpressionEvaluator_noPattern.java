package interpreter;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ExpressionEvaluator_noPattern {

    public static void main(String[] args) {
        String infix = "C * 9 / 5 + 32";

        String postfix = PostfixUtil.convertToPostfix(infix);
        System.out.println("Infix:   " + infix);
        System.out.println("Postfix: " + postfix);
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i <= 100; i += 10) {
            map.put("C", i);
            System.out.println("C is " + i + ",  F is " + processPostfix(postfix, map));
        }

    }

    private static Double processPostfix(String postfixExpression, Map<String, Integer> context) {

        Stack<Double> stack = new Stack<>();
        String operations = "+-*/";
        String[] tokens = postfixExpression.split(" ");

        for (String token : tokens) {
            // If token is a number or variable
            char symbol = token.charAt(0);
            if (operations.indexOf(symbol) == -1) {
                double term;
                try {
                    term = Double.parseDouble(token);
                } catch (NumberFormatException ex) {
                    term = context.get(token); // if variable get value from context
                }
                stack.push(term);

            } // If token is an operator
            else {
                double b = stack.pop(), a = stack.pop();
                if (symbol == '+') {
                    a = a + b;
                }
                if (symbol == '-') {
                    a = a - b;
                }
                if (symbol == '*') {
                    a = a * b;
                }
                if (symbol == '/') {
                    a = a / b;
                }
                stack.push(a);
            }
        }

        return stack.pop();
    }

}
