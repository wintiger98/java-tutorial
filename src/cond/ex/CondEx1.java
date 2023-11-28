package cond.ex;

public class CondEx1 {

  public static void main(String[] args) {
    int score = 90;
    String result = "학점은 ";
    if (score >= 90){
      result += "A";
    } else if (score >= 80) {
      result += "B";
    } else if (score >= 70) {
      result += "C";
    } else if (score >= 60) {
      result += "D";
    } else {
      result += "F";
    }
    result += "입니다.";
    System.out.println("result = " + result);
  }
}
