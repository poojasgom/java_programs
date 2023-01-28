package GreedyAligorithm;

/*
Kth largest odd number in a given range
WehavetwovariablesLandR,
indicatingarangeofintegersfromLtoRinclusive,andanumberK,thetaskistofindKthlargestoddnumber.
IfK>numberofoddnumbersintherangeL to R then return 0.
Sample Input 1: L = -3, R = 3, K = 1Sample Output 1: 3
 */
public class kthLargestOddNumberInARange {

  public static void main(String[] args) {
    int L = -3;
    int R = 3;
    int k = 1;
    int odd = 0; int i=1;
    //find the # of odd nos b/w L to R.
    while (L!=R){
      if(L%2 !=0){ //odd
        odd++;
      }
      L++;
    }
    if(k>odd){
      System.out.println(0);
    }else{
      System.out.println(odd);
    }
  }
}
