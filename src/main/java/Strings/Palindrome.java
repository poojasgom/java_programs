package Strings;
//O(n)
public class Palindrome {

  public static void main(String[] args) {
    String str = "racecar";
    System.out.println("Is my string palindrome?"+isPalindrome(str));
  }

  private static boolean isPalindrome(String str) {
    // go to half and then start compare of first to last element

    for(int i =0; i< str.length()/2;i++){
      if(str.charAt(i) != str.charAt(str.length()-1-i)){
        return false;
      }
    }
    return true;
  }
}
