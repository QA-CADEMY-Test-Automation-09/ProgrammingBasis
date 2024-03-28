package Session2.exceptionHandling;

public class ThrowKeyword {
    int division(int num1, int num2)  throws ArithmeticException{
        int result = num1 / num2;
        return result;
    }

    public static void main(String[] args)  {
        ThrowKeyword obj = new ThrowKeyword();
        try {
            System.out.println(obj.division(18, 0));
        } catch (ArithmeticException ae) {
            System.out.println("You cannot divide a number by zero");
        }
    }
}
