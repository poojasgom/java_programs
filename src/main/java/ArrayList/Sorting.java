package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting {

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(10);
    arr.add(15);
    arr.add(20);
    arr.add(5);
   //asc
     Collections.sort(arr);
    //desc
    Collections.sort(arr, Collections.reverseOrder());
    System.out.println(arr);
  }
}
