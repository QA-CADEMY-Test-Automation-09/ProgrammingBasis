package Session2.poo.inheritance.Multiple;

class Person implements Ability
{
    @Override
    public void run()
    {
        System.out.println("I can run !!");
    }
    @Override
    public void speak()
    {
        System.out.println("I can speak !!");
    }
    @Override
    public void show()
    {
        System.out.println("I am a person, I can speak and run !!");
    }
}