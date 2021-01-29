package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 접근방법
// 1. 등차수열은 시작값에 차이값을 계속 더한 수열임.
// 2. for문 이용해서 차이값을 계속 더하고 n번째에서 멈추면 됨.
public class CodeUp1088 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] array = input.split(" ");
        long start = Integer.parseInt(array[0]);
        long d = Integer.parseInt(array[1]);
        int n = Integer.parseInt(array[2]);
        int count = 0;

        for(long i = start; ; i = i*d){
            count++;
            if(count == n){
                System.out.println(i);
                break;
            }
        }
    }
}
