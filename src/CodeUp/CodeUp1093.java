package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1093 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int min;

        String[] inputS = input.split(" ");
        min = Integer.parseInt(inputS[0]);
        for(int i = 0; i < num ; i++){
            if(min > Integer.valueOf(inputS[i])){
                min = Integer.valueOf(inputS[i]);
            }
        }
        System.out.println(min);
    }
}
