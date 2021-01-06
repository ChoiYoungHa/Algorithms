package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) throws IOException {
        int a,b,c = 0;
        int count = 0;
        int result = 0;

        // 버퍼리더를 이용해서 알고리즘 작동시간 단축
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        result = Integer.parseInt(bf.readLine()) * Integer.parseInt(bf.readLine())
    * Integer.parseInt(bf.readLine());
        String str = String.valueOf(result);


        for(int i = 0; i<10; i++){
            count = 0;
            for(int j = 0 ; j < str.length() ;j++){
                if((str.charAt(j) - '0') == i){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
