package Stacks;

import java.util.Stack;

//always when we pop elements in stack it comes out in reverse order of entry. we will use this
// approach.
//Push each char to stack , and then pop out and print.
public class ReverseStringUsingStack {

  public static String reverseString(String str){
    Stack<Character> s = new Stack<>();
    int index = 0;
    while (index<str.length()){
      s.push(str.charAt(index));
      index++;
    }
    StringBuilder result = new StringBuilder();
    while (!s.isEmpty()){
    result.append(s.pop());}

   return result.toString();
  }
  public static void main(String[] args){
    String s1 = "hello world";
    String result = reverseString(s1);
    System.out.println(result);
  }
}
