package stack;

public class Calculator {
    public static float resolve (Stack stack) {
        Float result = 0F;
        while(true) {
            try {
                Node operand1 = stack.pop();
                Node operator = stack.pop();
                Node operand2 = stack.pop();
                result = 0F;
                result = operate(operator, operand1, operand2);
                stack.push(String.valueOf(result));
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }
        return result;
    }

    public static float operate(Node operator,Node operand1, Node operand2) {
        switch (operator.data) {
            case "+":
                return Float.parseFloat(operand1.data) + Float.parseFloat(operand2.data);
            case "-":
                return Float.parseFloat(operand1.data) - Float.parseFloat(operand2.data);
            case "*":
                return Float.parseFloat(operand1.data) * Float.parseFloat(operand2.data);
            case "/":
                return Float.parseFloat(operand1.data) / Float.parseFloat(operand2.data);
            default:
                throw new UnsupportedOperationException("Operator not supported");
        }
    }
}
