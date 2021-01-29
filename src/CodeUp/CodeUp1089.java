package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1089 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] array = input.split(" ");
        long start = Integer.parseInt(array[0]);
        long multi = Integer.parseInt(array[1]);
        int plus = Integer.parseInt(array[2]);
        int n = Integer.parseInt(array[3]);
        int count = 0;

        for(long i = start; ;i = (i*(multi)) + plus){
           count++;
           if(n == count){
               System.out.println(i);
               break;
           }
        }



    }
}
