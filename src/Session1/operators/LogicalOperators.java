package Session1.operators;

public class LogicalOperators {
    // Java program to illustrate Logical operators
    public static void main(String[] args) {
        int age = 19;
        String nationality = "Indian";
        int country_code = 22;

        //Using Logical AND (&&) operator
        if (age >= 18 && nationality == "Indian") {
            System.out.println("You are eligible for voting");
        }

        //Using Logical OR(||) operator
        if (age >= 18 && (nationality.equals("Indian") || country_code == 1)) {
            System.out.println("You are eligible for voting");
        }

        //Using Logical NOT(!) operator
        if (country_code != 1) {
            System.out.println("You are NOT eligible for voting!!");
        }
    }
}