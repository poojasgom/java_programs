package Recursin;

public class findLastOccurance {
//apprach - check rest of array first adn then look at the current element.
  public static int findlastoccurance(int[] arr, int key, int index){
    //base case
    if(index == arr.length){
      return -1;
    }
    int isfound =  findlastoccurance(arr, key, index+1);
   if(isfound!=-1){
     return isfound;
   }

//check self
   if(arr[index] == key){
     return index;
   }

   return isfound;
  }
  public static void main(String[] args) {

    int[] arr = {4,1,2,4,6,7,7,9,4};
    System.out.println(findlastoccurance(arr, 4, 0));
  }

}
