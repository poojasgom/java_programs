package GreedyAligorithm;

import java.util.ArrayList;

//given a list of start and end time of activities , choose the max no of actiities that can be
// done by a person for the time. Assume that the end time is sorted.
public class MaxActivityForaGIvenTimewithSortedEndTime {

  public static void main(String[] args) {

    int[] start = {1, 3, 0, 5, 8, 5};
    int[] end = {2, 4, 6, 7, 9, 9};    //emd time is sorted.

    int maxAct = 0; // initialize with 0 as no activity is done s far.
    ArrayList<Integer> indexList = new ArrayList<Integer>(); //storing index of activties that
    // can be done.

    maxAct = 1;
    indexList.add(0);
    int lastEnd = end[0];
    for (int i = 1; i < start.length; i++) {
      if (start[i] > lastEnd) {
        maxAct++;
        indexList.add(i);
        lastEnd = end[i];
      }
    }

    System.out.println("Max activities that can be done is " + maxAct);

    for (int i = 0; i < indexList.size(); i++) {
      System.out.print("A"+indexList.get(i)+" ");
    }
  }

}
