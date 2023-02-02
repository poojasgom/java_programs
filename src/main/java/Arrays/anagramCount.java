package Arrays;

import java.util.Arrays;

public class anagramCount {

public static int anaGram(String s1, String s2 ){
  char[] schar1  = s1.toCharArray();
 Arrays.sort(schar1);
  printArray(schar1);
  char[] schar2 = s2.toCharArray();
  Arrays.sort(schar2);
  printArray(schar2);
  int count=0;
  for(int i=0, j=0;i<schar1.length && j<schar2.length;i++,j++) {
    System.out.print(s1.charAt(i));
    System.out.print(s2.charAt(j));
    if (schar1[i] != schar2[j]) {
      count++;
    }

    System.out.println();
  }
  return count;
}

public static void printArray(char[] s){
  for(int i=0;i<s.length;i++){
    System.out.print(s[i]+ " ");
  }
  System.out.println();
}
public static void main(String[] args) {
    System.out.println(anaGram("abbc", "baab"));
  }
}
