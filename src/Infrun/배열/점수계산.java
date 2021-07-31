package Infrun.배열;

import java.util.Scanner;

public class 점수계산 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println(solution(array, n));
    }

    static int solution(int[] array, int n) {
        int plus = 0;
        int res = 0;
        for (int i = 0; i < n; i++){
            if(array[i] == 0){
                plus = 0;
            }else if(array[i] == 1){
                plus++;
                res += plus;
             }
        }

        return res;
    }


}
