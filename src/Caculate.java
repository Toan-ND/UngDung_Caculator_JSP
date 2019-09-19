public class Caculate {
    public static float caculate(float first_operand, float second_operand, String operator) {
        switch (operator) {
            case"+":
                return first_operand + second_operand;
            case "-":
                return first_operand - second_operand;
            case "*":
                return first_operand * second_operand;
            case "/":
                if (second_operand != 0) {
                    return first_operand / second_operand;
                }
                else {
                    throw new ArithmeticException ("Không thể chia được cho 0");
                }
            default:
                throw new ArithmeticException("Không thể chia được cho 0");
        }
    }
}
