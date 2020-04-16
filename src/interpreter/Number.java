package interpreter;

import java.util.Map;

public class Number implements Operand {

    private double value;

    public Number(double value) {
        this.value = value;
    }

    @Override
    public double evaluate(Map<String, Integer> context) {
        return value;
    }

    @Override
    public void traverse(int level) {
        System.out.println("Number: " + value + " ");
    }
}
