package task1.professions;

import task1.OfficeWorker;

public class Guard extends OfficeWorker{
    public int salary = 15000;

    public Guard(int salary, String sex){
        this.salary = salary;
        this.sex = sex;
    }

    public void getSalary(int _salary){
        System.out.println("Guard get salary: " + _salary);
    }

    @Override
    public void doSomething(){
        System.out.println("Guard can take care about safety!");
    }
}
