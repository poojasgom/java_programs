package GreedyAligorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
//We are given infinite supply of denminations find min coins needed to make change for value V.
//nlogn/
public class MinCoins {

  public static void main(String[] args) {
    Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000}; //used integer to sort in reverse order
    // using comparator.
    int countOfCoins = 0;
    int amount = 590;
    ArrayList<Integer> al = new ArrayList<>();
    Arrays.sort(coins, Comparator.reverseOrder());

    for (int i = 0; i < coins.length; i++) {

      if (coins[i] <= amount) {
        while (coins[i] <= amount) {
          amount -= coins[i];
          al.add(coins[i]);
          countOfCoins++;
        }
      }
    }
    System.out.println("total coins used " + countOfCoins);
    for (int i = 0; i < al.size(); i++) {
      System.out.println(al.get(i));
    }
  }
}
