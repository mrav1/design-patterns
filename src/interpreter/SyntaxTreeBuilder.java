package interpreter;

import java.util.Stack;

public class SyntaxTreeBuilder {

    public static Operand buildSyntaxTree(String tree){
        Stack<Operand> stack = new Stack<>();
        String operations = "+-*/";
        String[] tokens = tree.split(" ");
        for(String token: tokens){
            if(operations.indexOf(token)==-1){
                Operand term;
                try {
                    term = new Number(Double.parseDouble(token));
                } catch (NumberFormatException ex){
                    term = new Variable(token);
                }
                stack.push(term);
            }
            else {
                Expression expression = new Expression(token.charAt(0));
                expression.left = stack.pop();
                expression.right = stack.pop();
                stack.push(expression);
            }
        }
        return stack.pop();
    }

}
