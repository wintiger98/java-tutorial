package output;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputBW {

  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String str = "abcdef";

    bw.write(str); // 출력
    bw.newLine(); // 줄바꿈
    bw.flush(); // 남아있는 데이터 모두 출력
    bw.close();
  }
}
