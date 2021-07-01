package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayRemainder {
    public static void main(String[] args) throws IOException {

        boolean [] num = new boolean[42]; // 사용자에게 받을 값 저장 배열
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            num[Integer.parseInt(br.readLine()) % 42] = true;
        }

        int count = 0;
        for(boolean value : num){
            if(value){
                count++;
            }
        }
        System.out.println(count);
    }
}
