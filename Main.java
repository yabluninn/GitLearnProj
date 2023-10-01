import core.Tech;
import learner.Learner;

public class Main {
    public static void main(String[] args) {
        Learner fLearner = new Learner("Artem Yablunin", 19, Tech.Android);
        System.out.println(fLearner.toString());
        
        System.out.println("");
        
        fLearner.learn();
    }
}
