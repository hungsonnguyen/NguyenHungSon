package Model;

public class Calculator {
    public static float calculate(float firtOperand, float secondOperand, char operator) {
        switch (operator) {
            case '+':
                return firtOperand + secondOperand;

            case '-':
                return firtOperand - secondOperand;

            case '*':
                return firtOperand * secondOperand;

            case '/':
                if (secondOperand == 0) {
                    throw new RuntimeException("Can't dive by zero");
                } else {
                    return firtOperand / secondOperand;
                }

            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
