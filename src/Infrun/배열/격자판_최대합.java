package Infrun.배열;

import java.util.Scanner;

public class 격자판_최대합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int array[][] = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(array, n));
    }

    static int solution(int [] [] array, int n) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;

        for (int i = 0; i < n; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += array[i][j];
                sum2 += array[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        sum1 = 0;
        sum2 = 0;
        for (int i = 0; i < n; i++){
            sum1 += array[i][i];
        }
        for (int j = 0; j < n; j++){
            sum2 += array[j][n - j - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }
}
