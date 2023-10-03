// import core.Tech;
// import learner.Learner;

import task2.CountriesDirectory;

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

        CountriesDirectory countriesDirectory = new CountriesDirectory();
        System.out.println("Argentina population is: " + countriesDirectory.argentina.getPopulation());
        System.out.println("France language is: " + countriesDirectory.france.getLanguage());
        System.out.println("Italy continent is: " + countriesDirectory.italy.getContinent());
    }
}
