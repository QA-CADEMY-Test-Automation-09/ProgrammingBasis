package Session1.operators;

public class UnaryOperators
{
    // Java program to illustrate unary operators
    public static void main(String[] args)
    {
        int num1 = 10, num2 = 20, num3 = 30, num4 = 40, result;

        //using pre-increment operator
        result = ++num1;
        System.out.println("Value of pre incremented value of num1: " +result);

        //using post increment operator
        result = num2++;
        System.out.println("Value of post incremented value of num2: " +result);

        //using pre-decrement operator
        result = --num3;
        System.out.println("Value of pre decremented value of num3: " + result);

        //using post-decrement operator
        result = num4--;
        System.out.println("Value of post decremented value of num4: " +result);
    }
}
