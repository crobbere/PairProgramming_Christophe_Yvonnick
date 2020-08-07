package be.intecbrussel.Easy;

import java.util.List;

public class NthOdd {
    public Integer getElement(List<Integer> list, Integer n){
        if (n > list.size()) return - 1;
        else return list.get(n);
    }
}
