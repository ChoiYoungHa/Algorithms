package HowtoMethod;

import java.io.*;

public class HowtoBufferedWrite {
    public static void main(String args []) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = "love you";
        //버퍼 라이터를 사용하기 위해서는 먼저 write로 쓰고 flush로 남은 데이터를 출력해주어야한다.
        //그리고 전부 사용한 후 꼭 닫자.
        bw.write(s);
        bw.flush();
        bw.close();


    }
}
