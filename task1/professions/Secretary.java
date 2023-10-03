package task1.professions;

import task1.OfficeWorker;

public class Secretary extends OfficeWorker{
    public int salary = 30000;

    public Secretary(int salary, String sex){
        this.salary = salary;
        this.sex = sex;
    }

    public void getSalary(int _salary){
        System.out.println("Secretary get salary: " + _salary);
    }

    @Override
    public void doSomething(){
        System.out.println("Secretary can print documents!");
    }
}
