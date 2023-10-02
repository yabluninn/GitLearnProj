import core.Tech;
import learner.Learner;

public class Main {
    public static void main(String[] args) {
        Learner fLearner = new Learner("Artem Yablunin", 19, Tech.Unity);
        System.out.println(fLearner.toString());
        
        System.out.println("");
        
        fLearner.learn();

        fLearner.switchTech(Tech.Android);
    }
}
