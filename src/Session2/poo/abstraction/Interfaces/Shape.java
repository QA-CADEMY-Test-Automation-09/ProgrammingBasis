package Session2.poo.abstraction.Interfaces;

interface Shape {
    int i = 5;

    String color();
    double area();
    String info();

    void defaultMethod();

    static void staticMethod(){
        System.out.println("static method");
    }
}
