package Session2.poo.accesModfiers.dev;


import Session2.poo.accesModfiers.qa.QaClass;

public class MyClass extends QaClass {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myClassMethod();
    }

    public void myClassMethod() {
        myMethod();
    }
}
