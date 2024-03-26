package Session1.stringMethod;

public class SubStringsBeginEnd {
    public static void main(String[] args) {
        String sentence = "Welcome to QAcademy Course on Java Strings";
        String subString1 = sentence.substring(11, 21);
        String subString2 = sentence.substring(22, 30);
        System.out.println("The Substring within the range is: " + subString1);
        System.out.println("The Substring within the range is: " + subString2);
    }
}
