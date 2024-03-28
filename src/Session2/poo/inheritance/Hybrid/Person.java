package Session2.poo.inheritance.Hybrid;


class Person extends Ability implements Moveable, Speakable {
    @Override
    public void run() {
        System.out.println("I can run !!");
    }

    @Override
    public void speak() {
        System.out.println("I can speak !!");
    }
}