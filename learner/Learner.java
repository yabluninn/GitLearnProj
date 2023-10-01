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

    @Override
    public String toString(){
        return "Name: " + this.name + "\nAge: " + this.age + "\nTech: " + tech.name();
    }
}
