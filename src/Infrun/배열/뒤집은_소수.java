package Infrun.배열;

import java.util.ArrayList;
import java.util.Scanner;

public class 뒤집은_소수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        for (int x: solution(array, num)) {
            System.out.printf(x + " ");
        }
    }


    static ArrayList<Integer> solution(int [] array, int num) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < num; i++){
            int tmp = array[i];
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if(isTrue(res)){
                answer.add(res);
            }
        }
        return answer;
    }

    static boolean isTrue(int num) {
        if(num == 1){
            return false;
        }
        for (int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
