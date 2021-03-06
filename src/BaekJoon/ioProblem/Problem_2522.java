package BaekJoon.ioProblem;

import java.util.Scanner;

public class Problem_2522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.printf(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.printf("*");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; i >= j; j++) {
                System.out.printf(" ");
            }
            for(int k = n - i; k >= 1 ;k--){
                System.out.printf("*");
            }
            System.out.println();
        }

    }
}
