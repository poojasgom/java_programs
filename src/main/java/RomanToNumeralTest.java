import java.util.HashMap;
import java.util.Map;

public class RomanToNumeralTest {

  public static void main(String[] args) {
    System.out.println(getIntNumberForRoman("XXX"));
  }

  public static int getIntNumberForRoman(String s) {

    Map<Character, Integer> hm = new HashMap<Character, Integer>();
    hm.put('I', 1);
    hm.put('X', 10);
    hm.put('L', 50);
    hm.put('C', 100);
    hm.put('D', 500);
    hm.put('M', 1000);

    char[] myChar = s.toCharArray();
    int result = 0;
    for (int i = 0; i < s.length(); i++) {
      if (i != s.length()-1) {
        if (hm.get(myChar[i]) >= hm.get(myChar[i + 1])) {
          result += hm.get(myChar[i]);
        } else {
          result -= hm.get(myChar[i]);
        }
      } else {
        result += hm.get(myChar[i]);
      }
    }
    return result;
  }
}