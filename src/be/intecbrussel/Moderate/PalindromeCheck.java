package be.intecbrussel.Moderate;

public class PalindromeCheck {
    public static boolean isPalindrome(String word) {
        int half = word.length()/2;
        int len = word.length();
        String left = word.substring(0,half);
        String right = word.substring(half,len);
        String reverse = "";
        for(int i = half-1; i>0; i--){
            reverse += right.charAt(i);
        }
        if (left.equals(reverse)){
            return true;
        }
        return false;
    }
}
