package learner;

import java.util.Comparator;

public class AgeComparator implements Comparator<Learner>{

    @Override
    public int compare(Learner o1, Learner o2) {
        Integer ageOne = o1.getAge();
        Integer ageTwo = o2.getAge();
        return ageOne.compareTo(ageTwo);
    }
    
}
