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
        solution(array, n);
    }

    static int solution(int [] [] array, int n) {
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] > answer) {
                    answer = array[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[j][i] > answer) {
                    answer = array[j][i];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < i; j++) {
                if (array[i][j] > answer) {
                    answer = array[i][j];
                }
            }
        }

        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[i][j] > answer) {
                    answer = array[i][j];
                }
            }
        }

        return answer;
    }
}
