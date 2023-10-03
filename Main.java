// import core.Tech;
// import learner.Learner;

// import task2.CountriesDirectory;
import java.lang.reflect.Array;
import java.util.Arrays;

import task3.Airplane;
import task3.Duck;
import task3.Fish;
import task3.Flyable;
import task3.Swimmable;

public class Main {
    public static void main(String[] args) {
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

        Fish fish = new Fish();
        Duck duck = new Duck();
        Airplane airplane = new Airplane();

        Swimmable[] pool = new Swimmable[2];
        pool[0] = fish;
        pool[1] = duck;

        Flyable[] sky = new Flyable[2];
        sky[0] = duck;
        sky[1] = airplane;

        System.out.println("Pool: " + Arrays.toString(pool));
        System.out.println("Sky: " + Arrays.toString(sky));
    }
}
