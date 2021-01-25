package Infrun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MaxValue {
    public static void main(String[] args) throws IOException {
        //최대값 구하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        getMax(br, num);
    }

    public static void getMax(BufferedReader br, int num) throws IOException {
        int[] array = new int[num];
        int max = 0;

        for(int i = 0 ; i < num ; i++){
            array[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < array.length; i++ ){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("최대값은" + max + "입니다.");
    }
}
