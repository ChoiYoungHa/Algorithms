package Infrun.배열;

import java.util.Scanner;


public class 피보나치수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int x:solution(array,n)) {
            System.out.printf(x + " ");
        }
    }

    static int [] solution(int [] array, int n) {
        array[0] = 1;
        array[1] = 1;
        int temp = 0;
        for (int i = 0; i < n-2; i++){
            temp = array[i] + array[i + 1];
            array[i + 2] = temp;
        }

        return array;
    }
}
