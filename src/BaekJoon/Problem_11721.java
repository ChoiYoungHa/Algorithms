package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Problem_11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String st = br.readLine();

        for (int i = 0; i < st.length(); i++) {
            System.out.printf("%s", st.charAt(i));
            if(i % 10 == 9){
                System.out.println();
            }
        }
    }
}
