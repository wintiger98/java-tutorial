package string;

public class StringEx {

  public static void main(String[] args) {
    String str = "apple";

    // 길이 반환
    int len = str.length();
    System.out.println("len = " + len);

    // 빈 문자열 체크
    boolean check = str.isEmpty();
    System.out.println("check = " + check);

    // 문자 찾기
    char zero = str.charAt(0);
    System.out.println("zero = " + zero);

    int indexOfA = str.indexOf('a');
    System.out.println("indexOfA = " + indexOfA);

    int indexOfLastP = str.lastIndexOf("p");
    System.out.println("indexOfLastP = " + indexOfLastP);

    // 문자 자르기
    String one2Three = str.substring(1,3);
    System.out.println("one2Three = " + one2Three);

    String three = str.substring(3);
    System.out.println("three = " + three);

    // 문자 치환
    String p2e = str.replace('p', 'e');
    System.out.println("p2e = " + p2e);

    String dot2slash = str.replaceAll(".","/");
    System.out.println("dot2slash = " + dot2slash);

    String replaceFirst = str.replaceFirst('p', 'e');
    System.out.println("replaceFirst = " + replaceFirst);

    // 문자 동일 여부 판단
    // 자바 스트링의 경우, 클래스라서 Call by reference 형태로 생성 시 주소값 부여
    // String 타입을 선언해서 같은 값을 부여해도 서로간의 주소값이 달라 ==을 사용할 수 없음
    boolean isEqual = str.equals("apple");
    System.out.println("isEqual = " + isEqual);

    // 문자 비교
    System.out.println("str.compareTo(\"applp\") = " + str.compareTo("applp"));

    // 문자 포함 여부 판단
    System.out.println("str.contains(\"app\") = " + str.contains("app"));

    // 문자열 분리
    str.split(" ");

    // 문자 앞뒤 공백 제거
    str.trim();

    // 문자 <-> 숫자 변환
    Integer.parseInt("100");
    Integer.toString(100);
  }
}
