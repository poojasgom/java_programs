/*
Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string.



Example 1:

Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
Example 2:

Input: s = "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".

 */
public class PalindromicSubstrings {

  public static void main(String[] args) {
    System.out.println(countSubstrings("aba"));
  }

  public static int countSubstrings(String s) {
    if(s.length() <= 0){
      System.out.println("I AM ERE 1");
      return 0;
    }
    if(s.length() == 1){
      System.out.println("I AM ERE 2");
      return 1;
    }
    int count = 1;
    for(int i=0;i<s.length();i++){
      for(int j = i+1;j<s.length();j++){
        if(s.charAt(i)==s.charAt(j)){
          count++;
        }
      }
    }
    if(count>1){
      System.out.println(count);
      int result=1;
      for(int i=1;i<=count;i++){
        result = result*i;
      }
      System.out.println("I AM ERE 3");
      return result;
    }else{
      System.out.println("I AM ERE 4");
      return s.length();
    }

  }
}
