package Recursin;

public class LengthOfString {

  public static void main(String[] args) {
    String str = "HELLO WORLD";
    System.out.println(findLength(str));
  }

  private static int findLength(String str) {

   if(str.length()==0){
     return 0;
   }

//If you need to remove the first character, use substring(1). This returns the substring without the initial character, which equals deleting the first character.
   return findLength(str.substring(1))+1;

  }
}
