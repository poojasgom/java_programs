package Strings;

import java.util.Scanner;

public class CountLowerCaseVowels {

  public static void main(String[] args) {
    String str = "VEEneeARs";
    System.out.println(findCountOfLowerCaseVowels(str));
  }

  private static int findCountOfLowerCaseVowels(String str) {
    StringBuilder sb = new StringBuilder("");

    int count =0;

     for(int i = 0; i<str.length();i++){
       char ch = str.charAt(i);
       if(ch == 'a' ||ch == 'e' || ch == 'i' || ch =='o' || ch == 'u'){
         count ++;
       }
     }
    return count;
  }
}
