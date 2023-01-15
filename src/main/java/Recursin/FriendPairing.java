package Recursin;
//3 ppl = 1 indiv + 3 ways (ab)c (ac)b a(bc)
public class FriendPairing {

  public static int friendPair(int n){

    //base case
    if(n==1 || n==2){
      return n;
    }
    //choice
    //Single
    int single = friendPair(n-1);

    //double
    int couple = friendPair(n-2);
    int pairWays = couple * friendPair(n-1); // one person can be paired with n-1 ppl.

    int totalPair = single+pairWays;
    return totalPair;
  }
  public static void main(String[] args) {
    System.out.println(friendPair(3));
  }
}
