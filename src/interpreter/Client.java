package interpreter;

import java.util.HashMap;

public class Client {

    public static void main(String[] args) {
        System.out.println("celsius * 9 / 5 + thirty");
        String postfix = PostfixUtil.convertToPostfix("celsius * 9 / 5 + thirty");
        System.out.println(postfix);
        Operand expr = SyntaxTreeBuilder.buildSyntaxTree(postfix);
        expr.traverse(1);
        System.out.println();
        HashMap< String, Integer > map = new HashMap<>();
        map.put("thirty", 30);
        for (int i = 0; i <= 100; i += 10) {
            map.put("celsius", i);
            double var = expr.evaluate(map);
            System.out.println("C is " + i + ",  F is " + var);
        }
    }

}
