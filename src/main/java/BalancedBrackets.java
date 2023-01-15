/*import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BalancedBrackets {

  public static void main(String[] args) {
    System.out.println(isBracketBalanced("123"));
  }

  public static boolean isBracketBalanced(String bracPattern){
    Stack<Character> myQueue = new Stack<>();

    for(int i=0;i<bracPattern.length();i++){
      char currentChar = bracPattern.charAt(i);
      if(currentChar == '(' || currentChar == '{' || currentChar== '['){
        myQueue.push(currentChar);
        continue;
      }

      //at this step if the queue is empty then return false
      if(myQueue.isEmpty()){
        return false;
      }

      char currChar;

        switch (currentChar){
          case ']' : currChar = myQueue.pop();
                     if(currChar == '(' || currChar== '{') return false;
                     break;
          case '}' : currChar = myQueue.pop();
                    if(currChar == '[' || currChar== '(') return false;
                    break;
          case ')' : currChar = myQueue.pop();
                    if(currChar == '[' || currChar== '{') return false;
                    break;        }
      }
      return myQueue.isEmpty();
    }
  }*/