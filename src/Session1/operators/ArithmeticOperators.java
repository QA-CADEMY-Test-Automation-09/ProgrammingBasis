package Session1.operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int operand1 = 100, operand2 = 20;
        String stringName1 = "QAcademy", stringName2 = " Java Tutorial";

        // using + operator with strings will concatenate the 2 strings
        System.out.println("Welcome to " + stringName1 + stringName2);

        // using addition + operator
        System.out.println("Adding(+) two operands: " + (operand1 + operand2));
        // using subtraction - operator
        System.out.println("Subtracting(-) two operands: " + (operand1 - operand2));
        // using multiplication * operator
        System.out.println("Multiplying(*) two operands: " + (operand1 * operand2));
        // using division / operator
        System.out.println("Dividing(/) two operands: " + (operand1 / operand2));
        // using modulus % operator
        System.out.println("Modulus(%) of two operands: " + (operand1 % operand2));
    }
}