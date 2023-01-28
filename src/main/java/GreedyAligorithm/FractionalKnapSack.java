package GreedyAligorithm;

import java.util.Arrays;
import java.util.Comparator;

//given the weights and values of N items, put these items in a knapsack of capacity W to get the
// max totalvalue in the knapsack
public class FractionalKnapSack {

  public static void main(String[] args) {

    int[] values = {60, 100, 120};
    int[] weight = {10, 20, 30};
    int W = 50;

    double ratio[][] = new double[values.length][2];
//0th col is index and 1st col is ratio.

    for (int i = 0; i < values.length; i++) {
      ratio[i][0] = i;
      ratio[i][1] = (values[i] / (double) weight[i]);
    }

    //Sort the array in ascending order
    Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

    int capacity = W;
    int finalVal = 0;
    //but we need descending as we need highest ratio first
    for (int i = ratio.length - 1; i >= 0; i--) {
      int index = (int) ratio[i][0]; //get index of ratio
      if (capacity >= weight[index]) { //include full item
        finalVal += values[index];
        capacity -= weight[index];
      } else { //include fractional value.
        finalVal += ratio[i][1] * capacity;
        capacity = 0;
        break;
      }
    }

    System.out.println("Max Value is " + finalVal);
  }

}
