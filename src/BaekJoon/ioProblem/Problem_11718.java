package BaekJoon.ioProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String st;
        while (true) {
            st = br.readLine();
            if(st == null || st.isEmpty()){
                break;
            }
            sb.append(st).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}
