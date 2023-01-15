package Recursin;

//O(nlogn)
// 2^8 = 2^4 * 2^4 (2^n/2 * 2^n/2)
//2^5 = (2^n/2 * 2^n/2)*2
public class printxPowerNOptimized {
public static int prntPower(int x, int n){

  //BASE CASE
  if(n==0){
    return 1;
  }

  int halfPwer = prntPower(x, n/2);
if(n%2 != 0){
  return halfPwer = halfPwer*x;
}else{
  return halfPwer = halfPwer* halfPwer;
}
}

  public static void main(String[] args) {
    System.out.println(prntPower(2,4));
  }
}
