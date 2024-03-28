package Session2.exceptionHandling;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            array[4] = 30 / 5;
            System.out.println(array[8]);
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds");
        }
        catch(Exception e) {
            System.out.println("Parent Exception");
        }
        System.out.println("Rest code");
    }
}