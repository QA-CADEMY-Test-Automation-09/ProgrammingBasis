package Session2.poo.polymorphism.overloading;

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        int intVar1 = 15;
        int intVar2 = 7;
        double doubleVar1 = 14.5;
        double doubleVar2 = 18.3;
        int result1 = minFunction(intVar1, intVar2);
        // same function name with different parameters
        double result2 = minFunction(doubleVar1, doubleVar2);

        System.out.println("The minimum value of integer types = " + result1);
        System.out.println("The minimum value of double types = " + result2);
    }


    // for integer
    public static int minFunction(int n1, int n2) {
        return Math.min(n1, n2);
    }

    // for double
    public static double minFunction(double n1, double n2) {
        return Math.min(n1, n2);
    }

    public static double minFunction(double n1, double n2, double n3) {
        return Math.min(n1, n2);
    }

    public static String minFunction(double n1, double n2, String word) {
        return word.concat(String.valueOf(Math.min(n1, n2)));
    }
}