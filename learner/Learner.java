package learner;

import core.Core;
import core.Person;
import core.Tech;

public class Learner extends Person {
    private String name;
    private int age;
    private Tech tech;

    {
        this.id = Core.random(0, 1000);
    }

    public Learner(String name, int age, Tech tech){
        this.name = name;
        this.age = age;
        this.tech = tech;
    }

    public void learn(){
        System.out.println("Learner " + this.name + " is learning " + this.tech.name() + " now!");
    }

    public void switchTech(Tech newTech){
        if (this.tech != newTech){
            Tech tempTech = this.tech;
            this.setTech(newTech);
            System.out.println("Learner " + this.name + " is switched " + tempTech.name() + " to " + newTech.name());
        }
        else if(this.tech == newTech){
            System.out.println("Learner " + this.name + " already learn " + this.tech.name());
        }
    }

    public String getName(){
        return this.name;
    }
    public void setName(String value){
        this.name = value;
    }
    
    public int getAge(){
        return this.age;
    }
    public void setAge(int value){
        if (value > 0){
            this.age = value;
        }
    }
    
    public Tech getTech(){
        return this.tech;
    }
    public void setTech(Tech value){
        this.tech = value;
    }

    public int getId(){
        return this.id;
    }

    @Override
    public String toString(){
        return "Id: " + this.id + " Name: " + this.name + " Age: " + this.age + " Tech: " + tech.name();
    }

    public void speak(String message){
        System.out.println(String.format("Learner %s say %s", this.name, message));
    }

    @Override
    public void run(){
        System.out.println("Learner " + this.name + " is running now!");
    }

    @Override
    public int hashCode(){
        return this.name.hashCode();
    }
}
