import java.util.HashMap;
import java.util.Map;
//approach - always the left element will be higher or equal to  right in roman numbers. So if left>right = add it to right else subtract from right.
public class RomanToNumeral {

  public static void main(String[] args) {
    System.out.println(romanToInt("XXX"));
  }

    public static int romanToInt(String s) {
      Map<Character, Integer> hm = new HashMap<Character, Integer>();
      hm.put('I',1);
      hm.put('V', 5);
      hm.put('X', 10);
      hm.put('L', 50);
      hm.put('C',100);
      hm.put('D', 500);
      hm.put('M', 1000);

      int result = 0;

char[] mychr  = s.toCharArray();
      for(int i=0;i<s.length();i++) {
        if (i + 1 != s.length()) {
          if (hm.get(mychr[i]) >= hm.get(mychr[i + 1])) {
            result += hm.get(mychr[i]);
          } else {
            result -= hm.get(mychr[i]);
          }
        }else{
          result += hm.get(mychr[i]);
        }
      }
      return result;
    }



  }