import java.util.Stack;

public class InfixPostfix {

    // Return operator precedence
    private static int precedence(char operator) {

        switch (operator) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;

            default:
                return -1;
        }
    }

    // Check whether character is an operator
    private static boolean isOperator(char ch) {
        return ch == '+' ||
               ch == '-' ||
               ch == '*' ||
               ch == '/' ||
               ch == '^';
    }

    public static String convert(String expression) {

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);

            // Ignore spaces
            if (Character.isWhitespace(ch)) {
                continue;
            }

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }

            // Opening parenthesis
            else if (ch == '(') {
                stack.push(ch);
            }

            // Closing parenthesis
            else if (ch == ')') {

                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }

                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
            }

            // Operator
            else if (isOperator(ch)) {

                while (!stack.isEmpty()
                        && stack.peek() != '('
                        && precedence(stack.peek()) >= precedence(ch)) {

                    result.append(stack.pop());
                }

                stack.push(ch);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String expression = "A+B*C";

        String postfix = convert(expression);

        System.out.println("Infix:   " + expression);
        System.out.println("Postfix: " + postfix);
    }
}
