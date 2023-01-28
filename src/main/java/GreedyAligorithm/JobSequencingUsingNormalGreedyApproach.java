package GreedyAligorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class JobSequencingUsingNormalGreedyApproach {

  public static void main(String[] args) {
    int[][] jobs = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

    Arrays.sort(jobs, Comparator.comparingDouble(o -> o[1]));
    ArrayList<Integer> al = new ArrayList<>();
    int time = 0;
    for(int i=jobs.length-1; i>0; i--){
      if(jobs[i][0]>time){
        time++;
        al.add(i);
      }
    }
    System.out.println("max jobs that can be done "+time);
    for(int i=0;i<al.size();i++){
      System.out.print(al.get(i)+" ");
    }
  }
}
