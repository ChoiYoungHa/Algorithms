package Infrun.배열;

import java.util.Scanner;

public class 등수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int x : solution(array, n)) {
            System.out.printf(x + " ");
        }
    }

    static int[] solution(int[] array, int n) {
        int answer[] = new int[n];
        for (int i = 0; i < n; i++){
            int rank = 1;
            for (int j = 0; j < n; j++){
                if(array[i] < array[j]){
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }
}
