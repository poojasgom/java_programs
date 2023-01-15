package BackTracking;
/*
Keypad CombinationsGivenastringcontainingdigitsfrom2-9inclusive,printallpossiblelettercombinationsthatthe number could represent.
You can print the answer in any order.Amappingofdigitstoletters(justlikeonthetelephonebuttons)isgivenbelow.Notethat1does not map to any letters
 */
public class KeypadCombinations {
  final static char[][] arr = {{}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'e', 'f', 'g'}, {'h', 'i',
      'j'},
      {'k', 'l', 'm'}, {'n', 'o', 'p'}, {'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
  public static void getPossibleCombinations(String str) {

    int len = str.length();
    if(len == 0){
      return;
    }
    bfs(0, len, new StringBuilder(), str);
  }

  private static void bfs(int pos, int len, StringBuilder stringBuilder, String str) {
    if(pos == len){
      System.out.println(stringBuilder.toString());
    }
    else{
      char[] letters = arr[Character.getNumericValue(str.charAt(pos))];
      for(int i=0;i<letters.length;i++){
        bfs(pos+1, len,new StringBuilder(stringBuilder).append(letters[i]),str);
      }
    }
  }

  public static void main(String[] args) {
    getPossibleCombinations("23");

  }
}
