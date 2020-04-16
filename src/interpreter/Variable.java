package interpreter;

import java.util.Map;

public class Variable implements Operand {
    private String name;

    public Variable(String token) {
        name = token;
    }

    @Override
    public double evaluate(Map<String, Integer> context) {
        return context.get(name);
    }

    @Override
    public void traverse(int level) {
        System.out.println("Variable: "+ name +" ");
    }
}
