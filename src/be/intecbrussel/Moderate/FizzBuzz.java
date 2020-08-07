package be.intecbrussel.Moderate;

public class FizzBuzz {
    public String fizzBuzz(Integer i) {
        String str = "";
        if(i%3 == 0) str += "Fizz";
        if(i%5 == 0) str += "Buzz";
        if(i%5 != 0 && i%3 != 0) str += Integer.toString(i);
        return str;
    }
}
