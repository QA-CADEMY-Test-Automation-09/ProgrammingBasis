package Session1.controlStructure;

public class ForEachDemo {
    public static void main(String[] args) {
        //Declaring an array
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        //Printing array using for-each loop
        for (int iterator : arr) {
            System.out.println(iterator);
            sum += iterator;
        }
        System.out.println("Total Sum:" + sum);
    }
}