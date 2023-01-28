package GreedyAligorithm;

import java.util.Arrays;
import java.util.Collections;

public class ChocolaOrChessBoardProblem {

  public static void main(String[] args) {

    int n = 4, m = 6; //no of rows and cols.

    Integer[] costVertical = {2, 1, 3, 1, 4}; //m-1;
    Integer[] costHorizontal = {4, 1, 2};

    //sort in descending order as we need max cost to be cut first.
    Arrays.sort(costHorizontal, Collections.reverseOrder());
    Arrays.sort(costVertical, Collections.reverseOrder());

    int h = 0, v = 0; //pointer to array
    int hp = 1, vp = 1; // no of pieces
    int cost = 0; //fnal cost.
    //Loop thru elements and find cost
    while (h < costHorizontal.length && v < costVertical.length) {
      //find which is highest and make that cut first
      if (costHorizontal[h] >= costVertical[v]) { // do the horizontal cut
        cost += (costHorizontal[h] * vp); //cost f 1 hor piece * no of vertical piece it pass thru.
        hp++;
        h++;
      } else {
        cost += (costVertical[v] * hp);
        vp++;
        v++;
      }
    }

    //if there are more horizontal costs left in array
    while (h < costHorizontal.length) {
      if (costHorizontal[h] >= costVertical[v]) { // do the horizontal cut
        cost += (costHorizontal[h] * vp); //cost f 1 hor piece * no of vertical piece it pass thru.
        hp++;
        h++;
      }
    }
      //if there are more vert pieces left.
      while (v < costVertical.length) {
        {
          cost += (costVertical[v] * hp);
          vp++;
          v++;
        }
      }
    System.out.println("Final Cost is "+cost);
  }
}
