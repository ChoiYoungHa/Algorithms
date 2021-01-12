package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class MaybeAvg {
    public static void main(String[] args) throws IOException {
        // 내일 다시 풀이
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int [] array;
        int num = Integer.parseInt(bf.readLine());

        for(int i =0; i < num; i++){
            st = new StringTokenizer(bf.readLine()," ");
            int n = Integer.parseInt(st.nextToken());
            array = new int [n];
            double hap = 0;
            for(int k = 0; k < array.length; k++){
                array[k] = Integer.parseInt(st.nextToken());
                hap += array[k];
            }

            double avg = hap/n;
            int count = 0;
            for(int j = 0; j < n ; j++){
                if(avg < array[j]){
                    count++;
                }
            }
            System.out.printf(".%3f\n", (count / n) * 100);
        }
    }
}

