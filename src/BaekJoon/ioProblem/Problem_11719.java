package BaekJoon.ioProblem;

import java.io.*;

public class Problem_11719 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String st = "";
        while ((st = br.readLine()) != null) {
            sb.append(st).append("\n");
        }
        br.close();
        System.out.println(sb.toString());

    }
}
