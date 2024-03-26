package Session1.dataTypes;

public class ByteDataType {
    public static void main(String[] args) {
        byte myByte1 = 127;
        byte myByte2 = -48;
        System.out.println("Byte 1: " + myByte1);
        System.out.println("Byte 2: " + myByte2);
        myByte1++; // Looping back within the range
        System.out.println("Incremented Value of myByte1: " + myByte1);
    }
}
