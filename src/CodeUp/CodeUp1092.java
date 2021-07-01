package CodeUp;

import java.awt.image.DataBufferDouble;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class CodeUp1092 {
    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int result[] = new int[num];

        String[] Sinput = input.split(" ");
        for(int i  = 0; i < Sinput.length; i++){
            result[i] = Integer.valueOf(Sinput[i]);
        }

        for(int i = result.length-1; i >= 0 ; i--){
            System.out.printf("%d ",result[i]);
        }
    }
}
