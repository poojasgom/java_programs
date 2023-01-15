package Recursin;
/* ForagivenintegerarrayofsizeN.Youhavetofindalltheoccurrences(indices)ofagivenelement(Key)andprintthem.
Usearecursivefunctiontosolvethisproblem.Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2Sample Output: 1 5 7 8*/


public class FindAllOccurances {

  public static StringBuilder printAllOccurances(int[] arr, int key, int index , StringBuilder sb){
    if(index == arr.length){
      return sb;
    }

    if (arr[index] == key){
      sb.append(index);
      printAllOccurances(arr,key,index+1,sb);
    }else{
      printAllOccurances(arr, key, index+1, sb);
    }
    return sb;
  }
  public static void main(String[] args) {
    int arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
    int key = 2;
    System.out.println(printAllOccurances(arr, key, 0, new StringBuilder("")));
  }
}
