package collections;

import java.util.*;

import core.Tech;
import learner.Learner;

public class SetExamples {

    public static void main(String[] args) {
        hashSet();
    }

    public static void hashSet(){
        Set learners = new HashSet();

        Learner fLearner = new Learner("First", 19 , Tech.Android);
        Learner sLearner = new Learner("Second", 25 , Tech.Java);
        Learner tLearner = new Learner("Third", 17 , Tech.Unity);
        Learner tcLearner = new Learner("Third", 17 , Tech.Unity);

        learners.add(fLearner);
        learners.add(sLearner);
        learners.add(tLearner);
        learners.add(tcLearner);

        Iterator iterator = learners.iterator();

        while(iterator.hasNext()){
            Learner learner = (Learner)iterator.next();
            System.out.println(learner.toString());
        }
    }
}
