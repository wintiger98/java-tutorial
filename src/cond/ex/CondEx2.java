package cond.ex;

public class CondEx2 {

  public static void main(String[] args) {
    int distance = 5;
    String result;
    if (distance > 100) {
      result = "비행기";
    } else if (distance > 10){
      result = "자동차";
    } else if (distance > 1){
      result = "자전거";
    } else {
      result = "도보";
    }
    System.out.println("result = " + result);
  }
}
