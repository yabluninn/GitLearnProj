package learner;

import java.util.Comparator;

public class IdComparator implements Comparator<Learner>{

    @Override
    public int compare(Learner o1, Learner o2) {
        Integer id1 = o1.getId();
        Integer id2 = o2.getId();
        return id1.compareTo(id2);
    }
    
}
