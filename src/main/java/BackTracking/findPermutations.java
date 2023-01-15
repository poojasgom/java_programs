package BackTracking;
//SC = n*n!
//ab = ab, ba
public class findPermutations {

  public static void getAllPermutation(String mainString, String answerString){
    if(mainString.length()==0){
      System.out.println(answerString);
      return ;
    }
    // Choice to be there in the current position
    //Recursion.
    for(int i=0;i<mainString.length();i++){
      char curr = mainString.charAt(i);
      //remove char i from the selection , abcde  = remove c = ab + de
   String newString= mainString.substring(0, i) + mainString.substring(i+1,
       mainString.length());
     getAllPermutation(newString,answerString+curr);
    }
}



  public static void main(String[] args) {
    String new1 = "ab";
    getAllPermutation("ab","");
  }
  }
