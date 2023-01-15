/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.
 */
public class LengthOfLastWord {

  public static void main(String[] args) {
String word = "HELLO WOR LD   ";
    findLengthOfLastWord(word);

  }

  private static int findLengthOfLastWord(String word) {
    int newLength = 0;
    word.trim();
    for(int i = word.length()-1; i>0;i--){
      System.out.println(word.charAt(i));
      if(!Character.isWhitespace(word.charAt(i))){
        newLength++;
      }
      else{
        break;
      }

    }
    System.out.println(newLength);
    return newLength;
  }


}
