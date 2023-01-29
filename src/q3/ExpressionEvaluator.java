package q3;
import java.util.Stack;

public class ExpressionEvaluator {
    public double evaluate(String expression) throws Exception {
        // Convert the expression to postfix
        Stack<String> postfix_tokens = new Stack<String>();
        Stack<Character> operators = new Stack<Character>();
        String num = "";
        for (int i = 0; i < expression.length(); i++) {
            if (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.' || expression.charAt(i) == ' ') {
                num += expression.charAt(i);
            }
            else if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*' || expression.charAt(i) == '/') {
                    if (num != "") {
                        postfix_tokens.push(num);
                        num = "";
                    }
                    while (!operators.isEmpty() && (operators.peek() == '*' || operators.peek() == '/')) {
                        postfix_tokens.push(operators.pop().toString());
                    }
                    operators.push(expression.charAt(i));
            }
        }
        if (num != "") postfix_tokens.push(num);
        while (!operators.isEmpty()) postfix_tokens.push(operators.pop().toString());

        // Evaluate the postfix expression
        Stack<Double> operands = new Stack<Double>();
        System.out.println(postfix_tokens.toString());
        for(String token : postfix_tokens) {
            if (token.equals("+")) {
                operands.push(operands.pop() + operands.pop());
            }
            else if (token.equals("-")) {
                operands.push(- operands.pop() + operands.pop());
            }
            else if (token.equals("*")) {
                operands.push(operands.pop() * operands.pop());
            }
            else if (token.equals("/")) {
                operands.push(1 / (operands.pop() / operands.pop()));
            }
            else {
                operands.push(Double.parseDouble(token));
            }
        }

        return operands.pop();
    }
}
