package Strings;

//Determine if 2 Strings areanagramsof each other.What are anagrams?Iftwostringscontainthesamecharactersbutinadifferentorder,
// theycanbesaidtobeanagrams.Considerraceandcare.Inthiscase,race'
// scharacterscanbeformedintoastudy,orcare'scharacterscanbeformedintorace.Belowisajavaprogramtocheckiftwostringsare anagrams or not.
public class Anagrams {

  public static void main(String[] args) {
    String s1 = "race";
    String s2 = "case";
    System.out.println(isAnagram(s1, s2));

  }

  private static boolean isAnagram(String s1, String s2) {

    if (s1.length() == s2.length()) {
      for (int i = 0; i < s1.length(); i++) {
        int count = 1;
        for (int j = 0; j < s2.length(); j++) {
          if (s1.charAt(i) == s2.charAt(j)) {
            count++;
          }
        }

        if (count <= 1) {
          return false;
        }
        else{
          continue;
        }
      }

    }else{
      return false;
    }
    return true;
  }
}