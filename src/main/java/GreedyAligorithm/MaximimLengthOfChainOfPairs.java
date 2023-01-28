package GreedyAligorithm;

import java.util.Arrays;
import java.util.Comparator;

//nlogn
//you are given n pairs of numbers. In every pair the first is smalled tham 2nd. A pair(c,d) can
// come after (a,b) if b<c. Find the longest chain that can be formed from a given set of pairs.
public class MaximimLengthOfChainOfPairs {

  public static void main(String[] args) {

    int[][] pairs = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

    //Sort the array on 2nd value as its said that b<c 1st is start and 2nd is end.
    Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

    int maxLengthOfChain = 0;
    int chainEnd = pairs[0][1];
    int chainStart = pairs[0][0];
    for (int i = 1; i < pairs.length; i++) {
      if (pairs[i][0] > chainEnd) {
        maxLengthOfChain++;
        chainEnd = pairs[i][1];
      }
    }
    System.out.println("Max pairs " + maxLengthOfChain);
  }
}
