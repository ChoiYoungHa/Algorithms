package BaekJoon.ioProblem;

import java.beans.IntrospectionException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String st = br.readLine();
        int hap = 0;

        for (int i = 0; i < num; i++) {
            hap += Integer.valueOf(st.charAt(i)) - '0';
        }
        System.out.println(hap);






    }
}
