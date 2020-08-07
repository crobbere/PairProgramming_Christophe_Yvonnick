package be.intecbrussel.Easy;

import java.util.List;

public class Average {
    public Double average(List<Integer> list){
        Integer sum = 0;
        for (Integer l : list){
            sum += l;
        }
        return sum.doubleValue() / list.size();
    }
}
