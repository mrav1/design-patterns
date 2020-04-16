package interpreter;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class PostfixUtil {

    public static String convertToPostfix(String infixExpression) {
        Map<Character, Integer> precision = new HashMap<>();
        precision.put('*', 3);
        precision.put('/', 3);
        precision.put('+', 2);
        precision.put('-', 2);
        precision.put('(', 1);

        Stack<Character> operatorsStack = new Stack<>();
        StringBuilder postfixExpression = new StringBuilder();
        String[] tokens = infixExpression.split(" ");

        for (String token : tokens) {
            char symbol = token.charAt(0);

            if ("+-*/()".indexOf(token) == -1) {
                postfixExpression.append(token + " ");
            } else if (symbol == '(') {
                operatorsStack.push(symbol);
            } else if (symbol == ')') {
                char topSymbol = operatorsStack.pop();
                while (topSymbol != '(') {
                    postfixExpression.append(topSymbol + " ");
                    topSymbol = operatorsStack.pop();
                }
            } else {
                while (!operatorsStack.isEmpty() && precision.get(operatorsStack.peek()) >= precision.get(symbol)) {
                    postfixExpression.append(operatorsStack.pop() + " ");
                }
                operatorsStack.push(symbol);
            }
        }

        while (!operatorsStack.isEmpty()) {
            postfixExpression.append(operatorsStack.pop() + " ");
        }

        return postfixExpression.toString();
    }

}
