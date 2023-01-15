package Recursin;

// print all binary strings of size n without consecutive ones (011 -> dont print 0010 -> valid.
public class BinaryStringsProblem {

public static void printnonConsecutiveOnes(int n, int lastPlace, String str ){
  if(n==0){
    System.out.println(str);
    return ;
  }

  if(lastPlace == 0){
    //sit 0 on chair n/
    printnonConsecutiveOnes(n-1, 0, str+"0");
    printnonConsecutiveOnes(n-1, 1, str+"1");
  }else{
    printnonConsecutiveOnes(n-1, 0, str+"0");
  }
}
  public static void main(String[] args) {
    printnonConsecutiveOnes(3, 0, "");
  }

}
