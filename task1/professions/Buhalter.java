package task1.professions;

import task1.OfficeWorker;

public class Buhalter extends OfficeWorker {
    public int salary = 50000;

    public Buhalter(int salary, String sex){
        this.salary = salary;
        this.sex = sex;
    }

    public void getSalary(int _salary){
        System.out.println("Buhalter get salary: " + _salary);
    }

    @Override
    public void doSomething(){
        System.out.println("Buhalter can count taxes!");
    }
}
