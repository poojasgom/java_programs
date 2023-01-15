package Stacks;

import java.util.Stack;

//in a balanced expression , find if the expression has unnecessary bracket.. if it does then
// give false response.
//APproach - > push all elements in stack until close bracket is found and once you find that
//remove all elements from stack until pair is found. Keep a count when removing elements . If
// count is 0 after it finds pair then that means there was no content in braces.
//O(n)
public class DuplicateParenthesis {


  private static boolean isThereADuplicateParenthesis(String str) {
    Stack<Character> stack = new Stack<>();


    for(int i=0;i<str.length();i++){
      char ch = str.charAt(i);
      if(ch!=']' || ch!= ')' || ch!='}'){
        stack.push(ch);
      }else{
        int count =0;
        while (stack.peek()!='(') {
          count++;
          stack.pop();
        }
          if(count<1){
            return false;
          }else{
            stack.pop();//opening pair found
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "((a+b)*c)"; //extra{}
    System.out.println(isThereADuplicateParenthesis(str));

  }

}
