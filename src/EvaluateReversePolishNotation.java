
import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        System.out.println(evaluateReversePolishNotation(new String[]{"3", "4", "-", "5", "+"}));
    }

    public static int evaluateReversePolishNotation(String[] input) {
        Stack<Integer> stack = new Stack<>();
        for (String value : input) {
            if (value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/")) {
                operators(value, stack);
            } else {
                int numericalValue = Integer.parseInt(value);
                stack.push(numericalValue);
            }
        }
        return stack.pop();
    }

    private static void operators(String value, Stack<Integer> stack) {
        int answer;
        switch (value) {
            case "+" -> {
                answer = stack.pop() + stack.pop();
                stack.push(answer);
            }
            case "-" -> {
                int firstInput = stack.pop();
                int secondInput = stack.pop();
                answer = secondInput / firstInput;
                stack.push(answer);
            }
            case "*" -> {
                answer = stack.pop() * stack.pop();
                stack.push(answer);
            }
            case "/" -> {
                int firstInput = stack.pop();
                int secondInput = stack.pop();
                answer = secondInput / firstInput;
                stack.push(answer);
            }
        }
    }

}
