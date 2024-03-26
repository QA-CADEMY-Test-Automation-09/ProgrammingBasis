package Session1.dataTypes;

public class ShortDataType {
    public static void main(String[] args) {
        short myShort = 32767;
        System.out.println("myShort: " + myShort);
        myShort++; // valid increment operation
        System.out.println("myShort incremented: " + myShort);
        myShort--; // valid decrement operation
        System.out.println("myShort decremented: " + myShort);
    }
}
