package Infrun.배열;

import java.util.Scanner;


public class 에라토스테네스_체 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int array [] = new int[n + 1];

        System.out.println(solution(array , n));
    }

    // 2중 for문에서 i랑 j가 같아야 배수를 처리한다.
    // 다른방법의 배수 알고리즘
    static int solution(int [] array, int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++){
            if(array[i] == 0){
                answer++;
                for (int j = i; j <= n; j=j+i){
                    array[j] = 1;
                }
            }
        }
        return answer;
    }


}
