package be.intecbrussel.Easy;

public class ReverseString {
    public String reverse(String s){
        char[] c = s.toCharArray();
        int start = 0;
        int end = c.length - 1;
        char temp;
        while (end > start){
            temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            end --;
            start++;
        }
        return new String(c);
    }

}
