public class Palindrome {
    public static boolean isPalindrome(String word){
        if (word.length() <= 1){
            return true;
        }
        char first = Character.toUpperCase(word.charAt(0));
        char last = Character.toUpperCase(word.charAt(word.length()-1));
        if (first == last){
            return isPalindrome(word.substring(1,word.length()-1));
        }
        else {
            return false;
        }

    }
    public static void main(String[] args){
        System.out.println(isPalindrome("isPalindrome"));
        System.out.println(isPalindrome("AmanaplanacanalPanama"));
    }
}
