package be.intecbrussel.Moderate;

public class GreatestCommonDiviser {
    public Integer gcd(Integer p, Integer q) {
        int great = 1;
        int len = q;
        if(p < q) {
            len = p;
        }
        for (int i = 1; i < len+1; i++) {
            if(p%i == 0 && q%i == 0){
                great = i;
            }
        }
        return great;
    }
}
