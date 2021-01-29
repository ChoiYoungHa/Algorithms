package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//내일 다시 풀이
public class CodeUp1091 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine());
        int input[] = new int[people]; // 이상한 출석 저장 랜덤
        int result[] = new int[24]; // 저장 출력할 배열

        for (int i = 1; i < result.length; i++) {
            result[i] = 0; // 모든 배열 초기화
        }

        for (int i = 1; i <= input.length; i++) {
            for(int k = 1; k <= 23; k++){
                if(input[i] == k){
                    result[i]++;
                }
            }
        }
        for(int i = 1; i <= 23; i++){
            System.out.println(result[i]);
        }





    }
}
