package Session2.exceptionHandling.customize;

import java.io.File;
import java.io.FileReader;

public class MyClass {

    public static void main(String[] args) {

        File file = new File("c://myfile.txt");
        try  {
            System.out.println("try");
            throw new MyException();
        } catch (MyException e) {
            System.out.println("catch");
            e.printException();
            e.printStackTrace();
        }
        System.out.println("after exception");
    }

















/*    public static void main (String[] args) {

        File file = new File("c://myfile.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally{
            try {
                if(fr != null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("after exception");

*//*        int myArray[] = {1, 2, 3};
        System.out.println(myArray[3]);*//*
    }*/
}
