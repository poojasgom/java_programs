package GreedyAligorithm;

import java.util.ArrayList;
import java.util.Collections;

public class JObSequencingUsingObjects {

  public static class Jobs {

    int deadline;
    int profit;
    int index;

    public Jobs(int d, int p, int i) {
      this.deadline = d;
      this.profit = p;
      this.index = i;
    }
  }

  public static void main(String[] args) {
    int jobsInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};
    Jobs jobs[] = new Jobs[jobsInfo.length]; //array type object of class
    ArrayList<Jobs> al = new ArrayList<Jobs>();
    for (int i = 0; i < jobs.length; i++) {
      al.add(new Jobs(i, jobsInfo[i][0], jobsInfo[i][1]));
    }

    //sort an object in desc order. if asc is needed then obj1-obj2.
    Collections.sort(al, (obj1, obj2) -> obj2.profit - obj1.profit);

    ArrayList<Integer> newList = new ArrayList<>();
    int time = 0;
    for (int i = 0; i < al.size(); i++) {
      Jobs curr = al.get(i);
      if (time < curr.deadline) {
        time++;
        newList.add(curr.index);
      }
    }
    System.out.println("Max jobs that can be performed" + time);
    for (int i = 0; i < newList.size(); i++) {
      System.out.print(newList.get(i) + " ");
    }
  }
}
