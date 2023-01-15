package ArrayList;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.util.ArrayList;

public class ListInAListMultiDimensionalList {

  public static void printListInAList(ArrayList<ArrayList> mainList){
    ArrayList<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    mainList.add(list1);
    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(3);
    list2.add(4);
    mainList.add(list2);
    ArrayList<Integer> list3 = new ArrayList<>();
    list3.add(5);
    list3.add(6);
    mainList.add(list3);

    for(int i=0;i<mainList.size();i++){
      ArrayList<Integer> currentList = mainList.get(i);
      for(int j =0;j<currentList.size();j++){
        System.out.print(currentList.get(j)+ " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    ArrayList<ArrayList> mainList = new ArrayList<>();
    printListInAList(mainList);
  }
}
