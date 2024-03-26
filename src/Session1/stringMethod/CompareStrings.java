package Session1.stringMethod;

public class CompareStrings {
    public static void main(String args[]) {
        String string1 = "Hello World";
        String string2 = "Hello World";
        int result = string1.compareTo(string2);
        System.out.println(result);

        String sentence = "Welcome ";
        result = sentence.compareTo("to QAcademy ");
        System.out.println(result);

        String sentence1 = "to QAcademy  ";
        String sentence2 = "Welcome ";
        result = sentence1.compareTo(sentence2);
        System.out.println(result);
    }
}
