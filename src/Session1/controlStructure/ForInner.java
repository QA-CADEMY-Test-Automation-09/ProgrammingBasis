package Session1.controlStructure;

public class ForInner {
    public static void main(String[] args) {
        //Outer loop
        for (int i = 1; i <= 5; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); //new line
        }
    }
}
