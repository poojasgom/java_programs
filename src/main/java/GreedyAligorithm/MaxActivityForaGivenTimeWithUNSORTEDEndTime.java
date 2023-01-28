package GreedyAligorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//Onlogn = due to sorting.
public class MaxActivityForaGivenTimeWithUNSORTEDEndTime {

  public static void main(String[] args) {
    int[] start = {1, 3, 0, 5, 8, 5};
    int[] end = {2, 4, 6, 7, 9, 9};

    //sort the endTime using 2D array.
  int activities[][]  = new int[start.length][3];
//first put elements in a 2D array
  for(int i=0;i<start.length;i++){
    activities[i][0] = i;
    activities[i][1] = start[i];
    activities[i][2] = end[i];
  }
  //sorting - on endtime (activities 3rd col) using comparator.
    Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));

  int maxAct = 0;
    ArrayList<Integer> indexList = new ArrayList<>();

    maxAct = 1;
    indexList.add(activities[0][0]);
    int lastEnd = activities[0][2];

    for(int i=0;i<activities.length;i++){
      if(activities[i][1] >lastEnd) {
        maxAct++;
        indexList.add(activities[i][0]);
        lastEnd = activities[i][2];
      }
    }
    System.out.println("Max activities "+maxAct);
    for (int i = 0; i < indexList.size(); i++) {
      System.out.print("A"+indexList.get(i)+" ");
    }
  }

}
