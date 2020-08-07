package be.intecbrussel.Easy;

public class SumOfMultiples {
    public Integer sum(Integer n) {
        int sum = 0;
        for (int i = 3; i<=n; i++){
            if (i % 3 == 0 || i % 5 == 0) sum += i;
        }
        return sum;
    }
}
