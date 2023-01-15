package twoDimensionalArray;

import java.util.Scanner;

public class Basic2DimensionalArray {

  // search for a key in a matrix
  public static boolean isKeyPresent(int matrix[][], int key){

    for(int i = 0; i<matrix.length; i++){
      for(int j=0; j<matrix[0].length;j++){
        if(matrix[i][j] == key){
          System.out.println("Key is found at (" +i +", "+j+ ")" +"position");
          return true;
        }
      }
    }
    return false;
  }
  public static void main(String[] args) {
  int matrix[][] =  new int[3][3];
  // insert elements in matrix using scanner.
    for(int i = 0; i<matrix.length; i++){
      for(int j=0; j<matrix[0].length;j++){
        Scanner sc = new Scanner(System.in);
        matrix[i][j]=  sc.nextInt();
      }

    }

    // output the matrix
    for(int i = 0; i<matrix.length; i++){
      for(int j=0; j<matrix[0].length;j++){
        System.out.print(matrix[i][j]);
      }
      System.out.println();
    }
    isKeyPresent(matrix, 5);
  }


}
