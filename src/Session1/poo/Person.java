package Session1.poo;

public class Person { //class body starts here
    //creating the data members of the class
    String name;
    int age;

    //creating the methods of the class
    void eat() {
        System.out.println("eat");
    }

    void study() {
        System.out.println("Study");
    }

    void play() {
        System.out.println("Play");
    }


    public static void main(String[] args) {
        Person firstPerson = new Person();
        System.out.println("Name of the person: " + firstPerson.name);
        System.out.println("Age of the person: " + firstPerson.age);
        firstPerson.play();
        firstPerson.study();
        firstPerson.eat();
    }
}
