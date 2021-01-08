package array;

import java.io.IOException;
import java.util.Scanner;

public class AvgArray {
    public static void main(String[] args) throws IOException {
        //백준 1546번
        //다른 사람들이 한거 보고 코드 개선해보기!
        //되긴하는데 BufferReder parsInt 오류때문에 Scanner써서 알고리즘 속도가 많이 느리다.
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        float [] score = new float [input];
        float max = 0;
        float [] encore = new float [input];
        float sum = 0;

        for(int i = 0; i < score.length ; i++){
            score[i] = sc.nextFloat();
            if(max < score[i]){
                max = score[i];
            }
        }
        for(int i = 0; i < score.length ; i++){
            encore[i] = (score[i]/max) * 100;
            sum = sum + encore[i];
        }

        System.out.println(sum/input);
    }
}
