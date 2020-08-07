package be.intecbrussel.Moderate;

public class PrimeNumber {
    public Boolean isPrime(Integer n) {
        for (int i = 2; i < n; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
}
