package GreedyAligorithm;

import java.util.Arrays;
//O(nlogn) - as we sorted it.
//Given 2 arrays of equal length pair each element of Array A with Array B such that abs diff b/w
// the, is minimum.
public class MinimumSumAbsolutDifferencePairs {

  public static void main(String[] args) {

    int[] A = {4,1,8,7};
    int[] B = {2,3,6,5};

    //in diff ocurs when the distance b/w 2 nos is minimum. so we sort both arrays and then find
    // abs diff.
    Arrays.sort(A);
    Arrays.sort(B);
    int minDiff = 0;
    for(int i=0;i<A.length;i++) {
     minDiff += Math.abs(A[i]-B[i]);
    }

    System.out.println("Abs min diff is "+minDiff);
  }
}
