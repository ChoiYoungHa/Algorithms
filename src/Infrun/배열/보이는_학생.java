package Infrun.배열;

import java.util.ArrayList;
import java.util.Scanner;

public class 보이는_학생 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int array[] = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(solution(array,num));
    }

    static int solution(int [] array,int num) {
        int answer = 1;
        int max = array[0];
        for (int i = 1; i < num; i++){
            if(array[i] > max){
                answer++;
                max = array[i];
            }
        }
        return answer;
    }
}
