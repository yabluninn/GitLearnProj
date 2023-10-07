// import core.Tech;
// import learner.Learner;

// import task2.CountriesDirectory;
// import java.util.Arrays;

// import dependency_inversion.DogZoo;
// import dependency_inversion.Poodle;
// import dependency_inversion.Shepherd;
// import dependency_inversion.Terier;
// import task3.Airplane;
// import task3.Duck;
// import task3.Fish;
// import task3.Flyable;
// import task3.Swimmable;

import core.exceptions.CarFuelException;

public class Main {
    public static void main(String[] args) throws CarFuelException {
        // Learner fLearner = new Learner("Artem Yablunin", 19, Tech.Unity);
        // System.out.println(fLearner.toString());
        
        // System.out.println("");
        
        // fLearner.learn();

        // fLearner.switchTech(Tech.Android);

        // fLearner.speak("Hello from Mariupol!");

        // Learner sLearner = new Learner("John Doe", 30, Tech.Python);
        // System.out.println(sLearner.toString());

        // sLearner.run();
        
        // sLearner.showEatAbility();

        // CountriesDirectory countriesDirectory = new CountriesDirectory();
        // System.out.println("Argentina population is: " + countriesDirectory.argentina.getPopulation());
        // System.out.println("France language is: " + countriesDirectory.france.getLanguage());
        // System.out.println("Italy continent is: " + countriesDirectory.italy.getContinent());

        // Fish fish = new Fish();
        // Duck duck = new Duck();
        // Airplane airplane = new Airplane();

        // Swimmable[] pool = new Swimmable[2];
        // pool[0] = fish;
        // pool[1] = duck;

        // Flyable[] sky = new Flyable[2];
        // sky[0] = duck;
        // sky[1] = airplane;

        // System.out.println("Pool: " + Arrays.toString(pool));
        // System.out.println("Sky: " + Arrays.toString(sky));

        // Poodle poodle = new Poodle();
        // Shepherd shephed = new Shepherd();

        // Terier terier = new Terier();

        // DogZoo dogZoo = new DogZoo(poodle, shephed);
        // DogZoo dogZoo2 = new DogZoo(poodle, terier);

        // int a = 2;
        // int b = 0;

        // try {
        //     System.out.println(a/b);
        // } catch (Exception e) {
        //     System.out.println("Error: " + e.getMessage());

        //     throw new ArithmeticException("New arithmetic exception!");
        // } finally{
        //     System.out.println("Something message");
        // }

        // throw new Exception("Ой ошибка!");


        // Checked exceptions
        startCar(0);

        System.out.println("Car drive successful!");
    }

    public static void startCar(int fuel) throws CarFuelException{
        checkFuel(fuel);
        System.out.println("Car has enough fuel!");
    }
    
    public static void checkFuel(int fuel) throws CarFuelException{
        if (fuel <= 0){
            //System.out.println("Error!");
            throw new CarFuelException("Not enough fuel! Current fuel: " + fuel);
        }
    }
}
