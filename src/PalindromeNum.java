public class PalindromeNum {
//    Given an integer x return ture if x is palindrome integer.
//    An integer is a palindrome when it reads the same backwrd as forward
    public static boolean isPalindrome(int x){
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start++) != str.charAt(end--)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(334));
    }
}
