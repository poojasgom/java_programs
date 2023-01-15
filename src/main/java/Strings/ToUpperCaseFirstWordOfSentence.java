package Strings;
//O(n)
public class ToUpperCaseFirstWordOfSentence {

  private static String toUpperCase(String str) {
    StringBuilder sb = new StringBuilder("");

    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for (int i = 1; i < str.length(); i++) {
      //when you get a space then after space is a new word and we need to make that upper case.
      if (str.charAt(i) == ' ' && i < str.length() - 1) {
        sb.append(str.charAt(i));
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));
      } else {
        sb.append(str.charAt(i));
      }
    } return sb.toString();
  }

  public static void main(String[] args) {
String str  = "hello, i am pooja ";
    System.out.println  (toUpperCase(str));
  }

}
