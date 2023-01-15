public class sortAnArray {

  public static void main(String[] args) {
    int[] c = {10, 3, 22, 98, 0};
    sortMyArray(c);
    printMyArray(c);
  }

  private static void sortMyArray(int[] c) {
    for (int i = 0; i < c.length; i++) {
      for(int j =i+1;j<c.length;j++)
        if (c[i] > c[j]) {
          int temp = c[i];
          c[i] = c[j];
          c[j] = temp;
        }
      }
    }


  private static void printMyArray(int[] c) {
    for (int i = 0; i < c.length; i++) {
      System.out.println(c[i]);
    }
  }
}

