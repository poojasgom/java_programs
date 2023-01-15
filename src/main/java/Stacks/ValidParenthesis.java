package Stacks;

import java.util.Stack;

public class ValidParenthesis {

  public static boolean isValidParenthesis(String s){
    Stack<Character> stack = new Stack();
    int index = 0;
    for(int i=0;i<s.length();i++) {
      if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
        stack.push(s.charAt(i));
      } else {
        if (s.isEmpty()) {
          return false;
        }
        if ((stack.peek() == '{' && s.charAt(i) == '}') || (s.charAt(i) == ')'
            && stack.peek() == '(') || (s.charAt(i) == ']' && stack.peek() == '[')) {
          stack.pop();
        } else {
          return false;
        }
      }
    }
      if(stack.isEmpty()){
        return true;
      }else{
        return false;
      }
  }

  public static void main(String[] args) {
  String str = "{{}}";
    System.out.println(isValidParenthesis(str));
  }
}
