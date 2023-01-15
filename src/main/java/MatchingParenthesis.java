import sun.misc.ASCIICaseInsensitiveComparator;

public class MatchingParenthesis {

  public static void main(String[] args) {
    System.out.println(isValid("()(){}{}"));
  }

    public static boolean isValid(String s) {
      for(int i=0,j=1;i<s.length() && j<=s.length();i++,j++ ){
        System.out.println(i);
        System.out.println(j);
        System.out.println((int)s.charAt(i) );
        System.out.println(((int)s.charAt(j)));

        if((int)s.charAt(i) != ((int)s.charAt(j))-1){
          return false;
        }
i++;
        j++;
        System.out.println(i);
        System.out.println(j);
      }
      return true;
    }
  }


