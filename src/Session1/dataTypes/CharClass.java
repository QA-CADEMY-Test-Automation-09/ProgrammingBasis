package Session1.dataTypes;

// char can be handled like integers
public class CharClass
{
    public static void main(String[] args)
    {
        char myChar1 = 'A';
        char myChar2 = 'B';

        System.out.println("myChar1: " +myChar1);
        System.out.println("myChar2: " +myChar2);
        myChar2++; // valid increment operation
        System.out.println("The Incremented value of myChar2: " +myChar2);
    }
}