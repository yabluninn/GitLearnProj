package core;

public abstract class Person {
    protected int id;

    public abstract void speak(String msg);

    public void run(){
        System.out.println("Person is running now!");
    }

    public final void showEatAbility(){
        System.out.println("Person can eat!");
    }
}