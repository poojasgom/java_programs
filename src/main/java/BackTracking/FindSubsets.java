package BackTracking;
//TC = O(n*2^n) SC = O(n)
// total subset for any n is 2^n
public class FindSubsets {

  public static void findSubset(String mainString, String answerString, int index){
    if(index==mainString.length()){
      if(answerString.length() == 0){
        System.out.println("null");
      }
      System.out.println(answerString);
      return;
    }
    //Each char in string has a choice to be part of subset or not.
//YES Choice (abc) -> ask a if he wants to be nonparticipatingNO("") or join (a) bc below is
// joincode  after join it repeats the program to ask b for same condition on agree it becomes ab
// and so on.
    findSubset(mainString, answerString+mainString.charAt(index),index+1);
    //on disagree the value is not added to subset
    findSubset(mainString, answerString, index+1);

  }
  public static void main(String[] args) {
String mainString = "abc";
findSubset(mainString,"",0);
  }

}
