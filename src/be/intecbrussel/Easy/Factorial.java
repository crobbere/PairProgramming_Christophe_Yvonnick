package be.intecbrussel.Easy;

public class Factorial {
    public Integer factorial(Integer n){
        int temp = n;
        for (int i = n - 1; i > 0; i--){
            temp = temp * i;
        }
        return temp;
    }
}
