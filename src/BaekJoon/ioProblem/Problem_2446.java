package BaekJoon.ioProblem;

import java.util.Scanner;

public class Problem_2446 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.printf(" ");
            }
            for(int j = 1+i; j <= (n * 2 - 1) - i;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int k = 1; k <= (n - 2) - i;k++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < 3 + (i * 2); j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

}
