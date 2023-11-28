package cond.ex;

public class CondEx5 {

  public static void main(String[] args) {
    String grade = "A";
    String result = switch(grade){
      case "A" -> "perfect";
      case "B" -> "great";
      case "C" -> "good";
      case "D" -> "need up";
      case "F" -> "Failed";
      default -> "Wrong ";
    };
    System.out.println("result = " + result);
  }
}
