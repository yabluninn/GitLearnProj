package learner;

import core.Tech;

public class Learner {
    private String name;
    private int age;
    private Tech tech;

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

    @Override
    public String toString(){
        return "Name: " + this.name + "\nAge: " + this.age + "\nTech: " + tech.name();
    }
}
