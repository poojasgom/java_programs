package Queues;

//Approach :
// Make freq array to track freq of chars
// Make queue to insert all chars to quue.
// loop until the length o fstring andfor each char add it to queue, increase teh
// frequency of char in that freq array, remove elements from Queue until u find char whosefreq
// is =1 , which ever is 1 for the first time in iteration then it becomes  firstNon repeatng in
// that iteratuin, if there is none that is having 1 freq then we return -1;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNoNRepeatingLetter {

  public static void printFirstNonRepating(String str){
    int freq[] = new int[26];
    Queue<Character> q1 = new LinkedList<>();

    for(int i=0;i<str.length();i++){
      char ch = str.charAt(i);
      q1.add(ch);
      freq[ch-'a']++;

      while(!q1.isEmpty() && freq[q1.peek()-'a']>1){
        q1.remove();
      }

      if(q1.isEmpty()){
        System.out.println(-1);
      }else{
        System.out.println(q1.peek()+"  ");
      }
    }
    System.out.println();
  }

  public static void main(String[] args) {
String str = "aabccxb";
    printFirstNonRepating(str);
  }

}
